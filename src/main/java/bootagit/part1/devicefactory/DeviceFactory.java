package bootagit.part1.devicefactory;

import bootagit.part1.device.Device;

public interface DeviceFactory {
    Device createDevice(String type);
}
