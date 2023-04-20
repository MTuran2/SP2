package cars;

abstract class AFuelCar extends ACar {
    private int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLiter){
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre = kmPrLiter;
    }


    public abstract String getFuelType();

    public int getKmPrLitre(){
        return kmPrLitre;
    }
    @Override
    public String toString(){
        return "";
    }

}
