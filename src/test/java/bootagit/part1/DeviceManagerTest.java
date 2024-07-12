package bootagit.part1;

import static org.junit.jupiter.api.Assertions.*;

import bootagit.part1.devicefactory.DeviceFactory;
import bootagit.part1.devicefactory.DeviceFactoryV1;
import org.junit.jupiter.api.Test;

class DeviceManagerTest {
    private final DeviceFactory deviceFactory = new DeviceFactoryV1();

    @Test
    void 싱글톤패턴_확인(){
        DeviceManager instance = DeviceManager.getInstance(deviceFactory);
        DeviceManager instance1 = DeviceManager.getInstance(deviceFactory);
        assertEquals(instance1,instance);
    }
}