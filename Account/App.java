public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account(1122, 20000.00, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.printf("balance: $%1.2f monthly interest: $%1.2f date of account creation: " + account.getDateCreated(), account.balance, account.getMonthlyInterest());
    }
}
