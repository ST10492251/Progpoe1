package progpoe1;
//import a scanner;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Progpoe1 {

   
    public static void main(String[] args) {
        
       
       Scanner scan = new Scanner(System.in);
      User_details user = new User_details();

       
       System.out.println(" Enter Username : ");
       String username = scan.nextLine();
       user.setUsername(username);
       
       System.out.println(" Enter Password : ");
       String password = scan.nextLine();
       user.setPassword(password);
      
       
       System.out.println(" Enter phonenumber : (e.g +277665083) >> ");
       String phonenumber = scan.nextLine();
       user.setPhonenumber(phonenumber);
       
       
       
       if(!user.ValidatePhonenumber(phonenumber)){
           System.out.println("PHONENUMBER FORMATED INCORRECTLY:(");
           
       }else{
           System.out.println("PHONENUMBER FORMATED CORRECTLY:(");
       }
       
     
      
      
      //the following if statements are to check if the user as followed the regex pattern while setting his or her password and username; 
      if(!user.ValidCredentails(password)){ 
          System.out.println("password correctly formatted:(");
          
      }else{
         System.out.println("password incorrectly formatted:)");
         
         if(!user.ValidUsername(username)){
         System.out.println("username correctly formatted:(");
        
         }else{
             System.out.println("username incorrectly formatted:(");
         }
         
         
          System.out.println(" Enter your username to login : ");
          scan.nextLine();
       user.getUsername();
       
       System.out.println(" Enter your password to login : ");
       scan.nextLine();
       user.getPassword();
       // the program must display a if the user was able to login successful;
       System.out.println(" LOGIN SUCCESSFUL !!");
      
         
      }
       
      System.out.println(" Username : "  +  user.getUsername());
      System.out.println(" phoneNumber "+ user.getPhonenumber());
    }
    }