public class BankAccount {
    private double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance(){ return balance;}
    public void setBalance(double balance){
        if(balance<0){
            System.out.println("invaild : balance cannot be negative . rejected.");
        }else{
            this.balance = balance;
        }
    }
    public static void main(String[] args){
        BankAccount account = new BankAccount(5000);
        account.setBalance(-200);
        account.setBalance(7000);
        System.out.println("Final balance = "+ account.getBalance());

    }
    
}
