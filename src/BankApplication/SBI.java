package BankApplication;

import java.util.UUID;

public class SBI implements BankInterface {

    private String accountNumber;
    private int balance;
    private String password;
    private String name;
    private double rateOfInterest =7.0;

    public SBI(int balance,String password,String name){
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountNumber = UUID.randomUUID().toString();
    }
    @Override
    public int checkBalance(String password) {
        if(this.password.equals(password)){
            return balance;
        }else{
            System.out.println("Enter the corect password");
            return -1;
        }
    }

    @Override
    public String addMoney(int money) {
        if(money>0){
            balance+=money;
            String sentence = money+" has been credited to "+accountNumber;
            System.out.println(sentence);
        }else{
            System.out.println("Enter the positive value not negative");
        }
            return " ";
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if(this.password.equals(password)){
            if(money>balance){
                System.out.println("Insufficient Balance");
            }else{
                balance-=money;
                System.out.println(money+" has been debited from the "+accountNumber+" the remainging balance is "+balance);
            }
        }else{
            System.out.println("Enter the correct password");
        }
        return null;
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            password = newPassword;
            System.out.println("Password has been changed sucessfully");
        }else{
            System.out.println("Enter the correct password");
        }
        return null;
    }

    @Override
    public double calculateTotalInterest(int years, String password) {
        double interest = years*rateOfInterest*balance/100;
        System.out.println(interest);
        return interest;
    }
}
