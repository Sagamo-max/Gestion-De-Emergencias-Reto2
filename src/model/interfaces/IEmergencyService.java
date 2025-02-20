package model.interfaces;

import model.Emergency;

public interface IEmergencyService {

    String getId();

    int getAvailablePersonal();

    int getFuel();

    boolean isAvailable();

    void assignPersonal(int cuantity);

    void realeasePersonal(int cuantity);
    
    void useFuel(int cuantity);

    void fillFuel(int cuantity);

    
}
