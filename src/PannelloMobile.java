/**
 * @author Cassetta Nicolas - Classe 5CINF
 * @version 1.0
 *
 * Questa Classe estende Thread e simula la creazione di un pannello di un mobile
 * mostrando a schermo la percentuale di completamento
 */
class PannelloMobile extends Thread {
    private final int NumPannello;

    public PannelloMobile(int numPannello) {
        NumPannello = numPannello;
    }
@Override
    public void run() {
        System.out.println("Creo il pannello numero " + NumPannello);
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prendo il legno dal magazzino");
        System.out.println("Pannello numero" + NumPannello + " al 25%");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("taglio il legno");
        System.out.println("Pannello numero" + NumPannello + " al 50%");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("lavoro il legno");
        System.out.println("Pannello numero" + NumPannello + " al 75%");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("vernicio il Pannello");
        System.out.println("Pannello numero" + NumPannello + " al 100%");
    }
}