package Class23Encapsulation;

public class BankAccount {
    private String name;
    final private long bankAccNumber;
    private double balance;
    private String Username;
    private String password;
    final private String accType;

    public BankAccount(String name, long bankAccNumber, double balance,
                       String username, String password, String accType) {
        this.name = name;
        this.bankAccNumber = bankAccNumber;
        this.balance = balance;
        Username = username;
        this.password = password;
        this.accType = accType;
    }
    public BankAccount(long bankAccNumber, String username,
                       String password, String accType) {
        this.bankAccNumber = bankAccNumber;
        Username = username;
        this.password = password;
        this.accType = accType;
    }
    public BankAccount(long bankAccNumber, String username,
                        String accType) {
        this.bankAccNumber = bankAccNumber;
        Username = username;
        this.accType = accType;
    }
    public String getName(){
        return name;
    }
    public long getBankAccNumber(){
        return bankAccNumber;
    }
    void setName(String name){
        this.name=name;
    }

}
class BankAccTester{
    public static void main(String[] args) {
        //BankAccount b = new BankAccount("Chinoso", );
    }
}
