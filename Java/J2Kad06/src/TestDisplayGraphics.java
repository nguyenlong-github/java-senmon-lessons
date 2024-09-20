import java.awt.*;
import java.awt.Canvas;
import javax.swing.JFrame;

public class TestDisplayGraphics extends Canvas {


    public void paint(Graphics g) {
//        g.drawString("Hello",40,40);
//        setBackground(Color.WHITE);
//        g.fillRect(130, 30,100, 80);
//        g.drawOval(30,130,50, 60);
//        setForeground(Color.RED);
//        g.fillOval(130,130,50, 60);
//        g.drawArc(30, 200, 40,50,90,60);
//        g.fillArc(30, 130, 40,50,180,40);
        g.drawLine(10 , 17 ,30 ,17);
        g.drawLine(30 , 17 ,20 ,2);
        g.drawLine(20 , 2 ,10 ,17);

    }
    public static void main(String[] args) {
        TestDisplayGraphics m=new TestDisplayGraphics();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(40,20);
        //f.setLayout(null);  
        f.setVisible(true);
    }

}  