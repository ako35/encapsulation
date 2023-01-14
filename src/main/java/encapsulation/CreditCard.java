package encapsulation;

public class CreditCard {

    private String ccn="1234432123455432";

    private int age=21;

    private boolean Expired=false;

    public String getCcn() {
        return ccn;
    }

    public int getAge() {
        return age;
    }

    public boolean isExpired() {
        return Expired;
    }

    public void setCcn(String ccn) {
        this.ccn = ccn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExpired(boolean expired) {
        Expired = expired;
    }
}
