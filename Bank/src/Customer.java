public class Customer {
    private String name;
    private String address;
    private String email;

    public Customer(String name, String address, String email){
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setContactInfo(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Customer{name = " + name + 
                ", address = " + address + 
                ",  contactInfo = " + email +"}";
    }
}
