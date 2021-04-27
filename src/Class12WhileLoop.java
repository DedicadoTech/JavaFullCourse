import java.util.Scanner;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/27/21
Class12WhileLoop:
*/
public class Class12WhileLoop {
    public static void main(String[] args) {
        //while loop = executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name;

//        while (name.isBlank()){
//            System.out.println("Enter your name");
//            name = scanner.nextLine();
//
//        }
//        System.out.println("Hello "+ name);

        do {
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }while (name.isBlank());
        System.out.println("Hello "+ name);
    }
}
