import java.util.Scanner;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/23/21
Class03UserInput:
*/
public class Class03UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name");
        String name = scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("You are "+age+"years old");
    }
}
