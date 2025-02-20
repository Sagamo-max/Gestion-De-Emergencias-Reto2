package model.interfaces;

import model.Emergency;

public interface Answer {
        
    public void attendEmergency(Emergency emergency);

    public void assesState();
}
