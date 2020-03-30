package lab9Code.bridge;

public class Polygon extends Shape {
    protected int[] x;
    protected int[] y;
    protected int angle_num;

    public Polygon(int side,int[] x,int[] y){
        super(x[0],y[0]);
        this.angle_num = side;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        for(int i = 0;i <angle_num -1;i++ ){
            draw.drawLine(x[i],y[i],x[i+1],y[i+1]);
        }
        draw.drawLine(x[0],y[0],x[angle_num-1],y[angle_num-1]);
    }
}
