package bootagit.part1.devicefactory;

import bootagit.part1.device.Device;
import bootagit.part1.device.DeviceType;
import bootagit.part1.device.SecurityCamera;
import bootagit.part1.device.SmartLight;
import bootagit.part1.device.Thermostat;

public class DeviceFactoryV1 implements DeviceFactory {

    public DeviceFactoryV1() {
    }

    @Override
    public Device createDevice(String type) {
        return selectDevice(type);
    }

    private Device selectDevice(String type){
        if (type == null) {
            return null;
        }

        try{
            DeviceType deviceType = DeviceType.valueOf(type);
            switch (deviceType){
                case SMARTLIGHT -> {
                    return new SmartLight(deviceType.name());
                }
                case SECURITYCAMERA -> {
                    return new SecurityCamera(deviceType.name());
                }
                case THERMOSTAT -> {
                    return new Thermostat(deviceType.name());
                }
            }
        }catch (IllegalArgumentException e){
            return null;
        }
        return null;
    }
}
