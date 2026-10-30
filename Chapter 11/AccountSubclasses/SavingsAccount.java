public class SavingsAccount extends Account {

    public SavingsAccount(){
    }

    public void withdraw(double amount){
        if(this.getBalance() - amount >= 0){
            super.withdraw(amount);
        }
    }
}
