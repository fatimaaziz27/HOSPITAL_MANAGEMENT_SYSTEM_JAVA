// Question:
// Write a Java program to create a Hospital Management System.
// The program should:
// Add patient details (ID, name, age, disease, emergency status).
// Display patient information using patient ID.
// Change a patient’s emergency status.
// Show a menu and repeat until the user chooses to exit.

import java.util.*;
class JAVA{
    public static void main(String[]args){
        hospital h1 = new hospital();
    while (true) {
    System.out.println("1.Add patient\n2.Display Info\n3.Change Patients Emergency");

    Scanner sc = new Scanner(System.in);
    System.out.println("Select a option");
    Integer options = sc.nextInt();

    switch (options) {
        case 1:
            h1.add_patient();
            break;
        case 2:
            h1.display_info();
            break;
        case 3:
            h1.chg_patients_emg();
            break;
    }

    System.out.println("Do ypu want to continue (yes/no) ?");
    sc.nextLine();
    String choice = sc.nextLine().toLowerCase();
    if (choice.equals("no")) {
        break;
    }
    }
    }
}

class hospital {

    HashMap<Integer, String> patient_names = new HashMap<>();
    HashMap<Integer, Integer> patient_age = new HashMap<>();
    HashMap<Integer, String> patient_disease = new HashMap<>();
    HashMap<Integer, String> patient_emergency_status = new HashMap<>();

        void add_patient() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add patient? (yes/no): ");
        String add = sc.nextLine();

        if (add.equals("yes")) {

            System.out.println("Enter patient id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter patient name: ");
            String name = sc.nextLine();
            patient_names.put(id, name);

            System.out.println("Enter patient age: ");
            int age = sc.nextInt();
            patient_age.put(id, age);
            sc.nextLine();

            System.out.println("Enter patient disease: ");
            String disease = sc.nextLine();
            patient_disease.put(id, disease);

            System.out.println("Emergency? (yes/no): ");
            String emg = sc.nextLine();
            patient_emergency_status.put(id, emg);

            System.out.println(patient_names);
            System.out.println(patient_age);
            System.out.println(patient_disease);
            System.out.println(patient_emergency_status);
        }
    }
    void display_info() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient ID: ");
        int id = sc.nextInt();

        if (patient_names.containsKey(id) == true) {

            System.out.println(
                    "Patient Info: \nName: " + patient_names.get(id)
                            + "\nAge: " + patient_age.get(id)
                            + "\nDisease: " + patient_disease.get(id)
                            + "\nEmergency Status: " + patient_emergency_status.get(id));
        }
        
        else {
            System.out.println("Invalid ID");
        }
    }