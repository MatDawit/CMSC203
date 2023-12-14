
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
    private ManagementCompany company;
    private Property property1, property2, property3;

    @Before
    public void setUp() throws Exception {
        company = new ManagementCompany("Managers Inc", "12345", 10.0);
        property1 = new Property("Penthouse", "Georgia", 8000.0, "Aled Baker");
        property2 = new Property("Apartment", "Iowa", 1000.0, "Heidi Rangel", 1, 1, 1, 1);
        property3 = new Property("House", "Ohio", 4000.0, "Darcey Berry");

        company.addProperty(property1);
        company.addProperty(property2);
    }

    @After
    public void tearDown() throws Exception {
        company = null;
        property1 = null;
        property2 = null;
        property3 = null;
    }

    @Test
    public void testGetPlot() {
        assertEquals(new Plot(0,0, 10, 10), company.getPlot());
    }

    @Test
    public void testGetMAX_PROPERTY() {
        assertEquals(5, company.getMAX_PROPERTY());
    }

    @Test
    public void testGetName() {
        assertEquals("Managers Inc", company.getName());
    }

    @Test
    public void testMaxRentPropInfo() {
        assertEquals("Penthouse,Georgia,Aled Baker,8000.0", company.getHighestRentProperty());
    }

    @Test
    public void testAddProperty() {
        assertEquals(2, company.addProperty(property3));
    }

    @Test
    public void testGetTotalRent() {
        assertEquals(9000.0, company.getTotalRent(), 0.001);
    }

    @Test
    public void testGetHighestRentProperty() {
        assertEquals("Penthouse,Georgia,Aled Baker,8000.0", company.getHighestRentProperty().toString());
    }

    @Test
    public void testRemoveLastProperty() {
        company.removeLastProperty();
        assertEquals(1, company.getPropertiesCount());
    }

    @Test
    public void testIsPropertiesFull() {
        assertFalse(company.isPropertiesFull());
    }

    @Test
    public void testGetPropertiesCount() {
        assertEquals(2, company.getPropertiesCount());
    }

    @Test
    public void testIsManagementFeeValid() {
        assertTrue(company.isManagementFeeValid());
    }

    @Test
    public void testToString() {
        String expected = "List of properties for Managers Inc, TaxID: 12345\n" +
                "______________________________________________________\n" +
                "Penthouse,Georgia,Aled Baker,8000.0\n" +
                "Apartment,Iowa,Heidi Rangel,1000.0\n" +
                "______________________________________________________\n" +
                "total management Fee: 900.0\n";

        assertEquals(expected, company.toString());
    }
}
