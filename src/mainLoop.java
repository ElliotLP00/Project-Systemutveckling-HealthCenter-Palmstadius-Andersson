import jdk.swing.interop.SwingInterOpUtils;

import javax.print.Doc;
import java.util.Scanner;

public class mainLoop {
    public mainLoop(){
        SignIn();
    }

    private void SignIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Admin");
        System.out.println("2. Doctor");
        System.out.println("3. Patient");
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                System.out.println("ADMIN LOGGED IN");
                adminLoop();
                break;
            case 2:
                System.out.println("Enter employee number...");
                int e_nbr = scanner.nextInt();
                if(e_nbr == 00){ //TODO Fetch data from database and compare to the input
                    System.out.println("Proccecing...");
                    doctorLoop(e_nbr);
                }else{
                    System.out.println("INVALID EMPLOYEE NUMBER");
                }
                break;
            case 3:
                System.out.println("PATIENT SIGN IN");
                int m_nbr = scanner.nextInt();
                if(m_nbr == 20001116){ //TODO Fetch data from database and compare to the input
                    System.out.println("Proccecing...");
                    patientLoop(m_nbr);
                }else{
                    System.out.println("INVALID EMPLOYEE NUMBER");
                }
                break;
        }
    }

    private void adminLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME ADMIN");
        int choise = 0;
        while (choise != 12){
            System.out.println("1.Add a doctor");
            System.out.println("2.Delete a doctor");
            System.out.println("3.See list of patients in the health center");
            System.out.println("4.See all upcoming appointments");
            System.out.println("5.See medical record for a patient");
            System.out.println("12.exit");
            choise = scanner.nextInt();
            switch (choise){
                //Add a doctor
                case 1:
                    //Ska man kunna lägga in ett employee number eller skall de genereras automatiskt.
                    System.out.println("Please enter the type of doctor.");
                    String doctorType = scanner.next();
                    System.out.println("Please enter the name of the doctor.");
                    String doctorName = scanner.next();
                    System.out.println("Please enter the phone number to the doctor");
                    String doctorPhone = scanner.next();
                    //TODO Lägg in doctor i databasen.
                    break;
                case 2:
                    System.out.println("Please enter the employee number of the doctor.");
                    String employeeNbr = scanner.next();
                    //TODO Kolla om nummert finns i databasen.
                    //TODO Ta bort doctorn om den finns.
                    break;
                case 3:
                    //TODO Hämta lista av alla pasienter
                    break;
                case 4:
                    //TODO Hämta lista av alla kommande bokningar
                    break;
                case 5:
                    System.out.println("Please enter medicalnumber.");
                    String medicalNbr = scanner.next();
                    //TODO Kolla om nummert finns i databasen.
                    //TODO hämta och skriv ut alla medical records och sortera i datum ordning.
                    break;
            }
        }
    }

    private void doctorLoop(int employeeNbr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME "+employeeNbr);
        int choise = 0;
        while (choise != 12){
            System.out.println("1.Define availabilities");
            System.out.println("2.List all upcoming appointments");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("12.exit");
            choise = scanner.nextInt();
            switch (choise){
                case 1:
                    System.out.println("SHIT");
                    break;
                case 2:
                    System.out.println("MORE SHIT");
                    break;
                case 3:
                    System.out.println("STUFF");
                    break;
            }
        }
    }

    private void patientLoop(int medicalNbr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME "+medicalNbr); //TODO Fetch name of patient
        int choise = 0;
        while (choise != 12){
            System.out.println("1.patient shit");
            System.out.println("2.patient more shit");
            System.out.println("3.patient stuff");
            System.out.println("12.exit");
            choise = scanner.nextInt();
            switch (choise){
                case 1:
                    System.out.println("patient SHIT");
                    break;
                case 2:
                    System.out.println("patient MORE SHIT");
                    break;
                case 3:
                    System.out.println("patient STUFF");
                    break;
            }
        }
    }



}
