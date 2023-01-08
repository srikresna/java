import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int menu,indexMedicine;
    static String doctorCode,medicineCode,medicineName,yesNo;
    static boolean mainProcess, menuProcess,visitProces,validateUser;
    static String[] userMain={"admin","admin"};
    static String[] getUser=new String[2];
    static String[][] doctor={
            {"AA1101","Jarwa Budiyanto","Cardiology","08 506 0359 688",},
            {"AA2201","Balijan Uwais","Anesthesiology","08 582 6896 2093"}
    };
    static String [][]medicine={
            {"CA3302","Dextroamphetamine","30","40000"},
            {"CE2375","Amoxicillin","84","15000"}
    };
    static String[][] frameMedicine= new String[50][4];
    static String[][] frameDoctor= new String[50][4];
    static String[][] frameVisist= new String[50][4];

    static boolean validationUser(String username,String password){
        return username.equals(userMain[0])&& password.equals(userMain[1]);
    }
    static void setFrameMedicine(){
        for (int i = 0;i <medicine.length;i++){
            frameMedicine[i][0]=medicine[i][0];
            frameMedicine[i][1]=medicine[i][1];
            frameMedicine[i][2]=medicine[i][2];
            frameMedicine[i][3]=medicine[i][3];
        }
    }
    //Function for Login
    static void loginPage(){
        System.out.printf("\n================================");
        System.out.printf("\n========= Login Page ===========\n");
        System.out.print("Input username : ");
        getUser[0] = sc.nextLine();
        System.out.print("Input password : ");
        getUser[1] = sc.nextLine();
        validateUser = validationUser(getUser[0], getUser[1]);
    }
    //Function for Medicine Menu
    static void medicineMenu() {
        System.out.printf("\n================================");
        System.out.printf("\n========= Medicine Menu ===========\n");
        System.out.printf("1. Add Medicine\n");
        System.out.printf("2. View Medicine\n");
        System.out.printf("3. Update Medicine\n");
        System.out.printf("4. Delete Medicine\n");
        System.out.printf("5. Search Medicine\n");
        System.out.printf("6. Exit\n");
        System.out.printf("================================");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                addMedicine();
                break;
            case 2:
                showMedicine();
                break;
            case 3:
                updateMedicine();
                break;
            case 4:
                deleteMedicine();
                break;
            case 5:
                searchMedicine();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid Input");
        }
    }

    //show medicine functions
    static void showMedicine() {
        System.out.printf("\n================================");
        System.out.printf("\n========= Show Medicine Page ===========");
        System.out.printf("\n| No | Code | Name           | Stock | Cost\n");
        for (int i = 0; i < medicine.length; i++){
            System.out.printf("| %d | %s | %s | %s | %s |\n",
                    (i+1),medicine[i][0],medicine[i][1],medicine[i][2],medicine[i][3]
            );
        }
        medicineCode = sc.nextLine();
    }
    //input new medicine functions
    static void addMedicine() {
        System.out.printf("\n================================");
        System.out.printf("\n========= New Medicine Page ===========");
        System.out.printf("\n| No | Code | Name           | Stock | Cost\n");
        for (int i = 0; i < frameMedicine.length; i++){
            if (frameMedicine[i][0] == null){
                System.out.printf("Input medicine code :");
                frameMedicine[i][0] =sc.nextLine();
                System.out.printf("Input medicine name :");
                frameMedicine[i][1] =sc.nextLine();
                System.out.printf("Input medicine stock :");
                frameMedicine[i][2] =sc.nextLine();
                System.out.printf("Input medicine cost :");
                frameMedicine[i][3] =sc.nextLine();
                System.out.printf("Do you want to input again? ( y / n ) : ");
                yesNo = sc.nextLine().toLowerCase();
                if (yesNo.equals("n")){
                    break;
                }
            }
        }
    }
    static void searchMedicine() {
        System.out.printf("\n================================");
        System.out.printf("\n========= Search Medicine Page ===========");
        System.out.printf("Choose Search Medicine By ");
        System.out.printf("1. Code");
        System.out.printf("2. Name");
        System.out.printf("3. Exit");
        System.out.printf("================================");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                System.out.println("Input Medicine Code : ");
                medicineCode = sc.nextLine();
                indexMedicine = searchMedicineByCode(frameMedicine,medicineCode);
                break;
            case 2:
                System.out.println("Input Medicine Name : ");
                medicineName = sc.nextLine();
                indexMedicine = searchMedicineByName(frameMedicine,medicineName);
                break;
            }

    }
    //Searching Array Medicine With medicineCode
    static int searchMedicineByCode(String[][] frameMedicine, String code) {
        System.out.printf("\n================================");
        System.out.printf("\n========= Search Medicine Page ===========");
        for (int i = 0; i< frameMedicine.length; i++) {
            if (frameMedicine[i][0] != null){
                if (frameMedicine[i][0].equalsIgnoreCase(code)){
                    return i;
                }
            }

        }
        return -1;
    }
    //Searching Array Medicine With medication Name
    static int searchMedicineByName(String[][] frameMedicine, String name) {
        System.out.printf("\n================================");
        System.out.printf("\n========= Search Medicine Page ===========");
        for (int i = 0; i< frameMedicine.length; i++) {
        if (frameMedicine[i][1]!= null){
            if (frameMedicine[i][1].equalsIgnoreCase(name)){
                return i;
                }
            }
        }
        return -1;
    }

    //Searching Array Doctor With medication Code
    static int searchDoctor(String[][] frameDoctor, String code) {
        System.out.printf("\n================================");
        System.out.printf("\n========= Search Doctor Page ===========");
        for (int i = 0; i < frameDoctor.length; i++) {
            if (frameDoctor[i][0] != null) {
                if (frameDoctor[i][0].equalsIgnoreCase(code)) {
                    return i;
                }
            }
        }
        return -1;
    }
    //Searching Array Doctor With medication Name
    static int searchDoctorName(String[][] frameDoctor, String name) {
        System.out.printf("\n================================");
        System.out.printf("\n========= Search Doctor Page ===========");
        for (int i = 0; i < frameDoctor.length; i++) {
        if (frameDoctor[i][1]!= null) {
            if (frameDoctor[i][1].equalsIgnoreCase(name)) {
                return i;
                }
            }
        }
        return -1;
    }
    //Function Menu for Edit Medicine Item
    static void updateMedicine() {
        boolean menuEdit = true,subMenuEdit = true;
        indexMedicine =0;
        System.out.printf("\n================================");
        System.out.printf("\n========= Edit Medicine Page ===========");
        while (menuEdit) {
            System.out.println("Input medicine code to edit :");
            medicineCode = sc.nextLine();
            indexMedicine = searchMedicineByCode(frameMedicine, medicineCode);
            if (indexMedicine == -1) {
                System.out.println("Medicine item not found");
            }else {
                while (subMenuEdit){
                    System.out.println("\n================================================================");
                    System.out.printf("\n========= Edit Medicine Page ===========");
                    System.out.printf("\n| No | Code | Name           | Stock | Cost");
                    System.out.printf("\n| %-2d | %-4s | %-14s | %-5s | %-6s |\n",
                            (indexMedicine+1),frameMedicine[indexMedicine][0],frameMedicine[indexMedicine][1],frameMedicine[indexMedicine][2],frameMedicine[indexMedicine][3]
                    );
                    System.out.printf("\n What do you want to edit? \n" +
                            "1. Item Code \n" +
                            "2. Item Name \n" +
                            "3. Stock \n" +
                            "4. Cost \n" +
                            "5. Nothing"
                    );
                    menu = sc.nextInt();
                    sc.nextLine();

                    switch(menu){
                        case 1:
                            System.out.printf("\nInput new item code :");
                            frameMedicine[indexMedicine][0] = sc.nextLine();
                            break;
                        case 2:
                            System.out.printf("\nInput new item name :");
                            frameMedicine[indexMedicine][1] = sc.nextLine();
                            break;
                        case 3:
                            System.out.printf("\nInput new stock :");
                            frameMedicine[indexMedicine][2] = String.valueOf(sc.nextInt());
                            break;
                        case 4:
                            System.out.printf("\nInput new cost :");
                            frameMedicine[indexMedicine][3] = String.valueOf(sc.nextInt());
                            break;
                        case 5:
                            menuEdit = false;
                            break;
                        default:
                            System.out.println("\t\tInvalid Input");
                            break;
                    }
                }
            }
            System.out.print("\n What do you want to edit again? ( y / n ) \n");
            yesNo =sc.nextLine().toLowerCase();
            if (yesNo.equals("n")) {
                menuEdit = false;
            }
        }
    }
    //Function Menu for Delete Medicine Item
    static void deleteMedicine() {
        boolean subMenuDelete = true;
        indexMedicine = 0;
        System.out.printf("\n================================");
        System.out.printf("\n========= Delete Medicine Page ===========");
        System.out.println("Search item code : ");
        medicineCode = sc.nextLine();

        indexMedicine = searchMedicineByCode(frameMedicine, medicineCode);
        if (indexMedicine == -1) {
            System.out.println("Medicine item not found");
        }else {
            while (subMenuDelete) {
                System.out.println("\n================================================================");
                System.out.printf("\n========= Delete Medicine Page ===========");
                System.out.printf("\n| No | Code | Name           | Stock | Cost");
                System.out.println("| No | Code | Item Name      | Stock | Broken |");
                System.out.printf("| %-2d | %-4s | %-14s | %-5s | %-6s |\n", (indexMedicine + 1),
                        frameMedicine[indexMedicine][0], frameMedicine[indexMedicine][1], frameMedicine[indexMedicine][2], frameMedicine[indexMedicine][3]
                );
                System.out.printf("\n What do you want to delete? \n" +" y / n ");
                yesNo = sc.nextLine().toLowerCase();
                if (yesNo.equalsIgnoreCase("y")){
                    frameMedicine[indexMedicine] = null;
                    System.out.println("Medicine item deleted");
                    subMenuDelete = false;
                } else if (yesNo.equalsIgnoreCase("n")) {
                    subMenuDelete = false;
                }else {
                    System.out.println("\t\tInvalid Input");
                }
            }
        }
    }

    //Function Find Medicine Item
    static void findMedicine() {
        boolean subMenuFind = true;
        String itemName;
        indexMedicine = 0;

        System.out.printf("\n================================");
        System.out.printf("\n========= Find Medicine Page ===========");
        System.out.print("What do you want to search ? \n1. Item code \n2. Item name \nSelect option 1 - 2 : ");
        menu = sc.nextInt();
        sc.nextLine();

        switch(menu) {
            case 1:
                System.out.print("Input item code : ");
                medicineCode = sc.nextLine();
                indexMedicine = searchMedicineByCode(frameMedicine, medicineCode);
                break;
            case 2:
                System.out.print("Input item name : ");
                itemName = sc.nextLine();
                indexMedicine = searchMedicineByName(frameMedicine, itemName);
                break;
            default:
                System.out.println("\t\tInvalid Input Option");
                break;
        }
        if (indexMedicine == -1) {
            System.out.println("Medicine item not found");
        }else {
            System.out.println("\nItem found! Here's item that you want");
            System.out.printf("\n| No | Code | Name           | Stock | Cost");
            System.out.printf("\n| %-2d | %-4s | %-14 | %-5s | %-6s |\n",
                    (indexMedicine+1),frameMedicine[indexMedicine][0],frameMedicine[indexMedicine][1],frameMedicine[indexMedicine][2],frameMedicine[indexMedicine][3]
                    );
            System.out.print("\nOPTION \n1. Edit item \n2. Delete item \n3. Go back\n");
            System.out.print("Select option 1 - 3 : ");
            menu = sc.nextInt();
            switch(menu) {
                case 1:
                    updateMedicine();
                    break;
                case 2:
                    deleteMedicine();
                    break;
                case 3:
                    subMenuFind = false;
                    break;
                default:
                    System.out.println("\t\tInvalid Input Option");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        setFrameMedicine();
        System.out.println("================================================");
        System.out.printf("\n\tJayya Kusuma clinic \n");
        mainProcess =true;
        while (mainProcess) {
            System.out.println("\n================================================");
            System.out.println("\nPLEASE LOGIN TO CONTINUE ACCESS THE PROGRAM \n1. Login \n2. Exit Program");
            System.out.print("Choose menu 1 - 2 : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    mainProcess = true;
                    loginPage();
                    if (validateUser) {
                        System.out.println("\nWELCOME ADMIN!!");
                        while (menuProcess = true) {
                            System.out.println("\nMENU \n1. Visit  \n2. Medicine \n3. Doctor \n4. Logout");
                            System.out.print("Choose menu 1 - 4 : ");
                            menu = sc.nextInt();
                            switch (menu) {
                                case 1:
                                    medicineMenu();
                                    break;
                                case 4:
                                    menuProcess = false;
                                    break;
                                default:
                                    System.out.println("\t\tInvalid Input Option");
                                    break;
                            }
                        }
                    } else {
                       System.out.println("Incorret");
                    }
                    break;
                case 2:
                mainProcess = false;
                break;
            }
        }
    }
}