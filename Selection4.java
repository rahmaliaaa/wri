package WRI;
import java.util.Scanner;
public class Selection4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double number1, number2, result;
    char operator;
    System.out.print("Enter the first number : ");
    number1 = input.nextDouble();
    System.out.print("Enter the second number: ");
    number2 = input.nextDouble();
    System.out.print("Enter an operator (+ - * /):");
    operator = input.next().charAt(0);

    switch (operator){
        case '+':
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
            break;
        case '-':
            result = number1 - number2;
            System.out.println(number1 + "-" + number2 + "=" + result);
            break;
        case '*':
            result = number1 * number2;
            System.out.println(number1 + "*" + number2 + "=" + result);
        case '/': 
            result = number1 / number2;
            System.out.println(number1 + "/" + number2 + "=" +result); 
            break;
        default:
            System.out.println(" The operator you entered is wrong");         

    }

}
}
