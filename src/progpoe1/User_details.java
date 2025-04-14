
package progpoe1;
//import regex to set the conditions of the user's paasword and username;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class User_details {

  String username;
 String password;
 String phonenumber;
 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public boolean ValidatePhonenumber(String phonenumber){
    String regex = "^([27])(?=.*[+])[27+]{10}$";
    Pattern pat = Pattern.compile(regex);
    Matcher matcher = pat.matcher(phonenumber);
    return false;
    
    }
    
    
    //method to validate the user's paasword;
    public boolean ValidCredentails(String password){
      String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$";
      Pattern pat = Pattern.compile(regex);
      Matcher matcher = pat.matcher(password);
      return false;
      

      }
  // method to validate the user's username;
    public boolean ValidUsername(String username){
    String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[_])[A-Za-z_]{5}$";
    Pattern pat = Pattern.compile(regex);
    Matcher matcher = pat.matcher(username);
    return false;
    }
    //REFERENCE: Java regex programs-Basic to advanced,[Article]<https://www.geeksforgeeks.org/java-regex-programs/>[Accessed 08 April 2025];
}
