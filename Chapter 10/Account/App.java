import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = {
            new Account(0, 100.00),
            new Account(1, 100.00),
            new Account(2, 100.00),
            new Account(3, 100.00),
            new Account(4, 100.00),
            new Account(5, 100.00),
            new Account(6, 100.00),
            new Account(7, 100.00),
            new Account(8, 100.00),
            new Account(9, 100.00)
        };
        int input = 0;
        int id = 0;
        double amount = 0;
        //it didn't mention having a way to exit from the main loop so this loop condition is arbitrary
        while(0 == 0){
            System.out.print("Enter an id: ");
            id = scanner.nextInt();
            if(id > 9||id < 0){
                System.out.println("Invaild id, try again");
                continue;
            }
            do{
                System.out.print("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n\nEnter a choice: ");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.printf("The balance is %1.2f\n", accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        amount = scanner.nextDouble();
                        accounts[id].withdraw(amount);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        amount = scanner.nextDouble();
                        accounts[id].deposit(amount);
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }
            }
            while(input != 4);
        }
    }
}
