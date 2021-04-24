/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/23/21
Class03SwapTwoClass:
*/
public class Class03SwapTwoClass {
    public static void main(String[] args) {

        String x = "water";
        String y = "kool-AID";
        String temp = null;
        System.out.println("x :"+x);
        System.out.println("y :"+y);
        System.out.println("temp :"+ temp);
        temp = x; //temp get value x
        x = y; //x get value temp
        y = temp; //y get value temp

        System.out.println("x :"+x);
        System.out.println("y :"+y);
        System.out.println("temp :"+temp);
    }
}
