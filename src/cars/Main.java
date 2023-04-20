package cars;

public class Main {
    public static void main(String[] args) {
        GasolineCar car1 = new GasolineCar("TB22002", "BMW","X6",4,9);
        GasolineCar car2 = new GasolineCar("DG24880", "Alfa Romeo","Giulia",4,15);
        DieselCar car3 = new DieselCar("AN90099", "Mercedes","E220",4,16,true);
        DieselCar car4 = new DieselCar("AM85380", "Ford","Escort",4,8,false);
        ElectricCar car5 = new ElectricCar("CT30022","Tesla","Model S Dual Motor",4,100,570);
        ElectricCar car6 = new ElectricCar("AL90311","Tesla","Model Y",5,78,550);

        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        fleet.addCar(car4);
        fleet.addCar(car5);
        fleet.addCar(car6);

        System.out.println(fleet);
        System.out.println(fleet.getTotalRegistrationFeeForFleet());

    }
}