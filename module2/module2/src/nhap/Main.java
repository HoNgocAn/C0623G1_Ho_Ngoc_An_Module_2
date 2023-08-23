package nhap;

public class Main {
    protected String name;
    private int age;
    private float weight;
    private String color;
    private String eyesColor;

    public Main (String name){
        this.name = name;
    }
    public Main(String name, int age, float weight, String color){
        this(name);

    }
    public  String getName(){
       return name ;
    }

    public void setName(String name){
        this.name = name;
    }
    public void speak(){

    }
    public void move(){
        System.out.println(name + " is running");

    }
    public void sleep(){

    }
    public void eat(){
        System.out.println(name + " eat fish");
    }

}


