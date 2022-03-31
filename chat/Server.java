import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args){
        final ServerSocket serverSocket ;
        final Socket clientSocket ;
        final ServerSocket serverSocket1 ;
        final Socket clientSocket1 ;
        final BufferedReader in;
        final PrintWriter out;
        final BufferedReader in1;
        final PrintWriter out1;
        final Scanner sc=new Scanner(System.in);
        final Scanner sc1=new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(5000);
            serverSocket1 = new ServerSocket(5001);
            clientSocket = serverSocket.accept();
            clientSocket1 = serverSocket1.accept();
            out = new PrintWriter(clientSocket.getOutputStream());
            out1 = new PrintWriter(clientSocket1.getOutputStream());
            in = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));
            in1 = new BufferedReader (new InputStreamReader(clientSocket1.getInputStream()));

            Thread sender= new Thread(new Runnable() {
                String msg; //variable that will contain the data written by the user
                @Override   // annotation to override the run method
                public void run() {
                    while(true){
                        msg = sc.nextLine(); //reads data from user's keyboard
                        if(msg.startsWith("1")){
                            out.println("to the first client:" + msg);    // write data stored in msg in the clientSocket
                            out.flush();   // forces the sending of the data
                        }
                        else if(msg.startsWith("2")){
                            out1.println("to the second client: " + msg);    // write data stored in msg in the clientSocket
                            out1.flush();   // forces the sending of the data
                        }
                        else{
                            out.println("to both clients: " + msg);
                            out.flush();
                            out1.println("to both clients: " + msg);
                            out1.flush();
                        }
                    }
                }
            });
            sender.start();

            Thread receive= new Thread(new Runnable() {
                String msg ;
                @Override
                public void run() {
                    try {
                        msg = in.readLine();
                        //tant que le client est connecté
                        while(!msg.equals("terminate")){
                            System.out.println("Client : "+msg);
                            msg = in.readLine();
                        }

                        System.out.println("client disconnected");

                        out.close();
                        clientSocket.close();
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receive.start();


            Thread receive1= new Thread(new Runnable() {
                String msg1 ;
                @Override
                public void run() {
                    try {
                        msg1 = in1.readLine();
                        while(!msg1.equals("terminate")){
                            System.out.println("Second client : " + msg1);
                            msg1 = in1.readLine();
                        }

                        System.out.println("Second client disconnected");

                        out1.close();
                        clientSocket1.close();
                        serverSocket1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receive1.start();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
