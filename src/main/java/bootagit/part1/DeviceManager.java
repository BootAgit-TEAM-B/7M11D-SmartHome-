package bootagit.part1;

import bootagit.part1.devicefactory.DeviceFactory;

/**
 * 싱글톤 패턴으로 구현
 * 정적 멤버와 Lazy Holder (중첩 클래스) (인강 내용상 5번)
 */
public class DeviceManager {
    private static DeviceManager instance;

    private final DeviceFactory deviceFactory;

    private DeviceManager(DeviceFactory deviceFactory) {
        this.deviceFactory = deviceFactory;
    }

    public static synchronized DeviceManager getInstance(DeviceFactory deviceFactory){
        if(instance==null){
            instance = new DeviceManager(deviceFactory);
        }
        return instance;
    }

}
