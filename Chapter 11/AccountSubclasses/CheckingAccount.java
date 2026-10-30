public class CheckingAccount extends Account {
    private double overdraftLimit = 100;

    public CheckingAccount(){
    }

    public void withdraw(double amount){
        if(this.getBalance() - amount >= -overdraftLimit){
            super.withdraw(amount);
        }
    }
}
