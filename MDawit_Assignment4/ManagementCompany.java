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
public class ManagementCompany {
    private String name;
    private String taxId;
    private double managementFeePercentage;
    
    private static final int MAX_PROPERTY = 5;
    private static final int MGMT_WIDTH = 10;
    private static final int MGMT_DEPTH = 10;
    
    private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

    public ManagementCompany(String name, String taxId, double managementFeePercentage) {
        this.name = name;
        this.taxId = taxId;
        this.managementFeePercentage = managementFeePercentage;

        properties = new Property[MAX_PROPERTY];
        plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        numberOfProperties = 0;
    }
    
    public ManagementCompany() {
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}

    // Getter methods
    public String getName() {
        return name;
    }
    
    public Plot getPlot() {
    	return this.plot;
    }

    public String getTaxId() {
        return taxId;
    }
    
    public int getMAX_PROPERTY() {
		return this.MAX_PROPERTY;
	}

    public double getManagementFeePercentage() {
        return managementFeePercentage;
    }

   // Setter methods
   public void setName(String name) {
       this.name = name;
   }
   
   public void setTaxId(String taxId) {
       this.taxId = taxId;
   }
   
   public void setManagementFeePercentage(double managementFeePercentage) {
       this.managementFeePercentage = managementFeePercentage; 
   }
 
   public int addProperty(Property property) {
       if (isPropertiesFull()) {
           return -1; // Array is full
       }
       
       if (property == null) {
           return -2; // Property is null
       }
       
       if (!plot.encompasses(property.getPlot())) {
           return -3; // Property plot is not encompassed by management company plot
       }
       
       for (int i = 0; i < numberOfProperties; i++) {
           if (properties[i].getPlot().overlaps(property.getPlot())) {
               return -4; // Property plot overlaps with another property's plot
           }
       }
       
       properties[numberOfProperties] = property;
       numberOfProperties++;
       
       return numberOfProperties - 1;
   }

   public double getTotalRent() {
       double totalRent = 0.0;
       
       for (int i = 0; i < numberOfProperties; i++) {
           totalRent += properties[i].getRentAmount();
       }
       
       return totalRent;
   }
   
   public Property getHighestRentProperty() {
       if (numberOfProperties == 0) {
           return null;
       }
       
       Property highestRentProperty = properties[0];
       
       for (int i = 1; i < numberOfProperties; i++) {
           if (properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
               highestRentProperty = properties[i];
           }
       }
       
       return highestRentProperty;
   }
   
    public void removeLastProperty() {
        if (numberOfProperties > 0) {
            properties[numberOfProperties - 1] = null;
            numberOfProperties--;
        }
    }
    
    public boolean isPropertiesFull() {
        return numberOfProperties == MAX_PROPERTY;
    }
    
    public int getPropertiesCount() {
        return numberOfProperties;
    }
    
   public boolean isManagementFeeValid() {
       return managementFeePercentage >= 0 && managementFeePercentage <= 100;
   }

   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       
       sb.append("List of the properties for ").append(name).append(", taxID: ").append(taxId).append("\n");
       sb.append("______________________________________________________\n");
       
       for (int i = 0; i < numberOfProperties; i++) {
           sb.append(properties[i].toString()).append("\n");
       }
       
       sb.append("______________________________________________________\n\n");
       
       double totalManagementFee = getTotalRent() * (managementFeePercentage / 100);
       sb.append("total management Fee: ").append(String.format("%.2f", totalManagementFee));
       
       return sb.toString();
   }
}