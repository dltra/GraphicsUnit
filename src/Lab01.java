import javax.swing.*;
import java.awt.*;

public class Lab01 {
    public static void main(String[] arg){
        JFrame frame = new JFrame("My Icon");//declare and instantiate a JFrame called frame with title of "My Icon"
        frame.setSize(816,488);//set frame size to 200 by 200, not image size
        frame.setLocation(800,0);//sets top left corner to 800 from left and 0 from top
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets application to close on exit (X button clicked)
        frame.setContentPane(new DrawPanelLab01());//Set the content pane to point at the new custom JPanel class
        frame.setVisible(true);//set the frame to be visible
    }
}
class DrawPanelLab01 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.PINK);
        g.fillRect(0,0, getWidth()-1, getHeight()-1);
        int[] xPoints = {0,100,200};//array of x-coordinates
        int[] yPoints = {50, 0, 190};//array of y-coordinates
        g.setColor(Color.orange);
        g.fillPolygon(xPoints, yPoints, xPoints.length);//draw filled polygon shape pairing x- and y-coordinates
    }
}