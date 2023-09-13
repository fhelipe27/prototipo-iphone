package Iphone;

public class NavegadorInternet {

    // Atributos
    private String currentURL;

    // Construtor
    public NavegadorInternet(String currentURL) {
        this.currentURL = currentURL;
    }

    // Getter e Setter
    public String getCurrentURL() {
        return currentURL;
    }

    public void setCurrentURL(String currentURL) {
        this.currentURL = currentURL;
    }

    // Métodos
    public void openWebsite() {
        System.out.println("Abrindo o site: " + currentURL);
    }

    public void search() {
        System.out.println("Pesquisando na internet: " + currentURL);
    }
}
