import java.util.Arrays;
import java.util.Scanner;

class playArray {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // basic declaration of array
        int[] roll_numbers =  new int[7];
        // this is basically defined in the stack , the name : roll_numbers

        // roll_numbers[0] = 3;
        // this is now declared in the heap memory

        System.out.println(Arrays.toString(roll_numbers));


         String[] roll_numes =  new String[7];
        // this is basically defined in the stack , the name : roll_numbers

        // roll_numbers[0] = 3;
        // this is now declared in the heap memory

        System.out.println(roll_numes[0]); //output is null

        // Getting user input in loops
        int[] arr = new int[4];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}