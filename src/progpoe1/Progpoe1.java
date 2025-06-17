package progpoe1;

import javax.swing.JOptionPane;

public class Progpoe1 {

    public static void main(String[] args) {

        User_details login = new User_details();
        String username = JOptionPane.showInputDialog("Please enter your username");
        String password = JOptionPane.showInputDialog("Please enter your password");
        String phoneNumber = JOptionPane.showInputDialog("Please enter your phone number");

        boolean validUser = login.ValidUsername(username);
        boolean validPass = login.ValidCredentails(password);
        boolean validPhone = login.ValidatePhonenumber(phoneNumber);

        if (!validPhone) {
            JOptionPane.showMessageDialog(null, "Phone number incorrectly formatted");
        } else {
            JOptionPane.showMessageDialog(null, "Phone number correctly formatted");
        }

        if (!validPass) {
            JOptionPane.showMessageDialog(null, "Password incorrectly formatted");
        } else {
            JOptionPane.showMessageDialog(null, "Password correctly formatted");
        }

        if (!validUser) {
            JOptionPane.showMessageDialog(null, "Username correctly formatted");
        } else {
            JOptionPane.showMessageDialog(null, "Username incorrectly formatted");
        }

        // Only continue if all credentials are valid
        if (!validUser && validPass && validPhone) {
            String loginUser = JOptionPane.showInputDialog("Enter your username to login:");
            String loginPass = JOptionPane.showInputDialog("Enter your password to login:");

            if (loginUser.equals(username) && loginPass.equals(password)) {
                JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!!");
                JOptionPane.showMessageDialog(null, "Welcome to QuickChat.");

                final int Size = 3;
                String[] ids = {"101", "102", "103"};
                String[] messages = {
                    "HI, HOW ARE YOU?",
                    "GOOD THANKS AND YOU? I was just checking up on you. Stay safe!",
                    "GOODBYE"
                };
                String[] cellNumbers = {"0635044448", "0763124799", "0637722274"};
                String[] longestMessage = {"GOOD THANKS AND YOU? I was just checking up on you. Stay safe!"};
                String[] messageHashes = {"Msg 001", "Msg 002", "Msg 003"};
                String[] allMessages = {
                    "HI, HOW ARE YOU?\nGOOD THANKS AND YOU? I was just checking up on you. Stay safe!\nGOODBYE\n"
                };

                MessageManager manage = new MessageManager(ids, messages, cellNumbers, longestMessage, messageHashes, allMessages);

                while (true) {
                    String option = JOptionPane.showInputDialog(
                        "Choose an option:\n" +
                        "1) Send Messages\n" +
                        "2) Show Recently Sent Messages\n" +
                        "3) Quit"
                    );

                    switch (option) {
                        case "1":
                            try {
                                int messageCount = Integer.parseInt(
                                    JOptionPane.showInputDialog("How many messages would you like to send?")
                                );

                                String[] newIds = new String[messageCount];
                                String[] newMessages = new String[messageCount];
                                String[] newCellNumbers = new String[messageCount];

                                for (int i = 0; i < messageCount; i++) {
                                    newIds[i] = JOptionPane.showInputDialog("Enter message ID:");
                                    newCellNumbers[i] = JOptionPane.showInputDialog("Enter cell number:");
                                    newMessages[i] = JOptionPane.showInputDialog("Enter message:");
                                }

                                StringBuilder sb = new StringBuilder("Messages Sent:\n");

                                for (int i = 0; i < messageCount; i++) {
                                    sb.append("\nMESSAGE ID: ").append(newIds[i])
                                      .append("\nCell number: ").append(newCellNumbers[i])
                                      .append("\nMessage: ").append(newMessages[i])
                                      .append("\n");
                                }

                                JOptionPane.showMessageDialog(null, sb.toString());

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Invalid number input.");
                            }
                            break;

                        case "2":
                            try {
                                int subOption = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Select an option:\n" +
                                    "1) Search message by ID\n" +
                                    "2) Search message by recipient cell number\n" +
                                    "3) Display longest sent message\n" +
                                    "4) Delete messages using message hash\n" +
                                    "5) Display a report of all messages sent\n" +
                                    "6) Exit"
                                ));

                                switch (subOption) {
                                    case 1:
                                        String idSearch = JOptionPane.showInputDialog("Enter ID to search:");
                                        JOptionPane.showMessageDialog(null, manage.searchMessageById(idSearch));
                                        break;

                                    case 2:
                                        String phoneSearch = JOptionPane.showInputDialog("Enter phone number to search:");
                                        JOptionPane.showMessageDialog(null, manage.searchByCellphone(phoneSearch));
                                        break;

                                    case 3:
                                        JOptionPane.showMessageDialog(null, manage.DisplayLongestMessage());
                                        break;

                                    case 4:
                                        String hashDelete = JOptionPane.showInputDialog("Enter message hash to delete:");
                                        JOptionPane.showMessageDialog(null, manage.DeleteByHashes());
                                        break;

                                    case 5:
                                        JOptionPane.showMessageDialog(null, manage.DisplayAllMessagesSent());
                                        break;

                                    case 6:
                                        JOptionPane.showMessageDialog(null, "Returning to main menu.");
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Invalid option.");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Invalid number input.");
                            }
                            break;

                        case "3":
                            JOptionPane.showMessageDialog(null, "Goodbye!");
                            return;

                        default:
                            JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Login failed. Username and password do not match.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Please enter correctly formatted credentials.");
        }
    }
}
