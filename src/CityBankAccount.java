public class CityBankAccount implements BankAccount{
    String name;
    String surname;
    int  balance;
    String accountNumber;
    String pinCode;

    public CityBankAccount() {
    }

    public CityBankAccount(String name,String surname,String accountNumber,String pinCode,int balance) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    };
    public String getPinCode(){
        return pinCode;
    };
    public void setPinCode(String pinCode){
        this.pinCode = pinCode;
    };
    public int totalBalance(){
        return balance;
    };
    public void creditBalance(int credit){
        balance = balance - credit;
    };
    public void debetBalance(int debet){
        balance = balance + debet;
    };
    public String accountData(){
        return "User name: "+name+", surname: "+ surname;
    };
}
