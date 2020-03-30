package lab9Code.bridge;


import java.util.LinkedList;
import java.util.List;

public class Test {

  public static void main(String[] args) throws InterruptedException {

    List<Shape> shapes = new LinkedList<Shape>();

    shapes.add(new Rectangle(10, 10, 100, 100));
    shapes.add(new Rectangle(110, 110, 200, 200));
    shapes.add(new Circle(250, 250, 30));
    int[] x = {10,50,90,120,150,170};
    int[] y = {170,150,120,90,50,10};
    shapes.add(new Polygon(6,x,y));

    for (Shape s : shapes) {
      s.draw();
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.setDrawingService(new WrapPrinter());
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.draw();
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.setDrawingService(new WrapXML());
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.draw();
    }

  }
}
