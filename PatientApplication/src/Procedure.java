

public class Procedure {
	
    private float procedureCharges;
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    
    // No Argument Constructor
    public Procedure() {
        procedureName = "";
        procedureDate = "";
        practitionerName = "";
        procedureCharges = 0;
    }
    
    // Constructor for Name and Date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        procedureCharges = 0;
        practitionerName = "";
    }
    
    // Constructor for Other Attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, float procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }
     
    // Getters and Setters
    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public float getProcedureCharges() {
        return procedureCharges;
    }

    public void setProcedureCharges(float procedureCharges) {
        this.procedureCharges = procedureCharges;
    }
    
    // toString Method
    public String toString() {
        return "Procedure Name: " + procedureName + "\n" + "Procedure Date: " + procedureDate + "\n" + "Practitioner Name: " + practitionerName + "\n" + "Procedure Charges: $" + procedureCharges;
    }
}
