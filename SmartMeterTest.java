import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SmartMeterTest {

    @Test
    public void testLoadTokenReopensValve() {

        SmartMeter meter = new SmartMeter("M001", 100);

        meter.recordConsumption(3);

        assertFalse(meter.isValveOpen());

        meter.loadToken(500);

        assertTrue(meter.isValveOpen());
    }

    @Test
    public void testConsumptionClosesValve() {

        SmartMeter meter = new SmartMeter("M002", 100);

        meter.recordConsumption(5);

        assertEquals(0, meter.getCreditBalance());

        assertFalse(meter.isValveOpen());
    }
}