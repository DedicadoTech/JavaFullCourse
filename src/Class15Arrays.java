/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/27/21
Class15Arrays:
*/
public class Class15Arrays {
    public static void main(String[] args) {
        //array = used to store multiple values in a single variable

//        String[] cars = {"Camaro","Corvette","Tesla","BMW"};//starts at 0 and finish in 3
//
//        cars[0] = "Mustang";
//
//        System.out.println(cars[0] + " "+ cars[1] +" "+ cars[2] +" "+cars[3]);

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

//        for(int i=0; i<cars.length; i++){
//            System.out.print(cars[i]+" ");
//        }
        for (String car : cars) { //replace with enhanced for using ternary operator
            System.out.print(car + " ");
        }
    }
}
