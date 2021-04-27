import java.util.Scanner;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/27/21
Class14NestedLoops:
*/
public class Class14NestedLoops {
    public static void main(String[] args) {
        // Nested loops =  a loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.println("Enter of rows");
        rows = scanner.nextInt();
        System.out.println("Enter of columns");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol =  scanner.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
