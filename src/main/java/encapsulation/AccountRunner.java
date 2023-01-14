package encapsulation;

public class AccountRunner {

    public static void main(String[] args) {

        Account acc=new Account();
        acc.setAcc_no(123456789);
        acc.setName("Ali Kocan");
        acc.setEmail("alikcn35@gmail.com");
        acc.setAmount(12000f);

        System.out.println(acc.getAcc_no());
        System.out.println(acc.getName());
        System.out.println(acc.getEmail());
        System.out.println(acc.getAmount());

    }

}
