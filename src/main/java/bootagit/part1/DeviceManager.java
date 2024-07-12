package bootagit.part1;

import bootagit.part1.devicefactory.DeviceFactory;

/**
 * 싱글톤 패턴으로 구현
 * 정적 멤버와 Lazy Holder (중첩 클래스) (인강 내용상 5번)
 */
public class DeviceManager {
    private final DeviceFactory deviceFactory;

    private DeviceManager(DeviceFactory deviceFactory) {
        this.deviceFactory = deviceFactory;
    }

    private static class DeviceManagerHolder{
        private static final DeviceManager DEVICE_MANAGER_INSTANCE = new DeviceManager();
    }

    public static DeviceManager getInstance(){
        return DeviceManagerHolder.DEVICE_MANAGER_INSTANCE;
    }


}
