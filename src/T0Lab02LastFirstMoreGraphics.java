import javax.swing.*;
import java.awt.*;

public class T0Lab02LastFirstMoreGraphics  {
    public static void main(String[] args) {   //declares and instantiates a new JFrame
        JFrame frame = new JFrame("T#Lab02LastFirst More Graphics");
        frame.setSize(816, 488);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DrawPanelLab02());
        frame.setVisible(true);
    }
}
class DrawPanelLab02 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);      // calls parent's version of paintComponent(), fill the JPanel's bg
        setBackground(new Color(100, 100, 100));// set background color
        g.setColor(new Color(0, 255, 0));//set custom color, google "color picker" to get RGB values
        //array of x-coordinates:  left, middle, right
        int[] xPoints = {100, 200, 275};
        //array of y-coordinates:  left, middle, right
        int[] yPoints = {50, 75, 50};
        //drawPolyline(int[] xPoints, int[] yPoints, int numPoint);  draw polygon with numPoint sides
        //notice:  xPoints.length returns the number of elements in xPoints
        g.drawPolyline(xPoints, yPoints, xPoints.length);
        //or use anonymous array
        //g.drawPolyline(new int[]{100, 200, 275}, new int[]{50, 75, 50}, xPoints.length);
    }
}
