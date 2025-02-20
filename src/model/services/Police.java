package model.services;

import model.Emergency;
import model.interfaces.Answer;
import model.interfaces.IEmergencyService;

public class Police extends BaseService implements Answer {

    public Police(String id, int availablePersonal, int fuel) {
            super(id, availablePersonal, fuel);
        }
    
    @Override
    public void attendEmergency(Emergency emergency) {
        System.out.println("Bomberos en camino");
        System.out.println("-> [Bomberos " + getId() + "] Atendiendo emergencia: " + emergency.getDescription());
    
        assignPersonal(1);
        useFuel(0);
    
        // TODO Implementar lógica de atención de emergencia
        // TODO Utilizar los recuros indicados
    
    }

    @Override
    public void assesState() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assesState'");
    }

}
