package cars;

public class GasolineCar extends AFuelCar {
    private int registrationFee;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLiter) {
        super(registrationNumber, make, model, numberOfDoors,kmPrLiter);
    }

    @Override
    public int getRegistrationFee() {
        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            registrationFee = 330;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20){
            registrationFee = 1050;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15){
            registrationFee = 2340;
        } else if(getKmPrLitre() >= 5 && getKmPrLitre() < 10){
            registrationFee = 5500;
        } else if(getKmPrLitre() < 5){
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public String toString(){
        return "Registration number: "+getRegistrationNumber()+", Make: "+getMake()+", Model: "+getModel()+", Doors: "+getNumberOfDoors()+", Fuel type: "+getFuelType()+", KmPrLiter: "+getKmPrLitre()+", Registration fee: "+getRegistrationFee();
    }
}
