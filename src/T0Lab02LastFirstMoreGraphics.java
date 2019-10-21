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
        g.translate(100, 0);                       //moves origin right 100, down 0;
        //(100,0) is now the new origin (all coordinates count from (100,0))
        g.drawPolygon(xPoints, yPoints, xPoints.length);  //closes the points by connecting last point to first point
        g.translate(-100, 0);                      //restores the origin to the top left corner
        Graphics2D g2D = (Graphics2D) g;            //down cast to Graphics2D
        g2D.setStroke(new BasicStroke(8.0f));     //set stroke width
                                                    // NOTE:Only lines after this point will reflect change
        //draw3DRect(int xTopLeft, int, yTopLeft, int width, int height, boolean raised);
        g2D.fill3DRect(50, 100, 75, 60, false);
        //drawRoundRect(int xTopLeft, int yTopLeft, int width, int height, int arcWidth, int arcHeight)
        g2D.drawRoundRect(200, 100, 75, 60, 100, 35);
        g2D.drawOval(getWidth() / 2 - 25, getHeight() / 5, 50, 70);        //draw an oval
    }
}
