import java.util.*;

public class BloodDonationBank {
    ArrayList<BloodDonor> donorsList = new ArrayList<BloodDonor>();

    public void addDonors(BloodDonor donor) {
           
            if (donorsList.contains(donor)) {
                    System.out.println("Donor already in List");
            }
            
            donorsList.add(donor);
            
            System.out.println("\nDonor Details Added Successfully . . . ");
    }

    public void viewAllDonors() {
            for (BloodDonor donor : donorsList) {
                    System.out.println(donor.toString());
            }
    }

    public String searchDonorByBloodGroup(String blood) {
            
        try{
            for (BloodDonor donor : donorsList) {
                    if (blood.equals(donor.getBloodGroup())) {
                        return donor.toString();
                    }
            }

        }
        catch(Exception e ){
            e.printStackTrace();
        }

        return "Donor with "+blood+" does't exist...";
        
            

    }
    public String searchDonorById(int id){
        try {
            
            for(BloodDonor donor : donorsList){
                if(donor.getId() == id){
                    return donor.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "\n Donor with "+id+ " does't exist...";
    }

    public void updateName(int id, String name){
        for(BloodDonor donor : donorsList){
            if(donor.getId()==id){
                donor.setName(name);
            }
            System.out.println("Name updated successfully . . . ");
        }
    }

    public void updateBirthYear(int id, int year){
        for(BloodDonor donor : donorsList){
            if(donor.getId()==id){
                donor.setBirthYear(year);
            }
            System.out.println(" Birth Year updated successfully . . . ");
        }
    }
    
    public void updateBloodGroup(int id, String blood){
        for(BloodDonor donor : donorsList){
            if(donor.getId()==id){
                donor.setBloodGroup(blood);
            }
            System.out.println("Blood Group updated successfully . . . ");
        }
    }

    public void updateContact(int id, int contactNo){
        for(BloodDonor donor : donorsList){
            if(donor.getId()==id){
                donor.setContanctNo(contactNo);
            }
            System.out.println("Contact No updated successfully . . . ");
        }
    }

    
    public void removeDonors(int id){
        for(BloodDonor donor : donorsList){
            if(donor.getId()==id){
                donorsList.remove(id);
            }
            System.out.println("\nDonor Details deleted Successfully . . . ");
        }
        
       
    }



}