
public class Student {
	
    public Student(String name, String hutulbur){
        studentName=name;
        studentHutulbur= hutulbur;
        studentAddress = "unknown";
        }
    
    public String getName(){
        return studentName;
    }
    /* 
    public void setHutulbur(String hutulbur){
        studentHutulbur= hutulbur;
    }*/
  
    public String getHutulbur(){
        return studentHutulbur;
    }
    
    public void setPhone(int Phone){
        phoneNumber=Phone;
    }
    /*
    public int getPhone(){
        return phoneNumber;
    } */
    
    public void setAddress(String Address ){
        studentAddress = Address;
    }
    /*
    public String getAddress(){
        return studentAddress;
    } */
    
    public String toString(){
        return studentName  + "(" +studentHutulbur + ")" ;
        }
    public String getContactInfo(){
        return "mobile:" + phoneNumber+ "\naddress: "+studentAddress;
        }
    private String studentName;
    private int phoneNumber;
    private String studentAddress;
    private String studentHutulbur;
}