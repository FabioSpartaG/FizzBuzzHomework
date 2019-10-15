import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {

    public static String fizzBuzz(int range){

        String[] fizzBuzz = new String[range];
        for(int i = 1; i <= range; i++){
            if(i % 15 == 0){
                fizzBuzz[i-1] = "FizzBuzz";
            }
           else if(i % 3 == 0){
                fizzBuzz[i-1] = "Fizz";
            }
           else if(i % 5 == 0){
                fizzBuzz[i-1] = "Buzz";
            }
           else {
                fizzBuzz[i-1] = String.valueOf(i);
            }
        }
        return Arrays.toString(fizzBuzz);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = input.nextInt();
        System.out.println(fizzBuzz(range));
    }
}
