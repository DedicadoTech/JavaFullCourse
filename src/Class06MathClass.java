import java.util.Scanner;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/24/21
Class06MathClass:
*/
public class Class06MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;
        double g = 10;
        double z = Math.max(x, y);
        System.out.println(z);

        double m = Math.min(x,y);
        System.out.println(m);

        double a = Math.abs(y);//absolute number of -10
        System.out.println(a);

        double b = Math.sqrt(g); //square root of the argument
        System.out.println(b);

        double c = Math.round(x); //round of x
        System.out.println(c);

        double d = Math.ceil(x);//4.0
        double e = Math.floor(x);//result 3.0
        System.out.println("ceil: "+d+" floor: "+e);
        hypotenuse();
    }

    public static void hypotenuse(){
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y)); //calculate hypotenuse
        System.out.println("The hypotenuse is: "+z);
        scanner.close();
    }
}
