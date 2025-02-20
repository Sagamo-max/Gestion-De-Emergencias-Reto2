package model.services;

import model.interfaces.IEmergencyService;

public abstract class BaseService implements IEmergencyService {

    private String id;
    private int availablePersonal;
    private int fuel;

    public BaseService(String id, int availablePersonal, int fuel) {
        this.id = id;
        this.availablePersonal = availablePersonal;
        this.fuel = fuel;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getAvailablePersonal() {
        return availablePersonal;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean isAvailable() {
        return availablePersonal > 0 && fuel > 0;
    }

    @Override
    public void assignPersonal(int cantidad) {
        if (cantidad <= availablePersonal) {
            availablePersonal-= cantidad;
        } else {
            System.out.println("No hay suficiente personal disponible en el servicio " + id);
        }
    }

    @Override
    public void realeasePersonal(int cantidad) {
        availablePersonal+= cantidad;
    }

    @Override
    public void useFuel(int cantidad) {
        fuel = Math.max(0, fuel - cantidad);
    }

    @Override
    public void fillFuel(int cantidad) {
        fuel += cantidad;
    }

}
