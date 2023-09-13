package Iphone;

public class AparelhoTelefonico {

    // Atributos
    private String phoneNumber;
    private boolean statusCall;

    // Construtor
    public AparelhoTelefonico(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.statusCall = false;
    }

    // Getter e Setter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isStatusCall() {
        return statusCall;
    }

    public void setStatusCall(boolean statusCall) {
        this.statusCall = statusCall;
    }

    // Métodos
    public void makeCall(String phoneNumber) {
        if (!statusCall) {
            statusCall = true;
            System.out.println("Chamada para " + phoneNumber + " iniciada.");
        } else {
            System.out.println("Você já está em uma chamada.");
        }
    }

    public void receiveCall(String callerPhoneNumber) {
        if (!statusCall) {
            statusCall = true;
            System.out.println("Recebendo chamada de " + callerPhoneNumber);
        } else {
            System.out.println("Você já está em uma chamada. Ignorando chamada de " + callerPhoneNumber);
        }
    }

    public void endCall() {
        if (statusCall) {
            statusCall = false;
            System.out.println("Chamada encerrada.");
        } else {
            System.out.println("Você não está em uma chamada para encerrar.");
        }
    }
}
