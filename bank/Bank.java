package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    //getters and setters

    public String getPassword(){ //getter method
        return this.password;
    }

    public void setPassword(String Pass){ //setter method
        this.password = Pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "John";
        account1.email = "john@gmail.com";
        //account1.password = "sa" //can't access it will show error if we write in this form to access private var we use getter and setter 
        account1.setPassword("abcd");
        System.out.println(account1.getPassword()); //print password
    }
    
}
