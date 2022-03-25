/**
 * The Student class keeps track of the following pieces of data about a
 * student: the student's name, address, phoneNumber  the student has
 * earned toward graduation, and whether the student is paid up with respect to 
 * university bills. All of this information is entirely private to the class.
 * @author Davaajargal
 */
public class Student {
	/**
	 * Creates a new Student object with the specified name and hutulbur.
	 * @param name
	 *        the student's name a String
	 * @param hutulbur
	 *        the student's hutulbur a String
	 * 
	 */
    public Student(String name, String hutulbur){
        studentName=name;
        studentHutulbur= hutulbur;
        studentAddress = "unknown";
        }
    
    public String getName(){
        return studentName;
    }
    /**
     * Sets the hutulbur of this student.
     * @param the student's hutulbur a String
     */
    public void setHutulbur(String hutulbur){
        studentHutulbur= hutulbur;
    }
    /**
     * Gets the hutulbur of this student.
     * @return The hutulbur of this student
     */
    public String getHutulbur(){
        return studentHutulbur;
    }
    
   /**
    * Sets the student's phone Number a int
    * @param Phone 
    */
    public void setPhone(int Phone){
        phoneNumber=Phone;
    }
    /**
     * Gets the student's phone number a int
     * @return
     */
    public int getPhone(){
        return phoneNumber;
    }
    /**
     * Oyutnii geriin hayg
     * @param Address
     */
    public void setAddress(String Address ){
        studentAddress = Address;
    }
    /**
     * Oyutnii geriin hayg
     * @return
     */
    public String getAddress(){
        return studentAddress;
    }
    /**
     * @return  The string used to display this student
     */
    public String toString(){
        return studentName  + "(" +studentHutulbur + ")" ;
        }
    public String getContactInfo(){
        return "mobile:" + phoneNumber+ "\naddress: "+studentAddress;
        }
    /* Private instance variables */
    private String studentName;
    private int phoneNumber;
    private String studentAddress;
    private String studentHutulbur;
}