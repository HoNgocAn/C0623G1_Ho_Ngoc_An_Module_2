package ss6_Kethua.Bai_tap.Exersise2;

public class Point3D extends Point2D{
    private float z;

    private float[] arr1 = {3};

    public Point3D(){
    }
    public Point3D(float z){
        this.z = z;
    }
    public Point3D(float z, float x, float y){
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }


    public float[] getXYZ() {
        return arr1 = new float[]{getX(), getY(),getZ()};
    }
    public void setXYZ(float x, float y, float z) {
        this.setXY(x,y);
        this.setZ(z);
    }
    @Override
    public String toString() {
        return  "Point3D with z = " + getZ() + ", which is a subclass of " + super.toString();
    }
}
