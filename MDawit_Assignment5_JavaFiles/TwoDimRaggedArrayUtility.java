import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TwoDimRaggedArrayUtility {

    static double getAverage(double[][] array) {
        int tally = 0;
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
                tally++;
            }
        }

        return total / tally;
    }

    static double getColumnTotal(double[][] array, int j) {
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            if (isValidIndex(array, i, j)) {
                total += array[i][getValidColumnIndex(array[i], j)];
            }
        }

        return total;
    }

    static double getHighestInArray(double[][] array) {
        double highest = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double number = array[i][j];

                if (number > highest) {
                    highest = number;
                }
            }
        }

        return highest;
    }

    static double getHighestInColumn(double[][] array, int j) {
        double highest = 0;

        for (int i = 0; i < array.length; i++) {
            if (isValidIndex(array, i, j)) {
                highest = Math.max(highest, array[i][j]);
            }
        }

        return highest;
    }

    static int getHighestInColumnIndex(double[][] array, int j) {
        double highest = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (isValidIndex(array, i, j) && array[i][j] > highest) {
                highest = array[i][j];
                index = i;
            }
        }

        return index;
    }

    static double getHighestInRow(double[][] array, int row) {
        if (isValidRowIndex(array, row)) {
            double highest = 0;

            for (int i = 0; i < array[row].length; i++) {
                highest = Math.max(highest, array[row][i]);
            }

            return highest;
        }

        return 0;
    }

    static int getHighestInRowIndex(double[][] array, int row) {
        if (isValidRowIndex(array, row)) {
            double highest = 0;
            int index = 0;

            for (int i = 0; i < array[row].length; i++) {
                if (array[row][i] > highest) {
                    highest = array[row][i];
                    index = i;
                }
            }

            return index;
        }

        return 0;
    }

    static double getLowestInArray(double[][] array) {
        double lowest = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (lowest == 0 || array[i][j] < lowest) {
                    lowest = array[i][j];
                }
            }
        }

        return lowest;
    }

    static double getLowestInColumn(double[][] array, int j) {
        double lowest = 0;

        for (int i = 0; i < array.length; i++) {
            if (isValidIndex(array, i, j)) {
                lowest = (lowest == 0) ? array[i][j] : Math.min(lowest, array[i][j]);
            }
        }

        return lowest;
    }

    static int getLowestInColumnIndex(double[][] array, int j) {
        double lowest = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (isValidIndex(array, i, j) && (lowest == 0 || array[i][j] < lowest)) {
                lowest = array[i][j];
                index = i;
            }
        }

        return index;
    }

    static double getLowestInRow(double[][] array, int row) {
        if (isValidRowIndex(array, row)) {
            double lowest = 0;

            for (int i = 0; i < array[row].length; i++) {
                lowest = (lowest == 0) ? array[row][i] : Math.min(lowest, array[row][i]);
            }

            return lowest;
        }

        return 0;
    }

    static int getLowestInRowIndex(double[][] array, int row) {
        if (isValidRowIndex(array, row)) {
            double lowest = 0;
            int index = 0;

            for (int i = 0; i < array[row].length; i++) {
                if (lowest == 0 || array[row][i] < lowest) {
                    lowest = array[row][i];
                    index = i;
                }
            }

            return index;
        }

        return 0;
    }

    static double getRowTotal(double[][] array, int row) {
        if (isValidRowIndex(array, row)) {
            double total = 0;

            for (int i = 0; i < array[row].length; i++) {
                total += array[row][i];
            }

            return total;
        }

        return 0;
    }

    static double getTotal(double[][] array) {
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
        }

        return total;
    }

    static double[][] readFile(File file) throws FileNotFoundException {
        double array[][] = null;
        Scanner input1, input2;
        int rows = 0;
        int currentRow = 0;
        input1 = new Scanner(file);

        while (input1.hasNextLine()) {
            rows++;
            input1.nextLine();
        }

        input1.close();
        array = new double[rows][];
        input2 = new Scanner(file);

        while (input2.hasNextLine()) {
            String line = input2.nextLine();
            String columns[] = line.trim().split(" ");
            array[currentRow] = new double[columns.length];

            for (int i = 0; i < columns.length; i++) {
                array[currentRow][i] = Double.parseDouble(columns[i]);
            }
            currentRow++;
        }

        input2.close();
        return array;
    }

    public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
        PrintWriter output = new PrintWriter(outputFile);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sb.append(data[i][j] + " ");
            }
            sb.append("\n");
        }

        output.print(sb.toString());
        output.close();
    }

    // Helper method to check if the row index is valid
    private static boolean isValidRowIndex(double[][] array, int row) {
        return row >= 0 && row < array.length;
    }

    // Helper method to check if the column index is valid
    private static boolean isValidIndex(double[][] array, int row, int col) {
        return isValidRowIndex(array, row) && col >= 0 && col < array[row].length;
    }

    // Helper method to get the valid column index
    private static int getValidColumnIndex(double[] row, int col) {
        return (row.length == 1 && col == 1) ? col - 1 : col;
    }
}
