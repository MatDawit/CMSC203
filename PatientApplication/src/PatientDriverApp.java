/* 

Class: CMSC203 CRN 23103  
Program: Assignment 2 
Instructor: Ahmed Tarek  
Summary of Description: The software comprises three classes: Patient, Procedure, and PatientDriverApp.
				Within the Patient class, information such as name, address, and emergency contact is represented,
				along with methods to retrieve and showcase this data. The Procedure class embodies medical procedures,
				featuring attributes like name, date, practitioner, and charges. The PatientDriverApp class serves as
				a demonstration of how to instantiate these classes, exhibit patient and procedure details, and
				compute the total charges for a given set of procedures. 
Due Date: 09/26/23 
Integrity Pledge: I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source.  
Student’s Name: Mathew Dawit

 */

public class PatientDriverApp {
    public static void main(String[] args) {
    	
        Patient patient = new Patient("Bob", "Y", "Walter", "123 Main St", "Silver Spring", "MD", "20905", "111-222-3333", "Zack Walter", "444-555-6666");


        Procedure procedureInstance1 = new Procedure("", "", "", 0);
        Procedure procedureInstance2 = new Procedure("", "", "", 0);
        Procedure procedureInstance3 = new Procedure("", "", "", 0);

        displayPatient(patient);
        System.out.println("\n\n");
        displayProcedure(procedureInstance1);
        System.out.println("\n\n");
        displayProcedure(procedureInstance2);
        System.out.println("\n\n");
        displayProcedure(procedureInstance3);
        System.out.println("\n\n");

        // Calculates and Prints the Total Charges of the Procedures to Screen
        float totalCharges = calculateTotalCharges(procedureInstance1, procedureInstance2, procedureInstance3);
        System.out.println("Charge for Three Procedures: $" + String.format("%.2f",totalCharges));
    }

    // Method for Patient Info
    public static void displayPatient(Patient patient) {
        System.out.println("Patient Information ");
        System.out.println(patient);
    }

    // Method for Procedure Info
    public static void displayProcedure(Procedure procedure) {
        System.out.println("Procedure Information ");	
        System.out.println(procedure);
    }

    // Method for Calculating Total Charges
    public static float calculateTotalCharges(Procedure procedureInstance1, Procedure procedureInstance2, Procedure procedureInstance3) {
        float totalCharges = procedureInstance1.getProcedureCharges() + procedureInstance2.getProcedureCharges() + procedureInstance3.getProcedureCharges();
        return totalCharges;
    }
}
