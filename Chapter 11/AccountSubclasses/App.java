public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        SavingsAccount savings = new SavingsAccount();
        CheckingAccount checking = new CheckingAccount();
        System.out.print(account.toString() + "\n" + savings.toString() + "\n" + checking.toString());
    }
}
