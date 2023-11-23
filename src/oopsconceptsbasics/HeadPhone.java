package oopsconceptsbasics;

public class HeadPhone {
    //State
    private String brand;
    private String model;
    private String color;
    private String connectedDevice; //The device that is currently connected to the device
    private String bluetoothVersion; //can be int as well but the information needed can be in string too
    private boolean isWireless; //Some headphones are wired in which case it will be false
    private boolean hasActiveNoiseCancelling; //if false then default to passive noise-cancelling
    private int batteryLevel;
    private int volumeLevel;
    private double weight;
    private boolean hasTouchControls; //if false defaults to button controls
    private int listeningHours;

    //Accessors and Mutators

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConnectedDevice() {
        return connectedDevice;
    }

    public void setConnectedDevice(String connectedDevice) {
        this.connectedDevice = connectedDevice;
    }

    public String getBluetoothVersion() {
        return bluetoothVersion;
    }

    public void setBluetoothVersion(String bluetoothVersion) {
        this.bluetoothVersion = bluetoothVersion;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public boolean isHasActiveNoiseCancelling() {
        return hasActiveNoiseCancelling;
    }

    public void setHasActiveNoiseCancelling(boolean hasActiveNoiseCancelling) {
        this.hasActiveNoiseCancelling = hasActiveNoiseCancelling;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasTouchControls() {
        return hasTouchControls;
    }

    public void setHasTouchControls(boolean hasTouchControls) {
        this.hasTouchControls = hasTouchControls;
    }

    public int getListeningHours() {
        return listeningHours;
    }

    public void setListeningHours(int listeningHours) {
        this.listeningHours = listeningHours;
    }

    //Behaviors
}
