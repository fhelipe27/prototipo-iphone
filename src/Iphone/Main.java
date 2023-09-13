package Iphone;

public class Main {
    public static void main(String[] args) {
        // Criar um iPhone
        Iphone iphone = new Iphone(50, "iPhone 12");

        // Ligar o iPhone
        iphone.powerOn();

        // Carregar a bateria do iPhone
        iphone.chargeBattery();

        // Verificar o nível de bateria
        int batteryLevel = iphone.getBatteryLevel();
        System.out.println("Nível de bateria: " + batteryLevel + "%");

        // Criar um ReprodutorMusical
        ReprodutorMusical player = new ReprodutorMusical("Música 1");

        // Reproduzir música
        player.play();

        // Pausar a reprodução
        player.pause();

        // Ajustar o volume
        player.adjustVolume(75);

        // Criar um NavegadorInternet
        NavegadorInternet navegador = new NavegadorInternet("https://web.dio.me/");

        // Abrir um site no navegador
        navegador.openWebsite();

        // Fazer uma pesquisa na internet
        navegador.search();

        // Criar um AparelhoTelefonico
        AparelhoTelefonico telefone = new AparelhoTelefonico("123456789");

        // Fazer uma chamada
        telefone.makeCall("987654321");

        // Receber uma chamada
        telefone.receiveCall("555555555");

        // Encerrar a chamada
        telefone.endCall();

        // Desligar o iPhone
        iphone.powerOff();
    }
}