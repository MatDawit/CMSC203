/*

* Class: CMSC203

* Instructor: Ahmed Tarek

* Description: This program is used to create a management company that manages real estate.

* Due: 11/13/2023

* Platform/compiler: Eclipse

* I pledge that I have completed the programming

* assignment independently. I have not copied the code

* from a student or any source. I have not given my code

* to any student.

Print your Name here: Mathew Dawit

*/
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PropertyTestStudent {
  
	private Property property1, property2, property3;

    @Before
    public void setUp() throws Exception {
        property1 = new Property("Penthouse", "Georgia", 8000.0, "Aled Baker");
        property2 = new Property("Apartment", "Iowa", 1000.0, "Heidi Rangel", 10, 20, 100, 150);
        property3 = new Property("Townhouses", "Ohio", 2000.0, "Michael Jackson");
    }

    @After
    public void tearDown() throws Exception {
        property1 = null;
        property2 = null;
        property3 = null;
    }

    @Test
    public void testGetCity() {
        assertEquals("Georgia", property1.getCity());
    }

    @Test
    public void testGetOwner() {
        assertEquals("Aled Baker", property1.getOwner());
    }

    @Test
    public void testGetPlot() {
        assertEquals(new Plot(0, 0, 1, 1), property1.getPlot());
    }

    @Test
    public void testGetPropertyName() {
        assertEquals("Penthouse", property1.getPropertyName());
    }

    @Test
    public void testGetRentAmount() {
        assertEquals(8000.0, property1.getRentAmount(), 0.001);
    }

    @Test
    public void testSetCity() {
        property1.setCity("Los Angeles");
        assertEquals("Los Angeles", property1.getCity());
    }

    @Test
    public void testSetOwner() {
        property1.setOwner("Rick Ross");
        assertEquals("Rick Ross", property1.getOwner());
    }

    @Test
    public void testSetPropertyName() {
        property1.setPropertyName("Shack");
        assertEquals("Shack", property1.getPropertyName());
    }

    @Test
    public void testSetRentAmount() {
        property1.setRentAmount(500.0);
        assertEquals(500.0, property1.getRentAmount(), 0.001);
    }

    @Test
    public void testToString() {
        String expected = "Penthouse,Georgia,Aled Baker,8000.0";
        assertEquals(expected, property1.toString());
    }
}
