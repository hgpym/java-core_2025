//Создание классов и интерфейсов для работы с банковскими
//счетами:
//
//Создайте класс, который представляет банковский счет, и
//добавьте методы для депозита и снятия денег, а также для получения
//текущего баланса.
//
//Создайте интерфейс, который определяет методы, которые
//должны быть реализованы для каждого класса, чтобы создать новый
//банковский счет, совершить транзакции и получить текущий баланс.
//
//Реализуйте методы интерфейса в классе банковского счета и
//создайте объекты для работы с ними в своем приложении.

package lr2.Example9;

public class ExampleMain {
    public static void main(String[] args) {
        BankAccountOperations account = new BankAccount();
        account.makeDeposit(500);
        account.withdrawMoney(200);
        System.out.println("Текущий баланс счета: " + account.getBalance());
    }
}
