package lab9Code.bridge;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class XML extends JComponent {
    private static XML xml;

    public static XML getXML(){
        if( xml == null){
            xml = new XML();
        }
        return xml;
    }
    private List<Arc> arcs;
    private List<Line> lines;
    private List<Dot> dots;
    private JFrame frame;

    private XML(){
        super();

        frame = new JFrame("XML");
        frame.setSize(400, 400);
        frame.setLocation(1000, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( this );

        arcs  = new LinkedList<Arc>();
        lines = new LinkedList<Line>();
        dots = new LinkedList<Dot>();

        frame.setVisible(true);
    }

    public synchronized void drawline(int x1, int x2, int y1, int y2) {
        lines.add(new Line(x1, y1, x2, y2));
        repaint();
    }
    public synchronized void drawPixel(int x,int y){
        dots.add(new Dot(x,y));
        repaint();
    }

    public synchronized void drawcircle(int x, int y, int r) {
        arcs.add(new Arc(x, y, r));
    }

    public synchronized void paint(Graphics g) {
        g.setColor(Color.BLACK);
        for (Line line : lines) {
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }

        for (Arc arc : arcs) {
            g.drawArc(arc.x, arc.y, arc.r*2, arc.r*2, 0, 360);
        }
        for (Dot dot:dots){
            g.drawLine(dot.x,dot.y,dot.x,dot.y);
        }
    }

}

