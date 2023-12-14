import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;

public class TwoDimRaggedArrayUtilityTestStudent {

    @Test
    public void testGetAverage() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(4.0, TwoDimRaggedArrayUtility.getAverage(array), 0.0001);
    }

    @Test
    public void testGetColumnTotal() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(12.0, TwoDimRaggedArrayUtility.getColumnTotal(array, 0), 0.0001);
    }

    @Test
    public void testGetHighestInArray() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInArray(array), 0.0001);
    }

    @Test
    public void testGetHighestInColumn() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInColumn(array, 2), 0.0001);
    }

    @Test
    public void testGetHighestInColumnIndex() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(array, 2));
    }

    @Test
    public void testGetHighestInRow() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(array, 0), 0.0001);
    }

    @Test
    public void testGetHighestInRowIndex() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(array, 0));
    }

    @Test
    public void testGetLowestInArray() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(array), 0.0001);
    }

    @Test
    public void testGetLowestInColumn() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(array, 0), 0.0001);
    }

    @Test
    public void testGetLowestInColumnIndex() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(array, 0));
    }

    @Test
    public void testGetLowestInRow() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(array, 0), 0.0001);
    }

    @Test
    public void testGetLowestInRowIndex() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(array, 0));
    }

    @Test
    public void testGetRowTotal() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(array, 0), 0.0001);
    }

    @Test
    public void testGetTotal() {
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
        assertEquals(36.0, TwoDimRaggedArrayUtility.getTotal(array), 0.0001);
    }

    @Test
    public void testReadFile() throws FileNotFoundException {
        File file = new File("testfile.txt");
        double[][] expected = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };

        TwoDimRaggedArrayUtility.writeToFile(expected, file);

        double[][] result = TwoDimRaggedArrayUtility.readFile(file);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testWriteToFile() throws FileNotFoundException {
        File file = new File("testfile.txt");
        double[][] array = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };

        TwoDimRaggedArrayUtility.writeToFile(array, file);

        double[][] result = TwoDimRaggedArrayUtility.readFile(file);

        assertArrayEquals(array, result);
    }
}
