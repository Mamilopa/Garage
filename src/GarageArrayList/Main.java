
package GarageArrayList;

import static GarageArrayList.Garage.sc;

public class Main {

    public static void main(String[] args) {
        
        Car c1 = new Car (Model.VOLVO, Color.GOLD, 2017, 1000000,2);
        
        Car c2 = new Car (Model.AUDI, Color.RED, 2015, 500000,2);
        
        Car c3 = new Car (Model.HONDA, Color.BLACK, 2000, 250000,2);
        
        Car c4 = new Car (Model.HONDA, Color.SILVER, 2004, 1000,2);
        
        
        Garage g= new Garage();
        
        g.addToGarage(c1);
        
        g.addToGarage(c2);
        
        g.addToGarage(c3);
        g.addToGarage(c4);
        
        g.showMeGarage();
        
        g.deleteCar(Model.VOLVO, Color.GOLD);
        g.showMeGarage();
       
        System.out.println("Which model would you like to find?");
        String m;
        m = sc.nextLine();
        
        System.out.println(g.findCar(Model.valueOf(m)));
        System.out.println("Update model?");
        String p;
        p = sc.nextLine();
        
      
   
        
        
    }

    
}
