package lr2.Example9;

public class BankAccount implements BankAccountOperations {
    private double balance;

    public BankAccount() {
        this(0);
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void makeDeposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Сумма депозита не может быть отрицательной или 0!!!");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
            }
            else {
                System.out.println("Недостаточно денег для снятия!!!");
            }
        } else {
            System.out.println("Неверная сумма для снятия денег!!!");
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
