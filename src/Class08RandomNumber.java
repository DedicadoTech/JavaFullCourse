import java.util.Random;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/24/21
Class08RandomNumber:
*/
public class Class08RandomNumber {
    public static void main(String[] args) {
        //
        Random random = new Random();

        //int x = random.nextInt(6)+1-6;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println(y);
        System.out.println(z);


    }
}
