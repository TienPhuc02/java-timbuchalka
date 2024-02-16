public class Customer {
    private String name;
    private String creditLimit;
    private String address;
    public Customer(String name, String creditLimit,String address){
        System.out.println("Customer Constructor with parameter called.");
        this.name=name;
        this.creditLimit=creditLimit;
        this.address=address;
    }
    public Customer(){
        this("Phuc","10000000","phucdev235@gmail.com");
        System.out.println("Customer Constructor empty called.");
    }
    public Customer(String name,String email){
        this(name,email,"phucdev123@gmail.com");
    }
    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }
}
