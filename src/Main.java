import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            BloodDonationBank bloodDonationBank = new BloodDonationBank();

            Scanner sc = new Scanner(System.in);

          
            int userSelection;

            do {
                    
                    userInterface();

                    userSelection = sc.nextInt();

                    switch (userSelection) {
                    case 1: {
                            
                            System.out.println("Enter Donor id : ");
                            int id = sc.nextInt();

                            System.out.println("Enter Donor name : ");
                            String name = sc.next();

                            System.out.println("Enter Donor birth year : ");
                            int birthYear = sc.nextInt();

                            System.out.println("Enter Donor blood group : ");
                            String bloodGroup = sc.next();

                            System.out.println("Enter Donor Contact number : ");
                            int contactNo = sc.nextInt();

                            bloodDonationBank.addDonors(new BloodDonor(id, name, birthYear, bloodGroup,contactNo));

                            break;
                    }

                    case 2: {
                            System.out.println("Donors List");
                            bloodDonationBank.viewAllDonors();

                            break;
                    }

                    case 3: {

                        int choice;
                        System.out.println("1. Search Donor By Blood Group. ");
                        System.out.println("2. Search Donor By ID. ");
                        choice = sc.nextInt();
                        switch(choice){
                                case 1:{
                                        System.out.println("Enter blood Group to search from donor list : ");
                                        String blood = sc.next();
                                        System.out.println(bloodDonationBank.searchDonorByBloodGroup(blood));
                                        break;

                                }
                                case 2:{
                                        System.out.println("Enter Id to Search from donor list : ");
                                        int id =sc.nextInt();
                                        System.out.println(bloodDonationBank.searchDonorById(id));
                                        break;
                                }
                        }
                        break;

                            
                    }


                    case 4:{
                        int choice;
                        System.out.println("1. Update Name ");
                        System.out.println("2. Update Birth Year ");
                        System.out.println("3. Update Blood Group ");
                        System.out.println("4. Update Contact Number ");
                        System.out.println("Enter your choice : ");
                        choice = sc.nextInt();
                        switch(choice){
                                case 1:{
                                        System.out.println("Enter Id to update Name : ");
                                        int id = sc.nextInt();
                                        System.out.println("Enter new Name : ");
                                        String name = sc.next();
                                        bloodDonationBank.updateName(id, name);
                                        break;
                                }
                                case 2:{
                                        System.out.println("Enter Id to update Birth Year : ");
                                        int id = sc.nextInt();
                                        System.out.println("Enter new Birth Year : ");
                                        int year = sc.nextInt();
                                        bloodDonationBank.updateBirthYear(id, year);
                                        break;
                                }

                                case 3:{
                                        System.out.println("Enter Id to update Blood Group : ");
                                        int id = sc.nextInt();
                                        System.out.println("Enter new Blood Group : ");
                                        String newBloodGroup = sc.next();
                                        bloodDonationBank.updateBloodGroup(id, newBloodGroup);
                                        break;
                                }

                                case 4:{
                                        System.out.println("Enter Id to update Contact No : ");
                                        int id = sc.nextInt();
                                        System.out.println("Enter new Contact number : ");
                                        int contactNo = sc.nextInt();
                                        bloodDonationBank.updateContact(id, contactNo);
                                        break;
                                }
                        }
                        break;
                    }





                    case 5:{
                        System.out.println("Enter Id to remove Donor : ");
                        int id = sc.nextInt();
                        bloodDonationBank.removeDonors(id);
                        break;
                    }

                    case 6:{
                        System.exit(0);
                    }

                    default:

                            System.out.println("\nInvalid selection!\n");
                    }
            } while (userSelection != 0);
    }

    private static void userInterface() {
        System.out.print("\n1. Add a New Donor\n" + "2. Display Donors\n" + "3. Find Donor \n"  + "4. Edit Profile\n"+ "5. Remove Donor\n"+ "6. Quit\n"+"Enter your Choice : ");
        
        
    }
}