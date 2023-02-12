public class NationalBankAccount implements BankAccount{
    String fullName;
    int balance;
    String accountNumber;
    String pinCode;

    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, String accountNumber,String pinCode,int balance) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
        return "User fullname: "+fullName;
    };
}
