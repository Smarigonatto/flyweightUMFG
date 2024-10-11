public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.addForma("Vermelho", "0,0", 10);
        formaManager.addForma("Verde", "1,1", 20);
        formaManager.addForma("Vermelho", "2,2", 15);

        formaManager.apresentar();
    }
}
