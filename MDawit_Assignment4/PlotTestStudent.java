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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlotTestStudent {

    @Test
    public void testConstructorAndGetters() {
        // Test the constructor and getter methods
        Plot plot = new Plot(1, 2, 3, 4);
        assertEquals(1, plot.getX());
        assertEquals(2, plot.getY());
        assertEquals(3, plot.getWidth());
        assertEquals(4, plot.getDepth());
    }

    @Test
    public void testDefaultConstructor() {
        // Test the default constructor
        Plot plot = new Plot();
        assertEquals(0, plot.getX());
        assertEquals(0, plot.getY());
        assertEquals(1, plot.getWidth());
        assertEquals(1, plot.getDepth());
    }

    @Test
    public void testSetters() {
        // Test the setter methods
        Plot plot = new Plot();
        plot.setX(5);
        plot.setY(6);
        plot.setWidth(7);
        plot.setDepth(8);

        assertEquals(5, plot.getX());
        assertEquals(6, plot.getY());
        assertEquals(7, plot.getWidth());
        assertEquals(8, plot.getDepth());
    }

    @Test
    public void testOverlaps() {
        // Test the overlaps method with overlapping plots
        Plot plot1 = new Plot(1, 2, 3, 4);
        Plot plot2 = new Plot(2, 3, 3, 4);
        assertTrue(plot1.overlaps(plot2));
    }

    @Test
    public void testNotOverlaps() {
        // Test the overlaps method with non-overlapping plots
        Plot plot1 = new Plot(1, 2, 3, 4);
        Plot plot2 = new Plot(5, 6, 3, 4);
        assertFalse(plot1.overlaps(plot2));
    }

    @Test
    public void testEncompasses() {
        // Test the encompasses method with one plot encompassing the other
        Plot plot1 = new Plot(1, 2, 10, 10);
        Plot plot2 = new Plot(5, 6, 3, 4);
        assertTrue(plot1.encompasses(plot2));
    }

    @Test
    public void testNotEncompasses() {
        // Test the encompasses method with one plot not encompassing the other
        Plot plot1 = new Plot(1, 2, 3, 4);
        Plot plot2 = new Plot(5, 6, 3, 4);
        assertFalse(plot1.encompasses(plot2));
    }

    @Test
    public void testToString() {
        // Test the toString method
        Plot plot = new Plot(1, 2, 3, 4);
        assertEquals("1,2,3,4", plot.toString());
    }
}
