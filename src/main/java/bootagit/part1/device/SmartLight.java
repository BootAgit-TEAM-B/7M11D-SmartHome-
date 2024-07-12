package bootagit.part1.device;

public class SmartLight extends Device {
    private int light;

    public SmartLight(String name) {
        super(name);
        light=0;
    }

    public void brighter(){
        light++;
    }

    public void darker(){
        light--;
    }

    public int getLight() {
        return light;
    }
}
