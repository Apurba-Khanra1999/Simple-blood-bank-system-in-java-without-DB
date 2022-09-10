import java.util.*;
public class BloodDonor {
    
    private int id;
    private String name;
    private int birthYear;
    private String bloodGroup;
    private int contanctNo;
    
    
    
    public BloodDonor(int id, String name, int birthYear, String bloodGroup,int contanctNo) {
            super();
            this.id = id;
            this.name = name;
            this.birthYear = birthYear;
            this.bloodGroup = bloodGroup;
            this.contanctNo = contanctNo;
    }


   
    public int getId() {
            return id;
    }


    
    public void setId(int id) {
            this.id = id;
    }


    
    public String getName() {
            return name;
    }


    
    public void setName(String name) {
            this.name = name;
    }


    
    public int getBirthYear() {
            return birthYear;
    }


    
    public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
    }


    
    public String getBloodGroup() {
            return bloodGroup;
    }


    
    public void setBloodGroup(String bloodGroup) {
            this.bloodGroup = bloodGroup;
    }



        public int getContanctNo() {
        return contanctNo;
        }



        public void setContanctNo(int contanctNo) {
        this.contanctNo = contanctNo;
        }



        @Override
        public String toString() {
                

                return "Name : "+name + "\tBirth Year : "+birthYear +"\t\tBlood Group : "+bloodGroup + "\tContact No : "+contanctNo +
                        "\tId : "+id;
        }


        
    
    
    
    
}





