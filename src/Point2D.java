public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructors
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    // Get and set x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Get and set y

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Get and set x, y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arrayXY = {this.x, this.y};
        return arrayXY;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
