import static org.junit.Assert.*;
import org.junit.Test;

public class HolidayBonusTestStudent {

    @Test
    public void testCalculateHolidayBonus() {
        double[][] salesData = {
            {1000, 1500, 2000},
            {1200, 1300, 1400},
            {800, 900, 1000}
        };

        double[] expected = {7.0, 10.0, 5.0};
        assertArrayEquals(expected, HolidayBonus.calculateHolidayBonus(salesData), 0.0001);
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double[][] salesData = {
            {1000, 1500, 2000},
            {1200, 1300, 1400},
            {800, 900, 1000}
        };

        assertEquals(22.0, HolidayBonus.calculateTotalHolidayBonus(salesData), 0.0001);
    }

    @Test
    public void testFindHighestStore() {
        double[] array = {1000, 1500, 2000};
        assertEquals(2, HolidayBonus.findHighestStore(array));
    }

    @Test
    public void testFindLowestStore() {
        double[] array = {1000, 1500, 2000};
        assertEquals(0, HolidayBonus.findLowestStore(array));
    }

    @Test
    public void testCalculateTotalStoreBonus() {
        double[] array = {7.0, 10.0, 5.0};
        assertEquals(22.0, HolidayBonus.calculateTotalStoreBonus(array), 0.0001);
    }
}
