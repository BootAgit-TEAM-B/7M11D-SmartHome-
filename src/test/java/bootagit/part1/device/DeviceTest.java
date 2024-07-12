package bootagit.part1.device;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeviceTest {
    private static final String PRINT_SENTENCE = "을 선택하였습니다.";
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

//    SECURITYCAMERA,
//    SMARTLIGHT,
//    THERMOSTAT;

    @Test
    void SecurityCamera_정상생성(){
        SecurityCamera securityCamera = new SecurityCamera("SECURITYCAMERA");
        assertEquals("SECURITYCAMERA"+PRINT_SENTENCE, outputStreamCaptor.toString().trim());

    }

    @Test
    void Thermostat_정상생성(){
        Thermostat thermostat = new Thermostat("THERMOSTAT");
        assertEquals("THERMOSTAT"+PRINT_SENTENCE,outputStreamCaptor.toString().trim());

    }

    @Test
    void SmartLight_정상생성(){
        SmartLight smartLight = new SmartLight("SMARTLIGHT");
        assertEquals("SMARTLIGHT"+PRINT_SENTENCE,outputStreamCaptor.toString().trim());

    }

    @Test
    void SecurityCamera_메서드_정상동작(){
        SecurityCamera securityCamera = new SecurityCamera("SECURITYCAMERA");

        assertEquals(securityCamera.getX(),0);
        assertEquals(securityCamera.getY(),0);

        securityCamera.moveUp();
        securityCamera.moveRight();

        assertEquals(securityCamera.getX(),1);
        assertEquals(securityCamera.getY(),1);

        securityCamera.moveDown();
        securityCamera.moveLeft();

        assertEquals(securityCamera.getX(),0);
        assertEquals(securityCamera.getY(),0);
    }

    @Test
    void SmartLight_메서드_정상동작(){
        SmartLight smartLight = new SmartLight("SMARTLIGHT");
        //default 값 확인
        assertEquals(smartLight.getLight(),0);

        smartLight.brighter();
        assertEquals(smartLight.getLight(),1);

        smartLight.darker();
        assertEquals(smartLight.getLight(),0);

    }

    @Test
    void Thermostat_메서드_정상동작(){
        Thermostat thermostat = new Thermostat("THERMOSTAT");

        assertEquals(thermostat.getTemperature(),0);

        thermostat.temperatureUp();
        assertEquals(thermostat.getTemperature(),1);

        thermostat.temperatureDown();
        assertEquals(thermostat.getTemperature(),0);
    }
}