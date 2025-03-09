package BankManagementSystem;

public class SavingsAccount extends BankAccount {
 private double interest;

 //default 
 SavingsAccount(){
	 super();
 }
 //parameterised 
 SavingsAccount(int accNo , String username , int balance , double interest){
	 super(accNo , username , balance);
	 this.interest = interest;
 }
 
 //interest setter getter
 public void setinterest(double interest) {
		this.interest = interest;
	}
 public double getinterest() {
		return interest;
	}
 //interest rate calculator
 public void applyInterest() {
     double balance = getBalance();
     balance += balance * (interest/100);
     setBalance(balance);

 }
}



