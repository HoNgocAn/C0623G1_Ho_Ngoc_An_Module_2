package ss6_Kethua.Bai_tap.Exersise3;

public class Point {
    private float x;
    private float y;

    public Point(){

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public void getX(float x){
        this.x = x;
    }
    public float getY() {

        return y;
    }
    public void setY(){
        this.y = y;
    }
    public float [] getXY(){
        float []arrayXY = {getX(),getY()};
        return arrayXY;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point with x = " + getX() + "and y = " + getY();
    }
}
