package cars;

import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet;

    public FleetOfCars(){
        fleet = new ArrayList<Car>();
    }

    public void addCar(Car car){
    fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int total = 0;
        for(Car i: fleet) {
            total += i.getRegistrationFee();
        }
        return total;
    }
    @Override
    public String toString() {
        for(Car i: fleet){
            System.out.print(" "+i);
            System.out.println("\n");
        }

        return "";
    }
}
