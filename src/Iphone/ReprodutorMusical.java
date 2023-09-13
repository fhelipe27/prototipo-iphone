package Iphone;

public class ReprodutorMusical {

    // Atributos
    private String currentTrack;
    private int volume;
    private String info;

    // Construtor
    public ReprodutorMusical(String currentTrack) {
        this.currentTrack = currentTrack;
        this.volume = 50;
        this.info = info;
    }

    // Getters e Setters
    public String getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(String currentTrack) {
        this.currentTrack = currentTrack;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    // Métodos
    public void play() {
        System.out.println("Reproduzindo música: " + currentTrack);
    }

    public void pause() {
        System.out.println("Pausando a reprodução de música.");
    }

    public void stop() {
        System.out.println("Parando a reprodução de música.");
    }

    public void skipTrack() {
        System.out.println("Avançando para a próxima faixa.");
    }


    public void adjustVolume(int volumeLevel) {
        if (volumeLevel >= 0 && volumeLevel <= 100) {
            volume = volumeLevel;
            System.out.println("Volume ajustado para " + volume + "%.");
        } else {
            System.out.println("Volume inválido. O volume deve estar entre 0 e 100.");
        }
    }
}
