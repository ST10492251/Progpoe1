

    package progpoe1;

public class MessageManager {

    private String[] ids;
    private String[] messages;
    private String[] cellNumbers;
    private String[] longestMessage;
    private String[] messageHashes;
    private String[] allMessages;

    public MessageManager(String[] ids, String[] messages, String[] cellNumbers, String[] longestMessage,
                          String[] messageHashes, String[] allMessages) {
        this.ids = ids;
        this.messages = messages;
        this.cellNumbers = cellNumbers;
        this.longestMessage = longestMessage;
        this.messageHashes = messageHashes;
        this.allMessages = allMessages;
    }

    // Search message by ID
    public String searchMessageById(String id) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(id)) {
                return "Found Message:\nID: " + ids[i] + "\nCell: " + cellNumbers[i] + "\nMessage: " + messages[i];
            }
        }
        return "No message found with ID: " + id;
    }

    // Search message by cellphone number
    public String searchByCellphone(String number) {
        for (int i = 0; i < cellNumbers.length; i++) {
            if (cellNumbers[i].equals(number)) {
                return "Message to " + cellNumbers[i] + ":\n" + messages[i];
            }
        }
        return "No message found for number: " + number;
    }

    // Display the longest message
    public String DisplayLongestMessage() {
        if (messages.length == 0) return "No messages available.";

        String longest = messages[0];
        for (String msg : messages) {
            if (msg.length() > longest.length()) {
                longest = msg;
            }
        }
        return "Longest Message:\n" + longest;
    }

    // Simulate deletion by message hash (not actual deletion here)
    public String DeleteByHashes() {
        return "Message hash deleted successfully (simulation).";
    }

    // Display all messages sent
    public String DisplayAllMessagesSent() {
        StringBuilder sb = new StringBuilder("All Messages Sent:\n");
        for (int i = 0; i < messages.length; i++) {
            sb.append("ID: ").append(ids[i])
              .append("\nCell: ").append(cellNumbers[i])
              .append("\nMessage: ").append(messages[i])
              .append("\nHash: ").append(messageHashes[i])
              .append("\n-------------------\n");
        }
        return sb.toString();
    }
}



    
