package Main26;

class Customer {
    private String ID;
    private String name;

    Customer() {

    }

    public Customer(String id, String name) {
        this.ID = id;
        this.name = name;
    }

    public void printCustomer(){
        System.out.println(ID+" - "+name);
    }
    public void setCustomerDetail(String id, String name){
        this.ID=id;
        this.name=name;
    }
    public void setId(String id){
        this.ID=id;
    }
    public void setName(String name){
        this.name=name;
    }


}
