package progpoe1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;



public class Progpoe1 {

   
    public static void main(String[] args) {
        User_details login = new User_details();
        String Username = JOptionPane.showInputDialog("Please enter your username");
        String Password = JOptionPane.showInputDialog("please enter your password");
        String phonenumber = JOptionPane.showInputDialog("please enter your phonenumber");
   
                
           if(!login.ValidatePhonenumber(phonenumber)){
               JOptionPane.showMessageDialog(null, "phonenumber correctly formated");
           }else{
               JOptionPane.showMessageDialog(null,"phonenumber incorrectly formated");
           }
           if(!login.ValidCredentails(Password)){
               JOptionPane.showMessageDialog(null, "password correctly formated");
           }else{
               JOptionPane.showMessageDialog(null,"password incorrectly formated");
           }
           if(!login.ValidUsername(Username)){
               JOptionPane.showMessageDialog(null,"username correctly formatted");
           }else{
               JOptionPane.showMessageDialog(null,"username incorrectly formatted");
           }
                      
       
          JOptionPane.showInputDialog(" Enter your username to login : ");
 
  
       
       JOptionPane.showInputDialog(" Enter your password to login ");
  
       // the program must display a if the user was able to login successful;
       JOptionPane.showMessageDialog(null," LOGIN SUCCESSFUL !!");
      
        if (Username != null && Password != null && !Username.isEmpty() && !Password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Welcome to QuickChat.");

            boolean exit = false;
        while(!exit) {
                String menu = JOptionPane.showInputDialog(
                    "Choose an option:\n" +
                    "1) Send Messages\n" +
                    "2) Show Recently Sent Messages\n" +
                    "3) Quit"
                );

                switch (menu) {
                    case "1":
                        String messageCountInput = JOptionPane.showInputDialog("How many messages would you like to send?");
                        int messageCount = Integer.parseInt(messageCountInput);
                        
                           String[] id = new String[messageCount];
                           String[] message = new String[messageCount];
                           int[] Cell_number = new int[messageCount];
                           
                           
                           
                           for(int i =0;i < messageCount;i++){
                               id[i] = JOptionPane.showInputDialog("ENTER MESSAGE ID : ");
                               Cell_number[i] = Integer.parseInt(JOptionPane.showInputDialog("ENTER CELL NUMBER : "));
                               message[i] = JOptionPane.showInputDialog("ENTER MESSAGE/S : ");
                           }
                           
        
        StringBuilder build = new StringBuilder();
        
        
                

                       StringBuilder sb = new StringBuilder("Messages Sent:\n");
                       
                        for (int i = 0; i < messageCount; i++) {
                            sb.append(" \nMESSAGE ID: " ).append(id[i])
                              .append(" \nCellnumber:  " ).append(Cell_number[i])
                              .append(" \nMessage:  " ).append(message[i])
                              .append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                        break;

                    case "2":
                        JOptionPane.showMessageDialog(null, "Coming Soon.");
                        break;

                    case "3":
                        exit = true;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                }
            }
        

        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Username and password do not match.");
        }

        JOptionPane.showMessageDialog(null, "Goodbye!");
    }
    {
     String text = "HELLO WORLD";
    String data = "HI, HOW ARE YOU?";
    
    String[] fruit = data.split(",");
    System.out.println(text.charAt(5));
    System.out.println(text.substring(6).trim());
    System.out.println(text.substring(2, 5));
    for(int x= 0;x<fruit.length;x++)
          System.out.println("fruit[" +x+ "]" + fruit[x].toLowerCase());
    System.out.print(fruit[0]);
        
    }
}

           

