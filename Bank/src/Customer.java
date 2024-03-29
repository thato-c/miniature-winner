public class Customer {
    private String name;
    private String address;
    private String contactInfo;

    public Customer(String name, String address, String contactInfo){
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getContactInfo(){
        return contactInfo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString(){
        return "Customer{name = " + name + 
                ", address = " + address + 
                ",  contactInfo = " + contactInfo +"}";
    }
}
