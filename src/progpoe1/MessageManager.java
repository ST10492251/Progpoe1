
package progpoe1;

import java.util.Arrays;

public class MessageManager {
private String[] ids;
private String[]Messages;
private String[] cellnumber;
private String[]longestMessage;
private String[] allMessages;

public MessageManager(String[]ids,String[]Messages,String[]cellnumber,String[]longestMessage,String[]allMessages){
this.ids = ids;
this.Messages = Messages;
this.cellnumber = cellnumber;
this.longestMessage = longestMessage;
this.allMessages = allMessages;
}
        
    // Search for a message by ID
    public String searchMessageById( String searchId) {
        for (int i = 0; i < Messages.length; i++) {
            if (Messages[i].equals(ids)) {
                return Messages[i];
            }
        }
        return "";
    }

    // Search for a message by cellphone number
    public String searchByCellphone(String searchcellphoneNumber) {
        for (int i = 0; i < Messages.length; i++) {
            if (Messages[i].equals(cellnumber)) {
                return Messages[i];
            }
        }
        return "";
    }
        //search for longest message sent
        public String DisplayLongestMessage(){
        for(int i = 0; i< Messages.length;i++){
        if(Messages[i].equals(longestMessage)){
        return Messages[i];
        
        }
        }
        return"";
        }
        //display all the messages sent
        public String DisplayAllMessagesSent(){
        for(int i = 0;i<Messages.length;i++){
        if(Messages[i].equals(allMessages)){
        return Messages[i];
        }
        }
        return"";
        }
    }


    
