public class Main {
    public static void main(String[] args) {

        // Create new account
        Account nabilAccount = new Account();

        nabilAccount.setNumber("12345");
        nabilAccount.setBalance(10000d);
        nabilAccount.setCustomerName("Nabil Arrouss");
        nabilAccount.setCustomerEmail("emial@email.com");
        nabilAccount.setCustomerPhone("06 00 000 0000");


        // Print information
        System.out.println(nabilAccount.getNumber());
        System.out.println(nabilAccount.getBalance());

        // Testing
        nabilAccount.withdrawnFunds(100d);
        nabilAccount.depositFunds(250);
        nabilAccount.withdrawnFunds(50);
        nabilAccount.withdrawnFunds(200);
        nabilAccount.depositFunds(100);
        nabilAccount.withdrawnFunds(45.55);
        nabilAccount.withdrawnFunds(54.46);
    }
}
