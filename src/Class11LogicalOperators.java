import java.util.Scanner;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/24/21
Class11LogicalOperators:
*/
public class Class11LogicalOperators {
    public static void main(String[] args) {
        //logical operator = used  to connect two or more expressions
        //
        //      && = (AND) both conditions must be true
        //      || = (Or) either conditions must be true
        //      !  = (Not) reveres boolean value of a condition

        int temp = 25;

        if(temp>30){
            System.out.println("It is hot out");
        }else if(temp>=20 && temp<=30) {
            System.out.println("It is warm outside");
        }else{
                System.out.println("It is cold outside");
            }
        }
}

