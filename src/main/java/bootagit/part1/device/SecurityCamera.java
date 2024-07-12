package bootagit.part1.device;

public class SecurityCamera extends Device {
    private int x;
    private int y;

    public SecurityCamera(String name) {
        super(name);
        x=0;
        y=0;
    }
    public void moveRight(){
        x++;
    }

    public void moveLeft(){
        x--;
    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
