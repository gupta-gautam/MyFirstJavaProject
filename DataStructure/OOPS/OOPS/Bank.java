package bank;

class Account {
    // PUBLIC ACCESS MODIFIERS
    public String name;
    protected String email;
    private String password;

    // Getters & Setters
    public String getPassword() {
        // aise   setPassword(RandomPass);
        return this.password;
    }

    // agr et password private krdiya toh get pass mai set pass daldo
// vo acces kr payge but bank class access nhi krpayga
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Apna College";
        acc1.email = "apnacollege@gmail.com";
        /* error aa jayga  bank class ko account classs ka password
        visible hi nhi hai
        acc1.password = "abcd";
         */
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
    }
}
