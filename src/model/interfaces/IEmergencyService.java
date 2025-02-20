package model.interfaces;
public interface IEmergencyService {

    String getId();

    int getAvailablePersonal();

    int getFuel();

    boolean isAvailable();

    void assignPersonal();

    void realeasePersonal();
    
    void assignFuel();

    void realeaseFuel();
}
