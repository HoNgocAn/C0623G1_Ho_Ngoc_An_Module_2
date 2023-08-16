package ss6_kethua.bai_tap.Exersise3;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float []array1 = new float[]{getxSpeed(),getySpeed()};
        return array1;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "Moveable with xSpeed = " + getxSpeed() + " and ySpeed = " + getySpeed() + ", which is a subclass of " + super.toString();
    }
    public MoveablePoint move(){
        super.setX(super.getX() + this.getxSpeed());
        super.setY(super.getY() + this.getySpeed());
        return this;
    }
}
