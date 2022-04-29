public class Point {
    private int x, y;
    private int xy;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXY() {
        int xy = 0;
        return xy;
    }

    public int setx(int x) {
        return this.x;
    }

    public int sety(int y) {
        return this.y;
    }

    public int setXY(int x, int y) {
        return this.xy;
    }

    public String toString() {
        return "LineSub[begin=" + super.toString() ;
    }

    /*public int getBeginXY() {
        return xy;
    }
    */


    public double getLength() {
        return 0;
    }
}
