// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String Name,password;
        Name=sc.nextLine();
         password=sc.nextLine();
               SBIaccount SBIUser= new SBIaccount(Name,password);
               SBIUser.addMoney(2000);
               System.out.println(SBIUser.checkBalance());
               System.out.println(SBIUser.withDraw(1000));
        System.out.println(SBIUser.checkBalance());
         SBIUser.setBalance(2050);
        }
    }
