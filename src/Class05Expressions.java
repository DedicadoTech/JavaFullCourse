/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/23/21
Class05Expressions:
*/
public class Class05Expressions {
    public static void main(String[] args) {
        //expressions = operands & Operators
        //operands = values, variables, numbers, quantity
        //operators = + - * / %

        int friends = 10;

        friends--;
        System.out.println(friends); friends = 10;
        friends = friends +1;
        System.out.println(friends); friends = 10;
        friends = friends *2;
        System.out.println(friends); friends = 10;
        friends = friends / 2;
        System.out.println(friends); friends = 10;
        friends = friends % 3;
        System.out.println(friends); friends = 10;
        friends++;
        System.out.println(friends); friends = 10;

        double friend;
        friend = (double) friends /3; //casting;
        System.out.println(friend);
    }
}
