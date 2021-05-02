/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 5/1/21
Class22Methods:
*/
public class Class22Methods {
    public static void main(String[] args) {


        //method = a block of code that is execute whenever it is called uppon
//
//        String name = "Davi";
//        int age = 21;
//        hello(name,age);

        int x = 3;
        int y = 4;

//        int z = add(x,y);
//        System.out.println(z);
        System.out.println(add(x,y));
    }
//    //new method
//    static void hello(String name, int age){
//        System.out.println("Hello "+name);
//        System.out.println("you are "+age);
//
//    }
    //new method sum
    static int add(int x, int y){
        int z = x +y;

        return z;
    }
}
