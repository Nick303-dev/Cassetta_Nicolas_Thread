/**
 * @author Cassetta Nicolas - Classe 5CINF
 * @version 1.0
 *
 *     Questa Classe estende Thread e simula la creazione di un cassetto di un mobile
 *     mostrando a schermo la percentuale di completamento
 */
class CassettoMobile extends Thread {
    private final int numCassetto;

    public CassettoMobile(int numCassetto) {
        this.numCassetto = numCassetto;
    }
@Override
    public void run() {
        System.out.println("Creo il Cassetto numero" + numCassetto);
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prendo il legno dal magazzino");
        System.out.println("Cassetto numero" + numCassetto + "al 25%");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("taglio il legno");
        System.out.println("Cassetto numero" + numCassetto + "al 50%");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("lavoro il legno");
        System.out.println("Cassetto numero" + numCassetto + "al 75%");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("vernicio il Cassetto");
        System.out.println("Cassetto numero" + numCassetto + "al 100%");
   }
}