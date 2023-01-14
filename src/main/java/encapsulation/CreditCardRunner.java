package encapsulation;

public class CreditCardRunner {

    public static void main(String[] args) {

        CreditCard cd=new CreditCard();
        System.out.println(cd.getAge());
        System.out.println(cd.getCcn());
        System.out.println(cd.isExpired());

        System.out.println();

        cd.setCcn("123456789");
        System.out.println(cd.getCcn());

        System.out.println();

        CreditCard cd3=new CreditCard();
        System.out.println(cd3.getCcn());
        cd.setAge(60);
        cd.setExpired(true);

        System.out.println();

        System.out.println(cd.getAge());
        System.out.println(cd.isExpired());




    }

}
