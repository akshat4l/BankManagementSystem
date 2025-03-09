package BankManagementSystem;

public class AccountManager {
     private BankAccount[] accounts;
     private int numAccounts;
     
     
     //default constructor 
     public AccountManager(int size) {
    	 accounts = new BankAccount[size];
    	 numAccounts = 0;
     }
     //adding new account
     public void addAccount(BankAccount account) {
     if(numAccounts < accounts.length) {
    	 accounts[numAccounts] = account;
    	 numAccounts++;
    	 System.out.println("Account added.");
     }
     else {
    	 System.out.println("Can not add more accounts.");
     }
     }
     
     //find account index 
     
     public int findAccountIndex(int accNo) {
    	    for (int i = 0; i < numAccounts; i++) {
    	        if (accounts[i].getaccNo() == accNo) {
    	            return i;
    	        }
    	    }
    	    return -1; // Return -1 if account not found
    	}
   
     // Method to remove an account by account number
     public void removeAccount(int accNo) {
       int index = findAccountIndex(accNo);
      
       if (index != 1) {
    	   // Shift accounts to the left to fill the gap
    	   System.out.println("Removing account of " + accounts[index].getUser());
    	   for (int i = index; i < numAccounts - 1; i++) {
               accounts[i] = accounts[i + 1];
           }
           accounts[numAccounts - 1] = null; // Remove the last element
           numAccounts--;
           System.out.println("Account removed successfully.");
       } else {
           System.out.println("Account not found.");
       }
     }
   
     //find account by account index
     public BankAccount findAccount(int accNo) {
         int index = findAccountIndex(accNo);
         if (index != -1) {
             return accounts[index];
         } else {
             System.out.println("Account not found.");
             return null;
         }
     }

     
     // left methods - display all accounts , deposit , withdraw , calculate interest 
     
     
     //DISPLAY ALL ACCOUNTS
     public void displayAllAccounts() {
    	 if(numAccounts == 0) {
    		 System.out.println("No accounts to display.");
    	 }
    	 else {
    		 for(int i = 0 ; i < numAccounts ; i++) {
    			 accounts[i].displayAccountDetails();
    			 System.out.println();
    		 }
    	 }
     }
    	 //DEPOSIT MONEY
    	 public void depositpls(int accNo , double amount) {
    		 BankAccount account = findAccount(accNo);
    		 account.deposit(amount);
    	 }
    	 
    	 public void withdrawpls(int accNo , double amount) {
    		 BankAccount account = findAccount(accNo);
    		 account.withdraw(amount);
    	 }
    	 
    	  // Method to calculate interest for all savings accounts
    	    public void applyInterestToSavingsAccounts() {
    	        for (int i = 0; i < numAccounts; i++) {
    	            if (accounts[i] instanceof SavingsAccount) {
    	                ((SavingsAccount) accounts[i]).applyInterest();
    	            }
    	        }
    	    }
     }


