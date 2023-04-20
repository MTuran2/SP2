package cars;

public interface Car {

    String getRegistrationNumber();
    String getMake();
    String getModel();
    int getNumberOfDoors();
    public abstract int getRegistrationFee();
}

