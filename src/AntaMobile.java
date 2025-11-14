/**
 * @author Cassetta Nicolas - Classe 5CINF
 * @version 1.0
 *
 * Questa Classe estende Thread e simula la creazione dell'anta di un mobile
 * mostrando a schermo la percentuale di completamento
 */
class AntaMobile extends Thread {
    @Override
    public void run() {
        System.out.println("Creo l'anta del mobile");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prendo il legno dal magazzino");
        System.out.println("Anta del mobile pronta al 25%");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("taglio il legno");
        System.out.println("Anta del mobile pronta al 50%");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("lavoro il legno");
        System.out.println("Anta del mobile pronta al 75%");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("vernicio l'anta");
        System.out.println("Anta del mobile pronta al 100%");


    }
}