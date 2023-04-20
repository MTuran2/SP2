package cars;

public class DieselCar extends AFuelCar{
    private boolean particleFilter;
    private int registrationFee;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLiter, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLiter);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter(){
        return this.particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            registrationFee = 330 + 130;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            registrationFee = 1050 + 1390;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            registrationFee = 2340 + 1850;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10) {
            registrationFee = 5500 + 2770;
        } else if (getKmPrLitre() < 5) {
            registrationFee = 10470 + 15260;
        } else {
            registrationFee = 0;
        }
        return registrationFee;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString(){
        return "Registration number: "+getRegistrationNumber()+", Make: "+getMake()+", Model: "+getModel()+", Doors: "+getNumberOfDoors()+", Fuel type: "+getFuelType()+", KmPrLiter: "+getKmPrLitre()+", Registration fee: "+getRegistrationFee()+", Has particle filter: "+particleFilter;
    }
}
