package bootagit.part1;

public enum Device {
    TV,
    SMARTPHONE,
    REFRIGERATOR;

    public static Device getDevice(String deviceName){
        if (deviceName == null) {
            return null;
        }
        try {
            return Device.valueOf(deviceName);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
