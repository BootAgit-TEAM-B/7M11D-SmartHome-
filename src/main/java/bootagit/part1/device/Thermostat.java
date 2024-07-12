package bootagit.part1.device;

/**
 * 온도조절기
 */
public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        temperature = 0;
    }

    public void temperatureUp(){
        temperature++;
    }

    public void temperatureDown(){
        temperature--;
    }

    public int getTemperature() {
        return temperature;
    }
}
