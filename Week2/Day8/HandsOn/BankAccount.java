public class BankAccount {
    String accountHolder;
    double balance;
    BankAccount(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount){
        balance+= amount;
        System.out.println("Deposited"+amount+"New balance = "+balance);
    }
    public static void main(String[] args){
        BankAccount account = new BankAccount("nischit",5000);
        account.deposit(1500);
    }

}
    

