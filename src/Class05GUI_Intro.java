/*JavaFullCourse
@author DAVI DE SOUZA SILVA
@since 4/24/21
Class05GUI_Intro:
*/
import  javax.swing.JOptionPane;
public class Class05GUI_Intro {
    public static void main(String[] args) {
        //GUI = Graphical User Interface
        //Class //Variable //Class.Method(object, message)
         String name =  JOptionPane.showInputDialog("Enter Your name");
         JOptionPane.showMessageDialog(null, "Hello " +name);

         //for receive Integer number
         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are " +age+ " year old");

        //for receive Double value
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you age"));
        JOptionPane.showMessageDialog(null, "you are "+height+" cm tall");

    }
}
