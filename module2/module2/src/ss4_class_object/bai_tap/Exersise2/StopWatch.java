package ss4_class_object.bai_tap.Exersise2;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){

    }

    public long getStartTime() {return this.startTime;}

    public long getEndTime() {return this.endTime;}
    public void start(){

        this.startTime = System.currentTimeMillis();
    }
    public void stop(){

        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
