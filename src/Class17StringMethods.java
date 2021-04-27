import java.util.Locale;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/27/21
Class17StringMethods:
*/
public class Class17StringMethods {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more character
        //          reference data types access to useful methods

        String name = "    Otavio    ";

        // boolean result = name.equals("Davi");
        //  boolean result = name.equalsIgnoreCase("otavio");
        // int result = name.length();
        //char result = name.charAt(2);
        //int result = name.indexOf("o");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace('O', 'A');


        System.out.println(result);


    }
}
