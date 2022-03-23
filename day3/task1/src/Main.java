import java.util.Scanner;

public class Main {

    static class Table {

        private int[][] table = new int[10][10];

        Table() {
            for (int i = 0; i < 10; i++)
                for (int j = 0; j < 10; j++)
                    table[i][j] = (i + 1) * (j + 1);
        }

        int result(int a, int b){
            return table[a - 1][b - 1];
        }
    }

    public static void main(String[] args) {

        int a;
        int b;
        Table table = new Table();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number 1...10 to multiply!");
            try{
                a = scanner.nextInt();
                if(a > 0 && a < 11)
                    break;
                System.out.println("The number should be in the range 1...10");
            }
            catch(java.util.InputMismatchException e){
                System.out.println("Wrong input!");
                scanner.next();
            }
        }

        while(true){
            System.out.println("Enter a second number 1...10 to multiply!");
            try{
                b = scanner.nextInt();
                if(b > 0 && b < 11)
                    break;
                System.out.println("The number should be in the range 1...10");
            }
            catch(java.util.InputMismatchException e){
                System.out.println("Wrong input!");
                scanner.next();
            }
        }

        System.out.println(a + " multiplied by " + b + " equals " + table.result(a, b));
    }
}
