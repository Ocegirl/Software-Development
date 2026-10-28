import java.util.Date;

public class Account {
    int id = 0;
    double balance = 0;
    double annualInterestRate = 0;
    Date dateCreated = new Date();

    Account(){
    }

    Account(int newId, double newBalance, double newInterestRate){
        id = newId;
        balance = newBalance;
        annualInterestRate = newInterestRate;
    }

    int getId(){
        return id;
    }

    double getBalance(){
        return balance;
    }

    double getAnnualInterestRate(){
        return annualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    void setId(int newId){
        id = newId;
    }

    void setBalance(double newBalance){
        balance = newBalance;
    }

    void setAnnualInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

    double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }

    double getMonthlyInterest(){
        return balance*this.getMonthlyInterestRate();
    }

    void withdraw(double amount){
        balance -= amount;
    }

    void deposit(double amount){
        balance += amount;
    }
}
