package Main54;
class Invoice {
    String pNumnber;
    String desc;
    int qaunt;
    double pricePerItem;

    Invoice(String pNum, String desc, int quan, double ppi){
        this.pNumnber = pNum;
        this.desc = desc;
        this.qaunt = quan;
        this.pricePerItem = ppi;
    }

    public void setpNumber( String pNum){
        this.pNumnber = pNum;
    }

    public void setDesc( String desc){
        this.desc = desc;
    }

    public void setQuant( int quan){
        this.qaunt = quan;
    }

    public void setSalary( double ppi){
        this.pricePerItem = ppi;
    }

    public String getPnum() {
        return this.pNumnber;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQun() {
        return this.qaunt;
    }

    public double getPpi() {
        return this.pricePerItem;
    }

    public double getInvoiceAmount() {
        if (this.qaunt < 0) {
            this.qaunt = 0;
        }

        if (this.pricePerItem < 0) {
            this.pricePerItem = 0.0;
        }
        double total = this.qaunt * this.pricePerItem;
        return total;
    }

}
