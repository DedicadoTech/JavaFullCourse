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

       /* int temp = 25;

        if(temp>30){
            System.out.println("It is hot out");
        }else if(temp>=20 && temp<=30) {
            System.out.println("It is warm outside");
        }else{
                System.out.println("It is cold outside");
            }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();
        //applying boolean table
                    //negative     or  negative == true
            if(response.equals("q") || response.equals("Q")) {
                System.out.println("You quit the game");
            } else {
                System.out.println("You are still playing the game *pew pew*");

            }
    }                   //positive    and         //positive == positive
            /*if (!response.equals("q") && !response.equals("Q")) {
                System.out.println("You are still playing the game *pew pew*");

            } else { //do if  condition == false

                System.out.println("You quit the game");
            }*/
}

