import jdk.internal.icu.impl.NormalizerImpl;

import javax.xml.crypto.Data;
import java.util.Objects;
import java.util.Scanner;

public class CityBankATM extends CityBankAccount{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR ACCOUNT NUMBER");
        String accountNumberFromConsole = in.next();
        System.out.println("ENTER YOUR PIN CODE");
        String accountPinCodeFromConsole = in.next();
        BankAccount activeAccount = null;
        for (int i = 0; i < Database.allAccounts.length; i++) {
            if (Objects.equals(accountNumberFromConsole, Database.allAccounts[i].getAccountNumber()) && Objects.equals(accountPinCodeFromConsole, Database.allAccounts[i].getPinCode())) {
                activeAccount = Database.allAccounts[i];
                break;
            }
        }
        if (activeAccount instanceof CityBankAccount) {
            while (true) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO CHANGE PIN CODE");
                System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                System.out.println("PRESS [6] TO EXIT");
                int choose = in.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Сколько денег вы хотите снять");
                        int minusBalance = in.nextInt();
                        activeAccount.creditBalance(minusBalance);
                        break;
                    case 2:
                        System.out.println(activeAccount.totalBalance());
                        break;
                    case 3:
                        System.out.println("Ввидите новый пин-код");
                        String newPinCode = in.next();
                        activeAccount.setPinCode(newPinCode);
                        break;
                    case 4:
                        System.out.println("Сколько денег хотите добавить");
                        int plusBalance = in.nextInt();
                        activeAccount.debetBalance(plusBalance);
                        break;
                    case 5:
                        System.out.println(activeAccount.accountData());
                        break;
                    case 6:
                        break;
                }
            }
        }
        else{
            System.out.println("PRESS [1] TO CASH WITHDRAWAL");
            System.out.println("PRESS [2] TO VIEW BALANCE");
            System.out.println("PRESS [3] TO EXIT");
            int choose1 = in.nextInt();
            while (true){
                switch (choose1){
                    case 1:
                        System.out.println("Сколько денег вы хотите снять");
                        int minusBalance = in.nextInt();
                        activeAccount.creditBalance(minusBalance);
                    case 2:
                        System.out.println(activeAccount.totalBalance());
                    case 3:
                        break;
                }
            }
        }
    }

}

