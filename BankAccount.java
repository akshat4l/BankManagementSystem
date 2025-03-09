package BankManagementSystem ;

public class BankAccount {
	
private int accNo; 
private String username;
private double balance;

//default constructor
BankAccount(){}

//parameterised constructor 
BankAccount(int accNo , String username , int balance){
	this.accNo = accNo;
	this.username = username;
	this.balance = balance;
}

//methods
//setters
public void setaccNo(int accNo) {
	this.accNo = accNo;
}
public void setUser(String user) {
	this.username = username;
}
public void setBalance(double balance) {
	this.balance = balance;
}
//getters
public int getaccNo() {
	return accNo;
}
public String getUser() {
	return username;
}
public double getBalance() {
	return balance;
}
public void displayAccountDetails() {
    System.out.println("Account Number: " + accNo);
    System.out.println("Username: " + username);
    System.out.println("Balance: " + balance);
}

public void deposit(double amount) {
   if(amount >0) {
	   balance = balance + amount;
	   System.out.println("Deposited " + amount );
	   System.out.println("New Balance = " +balance );
   }
   else {
	   System.out.println("Invalid deposit amount.");
   }
}
   
   public void withdraw(double amount) {
	   if(amount>balance) {
		   System.out.println("Insufficient funds");
		   
	   }
	   else {
		   balance = balance - amount;
		   System.out.println("Withdrawn " + amount );
		   System.out.println("New Balance = " +balance );
	   }
   }



}




