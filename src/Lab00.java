import javax.swing.*;   //to access JFrame and JPanel
import java.awt.*;      //to access Color and Graphics

public class Lab00 {
    public static void main(String[] arg){
        JFrame frame = new JFrame("My Icon");//declare and instantiate a JFrame called frame with title of "My Icon"
        frame.setSize(200,200);//set frame size to 200 by 200, not image size
        frame.setLocation(800,0);//sets top left corner to 800 from left and 0 from top
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets application to close on exit (X button clicked)
        frame.setContentPane(new DrawPanelLab00());//Set the content pane to point at the new custom JPanel class
        frame.setVisible(true);//set the frame to be visible
    }
}

class DrawPanelLab00 extends JPanel {//note: there can only be 1 public class per file
    @Override
    protected void paintComponent(Graphics g) {//invoked when image needs to be repainted
        g.setColor(Color.PINK);//sets the marker to pink
        g.fillRect(0,0,getWidth(),getHeight());//draws rectangle around the dimensions of the panel
        System.out.println("width: "+getWidth()+", height: " + getHeight());//prints to console the width and height
    }
}