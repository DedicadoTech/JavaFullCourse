package Excercise;

//import session
import java.util.Scanner;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/24/21
Calculator: simple calculator using CLI interface
*/
public class Calculator {
    public static void main(String[] args) {
        String operator = "";
        int n2, n1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("type the operator(+,-,*,/)");
        operator = scanner.nextLine();
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            System.out.println("Enter a value ");
            n1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter a value value: ");
            n2 = Integer.parseInt(scanner.nextLine());
            if (operator.equals("+"))
                System.out.println("Resulted: "+ (n1+n2));
            else if(operator.equals("-")){
                System.out.println("Resulted: "+ (n1-n2));
            }else if(operator.equals("*")){
                System.out.println("Resulted: "+ (n1*n2));
            }else if(operator.equals("/")){
                System.out.println("Resulted: "+ (n1/n2)); //build casting
            }
        } else {


            System.out.println("Invalid operator");
            System.exit(1);
        }
    }
}//end of code
