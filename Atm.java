
import java.util.Scanner;

public class Atm {
    float balance;
    

    public Atm() {
        // Constructor to initialize balance
        this.balance = 1000; // Initial balance, can be adjusted as needed
    }

    public void checkPin() {
        int PIN = 707;
        System.out.println("Enter Your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Enter valid PIN");
        }
    }

    private void menu() {
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                return;
            default:
                System.out.println("Enter a valid Choice");
        }
        menu(); // After completing an action, show menu again
    }

    private void checkBalance() {
        System.out.println("Balance : " + balance);
    }

    private void withdraw() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Money withdrawn Successfully");
        }
    }

    private void depositMoney() {
        System.out.println("Enter the Amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money Deposited Successfully");
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.checkPin();
    }
}

