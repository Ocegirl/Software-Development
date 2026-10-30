import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account(){
    }

    public Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
    }

    public Account(int newId, double newBalance, double newInterestRate){
        id = newId;
        balance = newBalance;
        annualInterestRate = newInterestRate;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int newId){
        id = newId;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }

    public double getMonthlyInterest(){
        return balance*this.getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public String toString(){
        return "Account id: " + id + " balance: " + balance + " date created: " + dateCreated;
    }
}
