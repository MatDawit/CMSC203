

public class Patient {
	
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContact;
    private String emergencyContactNumber;
    
    
    // No-Argument Constructor
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContact = "";
        emergencyContactNumber = "";
    }
    
    // Constructor for Names 
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    // Constructor for Attributes
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber, String emergencyContact, String emergencyContactNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContact= emergencyContact;
        this.emergencyContactNumber = emergencyContactNumber;
    }
    
    // Setters and Getters 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }
    
    // Build Methods
    public String buildFullName() {
    	return firstName + " " + middleName + " " + lastName;
    }
    
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }
    
    public String buildEmergencyContact() {
        return emergencyContact + " " + emergencyContactNumber;
    }
    
    // toString Method
    public String toString() {
        return "Full Name: " + buildFullName() + "\n" + "Address: " + buildAddress() + "\n" + "Phone Number: " + phoneNumber + "\n" + "Emergency Contact: " + buildEmergencyContact();
    }
}
