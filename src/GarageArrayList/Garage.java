package GarageArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

    static Scanner sc = new Scanner(System.in);

    private static ArrayList<Car> cars = new ArrayList<>();

    public void addToGarage(Car car) {

        cars.add(car);

    }

    public void showMeGarage() {

        System.out.println(cars);

    }

    public void deleteCar(Model model, Color color) {
        Car sample = null;
        for (Car c : cars) {
            if (c.getModel().equals(model) && c.getColor().equals(color)) {
                sample = c;
            }
        }
        cars.remove(sample);
    }

    
    
    public ArrayList<Car> findCar(Model model) {
        ArrayList<Car> temps = new ArrayList<>();
        for (Car c : cars) {
            if (c.getModel().equals(model)) {
                temps.add(c);
            }
        }
        return temps;
    }

}
