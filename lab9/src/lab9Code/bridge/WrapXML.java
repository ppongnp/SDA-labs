package lab9Code.bridge;

public class WrapXML extends DrawingService {
    private XML xml;

    public WrapXML(){
        this.xml = XML.getXML();
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        xml.drawline(x1,y1,x2,y2);
    }

    @Override
    public void drawPixel(int x, int y) {
        xml.drawPixel(x,y);
    }

    @Override
    public void drawCircle(int x, int y, int r) {
        xml.drawcircle(x,y,r);
    }
}
