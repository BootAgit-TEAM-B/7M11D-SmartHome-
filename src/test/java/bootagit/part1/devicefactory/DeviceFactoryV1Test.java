package bootagit.part1.devicefactory;

import static org.junit.jupiter.api.Assertions.*;

import bootagit.part1.device.Device;
import bootagit.part1.device.SecurityCamera;
import bootagit.part1.device.SmartLight;
import bootagit.part1.device.Thermostat;
import org.junit.jupiter.api.Test;

class DeviceFactoryV1Test {

    private final DeviceFactory deviceFactory = new DeviceFactoryV1();

    @Test
    void device_정상선택(){
        Device securitycamera = deviceFactory.createDevice("SECURITYCAMERA");
        assertEquals(securitycamera.getClass(), SecurityCamera.class);

        Device smartlight = deviceFactory.createDevice("SMARTLIGHT");
        assertEquals(smartlight.getClass(), SmartLight.class);

        Device thermostat = deviceFactory.createDevice("THERMOSTAT");
        assertEquals(thermostat.getClass(), Thermostat.class);
    }

    @Test
    void device_비정상_선택시_null반환(){
        Device qwer = deviceFactory.createDevice("qwer");
        assertNull(qwer);

        Device device = deviceFactory.createDevice(null);
        assertNull(device);
    }
}