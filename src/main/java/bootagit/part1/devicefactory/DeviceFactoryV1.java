package bootagit.part1.devicefactory;

import bootagit.part1.Device;

public class DeviceFactoryV1 implements DeviceFactory {

    @Override
    public Device createDevice(String type) {
        return Device.getDevice(type);
    }
}
