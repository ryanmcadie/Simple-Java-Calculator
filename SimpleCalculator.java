import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        char operator;
        Double num1, num2, result;

        //create an object of class Scanner
        Scanner input = new Scanner(System.in);

        //ask for user for operator
        System.out.println("Enter one of the following: + , - , * , or /");
        operator = input.next().charAt(0);

        //ask user to enter numbers
        System.out.println("Enter your first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter your second number: ");
        num2 = input.nextDouble();

        //use a switch case to determine the appropriate action
        switch(operator){

            //addition case
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            //subtraction case
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            
            //multiplication case
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            
            //division case
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            
            default:
                System.out.println("Invalid Operator!");
                break;
        }
        input.close();
    }
}