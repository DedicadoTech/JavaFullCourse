import javax.swing.*;

/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/24/21
Class10Switches:
*/
public class Class10Switches {
    public static void main(String[] args) {
        //switch = statement that allows a variable to be tested for equality agains a list of values
        String day = JOptionPane.showInputDialog("What day is today?");

        switch (day){
            case "sunday":
                System.out.println("Its is sunday!");
                break;
            case "Monday":
                System.out.println("It is monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednasday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("That is not a day");
/*
            switch (day){
                case "sunday":
                    System.out.println("Its is sunday!");

                case "Monday":
                    System.out.println("It is monday!");

                case "Tuesday":
                    System.out.println("It is Tuesday!");

                case "Wednasday":
                    System.out.println("It is Wednesday!");

                case "Thursday":
                    System.out.println("It is Thursday!");

                case "Friday":
                    System.out.println("It is Friday");

                case "Saturday":
                    System.out.println("It is Saturday");

*/
        }

    }
}
