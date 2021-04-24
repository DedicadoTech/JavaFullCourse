/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/24/21
Class09IF_Statements:
*/
public class Class09IF_Statements {
    public static void main(String[] args) {
        //if statement = performs a block of code if it's condition evalues to be true

        int age = 14;

        if(age>= 75) {
            System.out.println("Ok boomer!");
        }else if(age>=18) {
            System.out.println("you are an adult");
        }else if(age>=13){
            System.out.println("you are a teenager!");
        }else {
            System.out.println("you are not an adult!");
        }

    }
}
