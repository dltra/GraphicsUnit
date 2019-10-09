import javax.swing.*;   //to access JFrame class

public class Lab00 {
    public static void main(String[] arg){
        JFrame frame = new JFrame("My Icon");//declare and instantiate a JFrame called frame with title of "My Icon"
        frame.setSize(200,200);//set frame size to 200 by 200, not image size
        frame.setLocation(800,0);//sets top left corner to 800 from left and 0 from top
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets application to close on exit (X button clicked)
        frame.setVisible(true);//set the frame to be visible
    }
}
