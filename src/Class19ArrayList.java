import java.util.ArrayList;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 5/1/21
Class19ArrayList:
*/
public class Class19ArrayList {
    public static void main(String[] args) {

        // ArrayList =  a resizable array.
        //              Elements can be added and removed after compilation phase
        //              Store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "Sushi");
        food.remove(2);
        //food.clear();

        for (String s : food) {
            System.out.print(s +" ");
        }

    }
}
