
package progpoe1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MessageManager {
private String[] ids;
private String[]Messages;
private String[] cellnumber;
private String[]longestMessage;
private String[] MessageHashes;
private String[] allMessages;
String  disregardedMessages;

public MessageManager(String[]ids,String[]Messages,String[]cellnumber,String[]longestMessage,String[]MessageHashes,String[]allMessages ){
this.ids = ids;
this.Messages = Messages;
this.cellnumber = cellnumber;
this.longestMessage = longestMessage;
this.MessageHashes = MessageHashes ;
this.allMessages = allMessages;

}
        
    // Search for a message by ID
    public String searchMessageById( String searchId) {
         StringBuilder result = new StringBuilder();
        for (int i = 0; i < Messages.length; i++) {
            if (Messages[i].equals(searchId)) {
                result.append("Message : ").append(Messages[i]).append("\n");
            }
        }
        if(result.length()==0){
        return"no message found for that message id.";
        }
        return result.toString();
    }

    // Search for a message by cellphone number
    public String searchByCellphone(String searchcellphoneNumber) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Messages.length; i++) {
            if (Messages[i].equals(searchcellphoneNumber)) {
                result.append("Message : ").append(Messages[i]).append("\n");
               
            }
        }
        if(result.length() == 0){
        return "No message found for that cellphone Number.";
        }
        return result.toString();
    }
        //search for longest message sent
        public String DisplayLongestMessage(){
           int maxLen = 0;
           String longest = "";
           for(int i = 0;i<Messages.length;i++){
           if(Messages[i].length()> maxLen ){
           maxLen = Messages[i].length();
           longest = Messages[i];
           }
           }
          JOptionPane.showMessageDialog(null," LONGEST MESSAGE:\n" + longest);
          return "";
        }
        public String DeleteByHashes(){
            String hash = JOptionPane.showInputDialog("ENTER MESSAGE HASH TO DELETE: ");
        for(int i = 0;i<Messages.length;i++){
        if(MessageHashes[i].equals(hash)){
        disregardedMessages = Messages[i];
        Messages[i] = "DELETED!";
        JOptionPane.showMessageDialog(null, "MESSAGE DELETED .");
        
        }
        }
        JOptionPane.showMessageDialog(null, "HASH NOT FOUND!");
        return "";
        }
        
        //display all the messages sent
        public String DisplayAllMessagesSent(){
            StringBuilder report = new StringBuilder("MESSAGE REPORT:\n");
        for(int i = 0;i<Messages.length;i++){
        if(Messages[i].equals(allMessages)){
        report.append("cellnumber: ").append(cellnumber[i])
                .append("Message: ").append(Messages[i])
                .append("ID: ").append(ids[i])
                .append("HASH: ").append(MessageHashes[i])
                .append("\n")
                ;
        }
        }
        return"";
        }
    }


    
