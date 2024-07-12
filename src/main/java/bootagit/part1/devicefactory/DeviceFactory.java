package bootagit.part1.devicefactory;

import bootagit.part1.Device;

public interface DeviceFactory {
    Device createDevice(String type);
}
