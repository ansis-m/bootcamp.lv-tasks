import java.util.Random;

public class Array {

    public static class Arr{

        static int[] array = new int[4];

        static{
            Random rand = new Random();
            for(int i = 0; i < 4; i++)
                array[i] = rand.nextInt();
        }

        static int value(int index){
            return array[index];
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[4];
        for(int i = 0; i < 4; i++)
            arr[i] = Arr.value(i);

        System.out.println("Generated 4 random numbers, stored in an array and copied to another array.");
        System.out.println("The numbers are:" + arr[0] + ", " + arr[1] + ", " + arr[2] + " and " + arr[3]);
    }
}
