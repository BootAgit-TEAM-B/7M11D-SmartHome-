package bootagit.part1.device;

public abstract class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
        selected(name);
    }

    public void selected(String name){
        System.out.println(name+"을 선택하였습니다.");
    }
}
