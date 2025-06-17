
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
    
    
    
    

    // Username must contain "_" and be no longer than 5 characters
    public boolean ValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Password must be at least 8 characters long and contain:
    // - at least one uppercase letter
    // - at least one digit
    // - at least one special character
    public boolean ValidCredentails(String password) {
        if (password.length() < 8) return false;

        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()\\-+=<>?/{}~|].*");

        return hasUppercase && hasDigit && hasSpecial;
    }

    // Phone number must be in international format: starts with '+' followed by 10 to 15 digits
    public boolean ValidatePhonenumber(String phonenumber) {
        return phonenumber.matches("^\\+\\d{10,15}$");
    }


    //REFERENCE: Java regex programs-Basic to advanced,[Article]<https://www.geeksforgeeks.org/java-regex-programs/>[Accessed 08 April 2025];
    
} 

