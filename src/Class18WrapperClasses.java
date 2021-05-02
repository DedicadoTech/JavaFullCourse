/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 5/1/21
Class18WrapperClasses:
*/
public class Class18WrapperClasses {
    public static void main(String[] args) {

        // wrapper class = provides a way yo use primitive data types as reference data types
        //                 reference data types contain usefull methods
        //                 can be used with collection (ex.ArrayList)

        //primitive     //wrapper
        //
        //boolean       Boolean
        //char          Character
        //int           Integer
        //double        Double

        //autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        //unboxing   = the reverse of autoboxing. Automatic conversation of wrapper class to primitive

        //autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.12;
        String e = "Bro";
        //unboxing
        if(b=='@'){
            System.out.println("This is true");
        }



    }
}
