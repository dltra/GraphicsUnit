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
        drawIcon(0,50,g);
        drawIcon(180,200,g);
        drawIcon(19, 250, 100, 100, g);
        drawIcon(200, 150, 500, 100, g);
    }
    public void drawIcon(int x, int y, Graphics g){
        int[] xPoints = {x+0,x+100,x+200};//array of x-coordinates with respect to x
        int[] yPoints = {y+50, y+0, y+190};//array of y-coordinates with respect to y
        g.setColor(Color.orange);
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
    public void  drawIcon(int x, int y, int w, int h, Graphics g){
        g.setColor(Color.red);
        g.fillRect(x, y, w, h/4);
        g.setColor(Color.WHITE);
        g.fillRect(x, y + h * 3/4, w, h/4);
    }
}