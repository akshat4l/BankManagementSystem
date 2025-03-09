package BankManagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        
                // Create an AccountManager with a capacity of 10 accounts
                AccountManager manager = new AccountManager(10);
                Scanner scanner = new Scanner(System.in);
                boolean running = true;

      
                    System.out.println("Bank Account Management System");
                    System.out.println("1. Add Account");
                    System.out.println("2. Remove Account");
                    System.out.println("3. Deposit Funds");
                    System.out.println("4. Withdraw Funds");
                    System.out.println("5. Display All Accounts");
                    System.out.println("6. Apply Interest to Savings Accounts");
                    System.out.println("7. Exit");
                   
                    
                    while (running) {
                    	 System.out.print("Choose an option: ");

                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (choice) {
                        case 1:
                            // Add Account
                          
                            System.out.print("Enter account number: ");
                            int accNo = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            System.out.print("Enter username: ");
                            String username = scanner.nextLine();

                            System.out.print("Enter initial balance: ");
                            int balance = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                          
                                System.out.print("Enter interest rate: ");
                                double interestRate = scanner.nextDouble();
                                scanner.nextLine(); // Consume newline
                                manager.addAccount(new SavingsAccount(accNo, username, balance, interestRate));
                               
                            break;

                        case 2:
                            // Remove Account
                            System.out.print("Enter account number to remove: ");
                            int removeAccNo = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if(manager.findAccountIndex(removeAccNo) == -1 ) 
                         	   System.out.println("Account not found.");
                           else
                            manager.removeAccount(removeAccNo);
                           
                            break;

                        case 3:
                        
                        // deposit funds
                        	   System.out.print("Enter account number to deposit: ");
                               int depositAccNo = scanner.nextInt();
                               scanner.nextLine(); // Consume newline
                              if(manager.findAccountIndex(depositAccNo) == -1 ) 
                            	   System.out.println("Account not found.");
                              else
                               
                        System.out.print("Enter amount to be deposited: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        manager.depositpls(depositAccNo , amount);
                        
                   
                        break;
                       
                        case 4:
                            // withdraw funds
                            	   System.out.print("Enter account number to withdraw: ");
                                   int withdrawAccNo = scanner.nextInt();
                                   scanner.nextLine(); // Consume newline
                                   if(manager.findAccountIndex(withdrawAccNo) == -1 ) 
                                	   System.out.println("Account not found.");
                                  else
                                   
                            System.out.print("Enter amount to be withdraw: ");
                            double amountw = scanner.nextDouble();
                            scanner.nextLine();
                            manager.withdrawpls(withdrawAccNo , amountw);
                    
                            break;
                            
                        case 5:
                        	//display all accounts
                        	System.out.println();
                        	 manager.displayAllAccounts();
                    
                        	 break;
                       
                        case 6:
                            // Apply Interest to Savings Accounts
                            manager.applyInterestToSavingsAccounts();
                            System.out.println("Applied interest to all savings accounts.");
                        
                            break;
                        	 
                        case 7:
                            // Exit
                            running = false;
                            System.out.println("Exiting system.");
                          
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                    // Prompt user to press Enter to continue
                    if (running) {
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine(); // Wait for user to press Enter

                    // Clear console after the user presses Enter
                 
                      
                    
                }
                }

                scanner.close();
            }
    
        }

        
        
 