
package GarageArrayList;


public class Car {
    
   private int year;
    private Model model;
    private Color color;
    private int price;
    private int idNumber;
    private static int nAdditions;
    public Car (Model model, Color color, int year, int price, int idNumber){
        
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        nAdditions++;
        idNumber=nAdditions;
        
    }

    public int getIdNumber() {
        return idNumber;
    }
    
        
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
   @Override
    public String toString (){
        return "["+ price + " " + model +" " + year+ " " + color + " " + "]";
    }
    
}
