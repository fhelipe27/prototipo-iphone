package Iphone;

public class Iphone {

    // Atributos
    private int batteryLevel;
    private boolean powerStatus;
    private String ownerName;
    private String manufacturer;
    private String model;

    // Construtor
    public Iphone(int batteryLevel, String model) {
        this.batteryLevel = batteryLevel;
        this.powerStatus = false;
        this.manufacturer = "Apple";
        this.model = model;
    }

    // Getters e Setters
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Métodos

    // Ligar o aparelho
    public void powerOn() {
        if (!powerStatus) {
            powerStatus = true;
            System.out.println("O aparelho foi ligado.");
        } else {
            System.out.println("O aparelho já está ligado.");
        }
    }

    // Desligar o aparelho
    public void powerOff() {
        if (powerStatus) {
            powerStatus = false;
            System.out.println("O aparelho foi desligado.");
        } else {
            System.out.println("O aparelho já está desligado.");
        }
    }

    // Carregar a bateria
    public void chargeBattery() {
        if (batteryLevel < 100) {
            batteryLevel = 100;
            System.out.println("A bateria foi totalmente carregada.");
        } else {
            System.out.println("A bateria já está completamente carregada.");
        }
    }

    // Checar bateria
    public int getBatteryLevel() {
        return batteryLevel;
    }

}
