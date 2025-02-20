package model;

public abstract class Emergency {
    
    private String emergencyType;
    private String location;
    private int severityLevel;
    private int responseTime; // en minutos
    private boolean attended;
    private long startTime;
    private long endTime;

    

    public Emergency(String emergencyType, String location, int severityLevel, int responseTime) {
        this.emergencyType = emergencyType;
        this.location = location;
        this.severityLevel = severityLevel;
        this.responseTime = responseTime;
        this.attended = false;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }

    public boolean isAttended() {
        return attended;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }


    public void startAttention() {
        this.startTime = System.currentTimeMillis();
    }

    public void finalizarAtencion() {
        this.attended = true;
        this.endTime = System.currentTimeMillis();
    }

    public long calcularTiempoAtencion() {
        return (endTime - startTime);
    }

    public String getDescripcion() {
        return emergencyType + " en " + location + " (Gravedad: " + severityLevel + ")";
    }

    public String toString() {
        return getDescripcion() + " - Tiempo de respuesta: " + responseTime + " minutos";
    }

}
