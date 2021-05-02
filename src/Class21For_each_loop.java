import java.util.ArrayList;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 5/1/21
Class21For_each_loop:
*/
public class Class21For_each_loop {
    public static void main(String[] args) {
        //for-each =    traversing technique to iterate through the elements in an array/collection
        //              less steps, more readable
        //              less flexible

        //String[] animals = {"cat","dog","rat","bird"};

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");


        for (String i : animals){
            System.out.print(i +", ");
        }
    }
}
