
public class HolidayBonus {
    // Constants for bonus values
    public static final double BONUS_HIGHEST_STORE = 10.0;
    public static final double BONUS_LOWEST_STORE = 5.0;
    public static final double BONUS_OTHER_STORES = 2.0;

    // Calculate holiday bonus for each store based on sales data
    public static double[] calculateHolidayBonus(double[][] salesData) {
        double[] holidayBonuses = new double[salesData.length];

        // Iterate through each sales category
        for (int salesCategory = 0; salesCategory < salesData.length; salesCategory++) {
            double[] salesCategorySales = salesData[salesCategory];
            int highestStoreIndex = findHighestStore(salesCategorySales);
            int lowestStoreIndex = findLowestStore(salesCategorySales);

            // Iterate through each store in the sales category
            for (int store = 0; store < salesCategorySales.length; store++) {
                // Determine bonus based on store position in the sales category
                if (store == highestStoreIndex) {
                    holidayBonuses[store] += BONUS_HIGHEST_STORE;
                } else if (store == lowestStoreIndex) {
                    holidayBonuses[store] += BONUS_LOWEST_STORE;
                } else {
                    holidayBonuses[store] += BONUS_OTHER_STORES;
                }
            }
        }

        return holidayBonuses;
    }

    // Calculate the total holiday bonus for all stores
    public static double calculateTotalHolidayBonus(double[][] salesData) {
        double[] holidayBonuses = calculateHolidayBonus(salesData);
        double totalBonus = calculateTotalStoreBonus(holidayBonuses);

        return totalBonus;
    }

    // Find the index of the store with the highest sales in a sales category
    static int findHighestStore(double[] array) {
        int highestIndex = 0;
        double highestValue = array[0];

        // Iterate through the array to find the highest number and its index
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highestValue) {
                highestValue = array[i];
                highestIndex = i;
            }
        }

        return highestIndex;
    }

    // Find the index of the store with the lowest sales in a sales category
    static int findLowestStore(double[] array) {
        int lowestIndex = 0;
        double lowestValue = array[0];

        // Iterate through the array to find the lowest number and its index
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowestValue) {
                lowestValue = array[i];
                lowestIndex = i;
            }
        }

        return lowestIndex;
    }

    // Calculate the total bonus amount for all stores
    static double calculateTotalStoreBonus(double[] array) {
        double total = 0;

        // Iterate through the array to calculate the total bonus
        for (double bonus : array) {
            total += bonus;
        }

        return total;
    }
}
