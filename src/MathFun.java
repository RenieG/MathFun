import java.util.Scanner;

public class MathFun{

    //Create a method for addition
    //Create a method for subtraction
    //Store the chosen operation in an int
    //Store both numbers in ints
    //If chosen operation happens to be 1 do addition otherwise do subtraction if operation number is 2

    public static int add (int x, int y){
        return x + y;
    }

    public static int subtract (int x, int y){
        return x-y;
    }

    public static void main(String [] args) {


        int operation, userNum1, userNum2, result;


        System.out.println("Please enter which operation you want to perform (1. Addition OR 2. Subtraction:");

        Scanner userinput = new Scanner(System.in);
        operation = userinput.nextInt();

        if (operation == 1){
            System.out.println("Enter the first number:");
            userNum1 = userinput.nextInt ();
            System.out.println("Enter the second munber:");
            userNum2 = userinput.nextInt();
            result = add (userNum1, userNum2);
            System.out.println("The result is:" + result);

        } else if (operation ==2){
            System.out.println("Enter the first number:");
            userNum1 = userinput.nextInt ();
            System.out.println("Enter the second munber:");
            userNum2 = userinput.nextInt ();
            result = subtract (userNum1, userNum2);
            System.out.println("The result is:" + result);
        }

    }
}







