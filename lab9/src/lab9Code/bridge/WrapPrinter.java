package lab9Code.bridge;

public class WrapPrinter extends DrawingService {

    private Printer printer;

    public WrapPrinter(){
        this.printer = Printer.getPrinter();
    }
    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        printer.drawline(x1,y1,x2,y2);
    }

    @Override
    public void drawPixel(int x, int y) {
        printer.drawPixel(x,y);
    }

    @Override
    public void drawCircle(int x, int y, int r) {
        printer.drawcircle(x,y,r);
    }
}
