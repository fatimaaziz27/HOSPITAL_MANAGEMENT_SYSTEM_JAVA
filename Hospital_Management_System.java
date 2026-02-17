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