package BankApplication;

public class Main {
    public static void main(String[] args) {
        SBI user1 = new SBI(1000,"1234","Adnan");
        user1.addMoney(500);
        user1.withdrawMoney(2000,"1234");
        user1.calculateTotalInterest(10,"1234");
        System.out.println(user1.checkBalance("1234"));
        user1.changePassword("1234","14789");
        System.out.println(user1.checkBalance("14789"));



    }
}