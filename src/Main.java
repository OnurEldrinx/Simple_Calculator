import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int number1,number2,choice;
        double result;



        String operationMenu = "****************\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n****************\n";

        System.out.println(operationMenu);

        System.out.print("\nChoose an operator: ");
        choice = keyboard.nextInt();

        switch (choice){

            case 1:

                System.out.print("Enter the first number:");
                number1 = keyboard.nextInt();
                System.out.print("Enter the second number:");
                number2 = keyboard.nextInt();

                result = number1 + number2;

                System.out.println(number1 + " + " + number2 + " = "+ result);

                break;

            case 2:

                System.out.print("Enter the first number:");
                number1 = keyboard.nextInt();
                System.out.print("Enter the second number:");
                number2 = keyboard.nextInt();

                result = number1 - number2;

                System.out.println(number1 + " - " + number2 + " = "+ result);



                break;


            case 3:

                System.out.print("Enter the first number:");
                number1 = keyboard.nextInt();
                System.out.print("Enter the second number:");
                number2 = keyboard.nextInt();

                result = number1 * number2;

                System.out.println(number1 + " * " + number2 + " = "+ result);

                break;

            case 4:

                System.out.print("Enter the first number:");
                number1 = keyboard.nextInt();
                System.out.print("Enter the second number:");
                number2 = keyboard.nextInt();

                result = (double) number1 / (double) number2;

                System.out.println(number1 + " / " + number2 + " = "+ result);

                break;

            default:

                System.out.println("--> Wrong Input\n--> Valid Input Range: 1 to 4");
                System.out.println("--> Try Again");

                break;


        }

    }
}
