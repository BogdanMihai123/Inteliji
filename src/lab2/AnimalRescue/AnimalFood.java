package lab2.AnimalRescue;

public class AnimalFood {
    String AFname ;
    double price;
    double quantity;
    String availability;

    public String getAFname(){
        return AFname;
    }

    public void setAFname(String AFname){
        this.AFname=AFname;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getQuantity(){
        return quantity;
    }

    public void setQuantity(double quantity){
        this.quantity=quantity;
    }

    public String getAvailability(){
        return availability;
    }

    public void setAvailability(String availability){
        this.availability=availability;
    }
}
