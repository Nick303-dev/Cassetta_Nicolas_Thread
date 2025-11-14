public class ManigliaMobile extends Thread {
    private final int NumManiglia;

    public ManigliaMobile(int numManiglia) {
        NumManiglia = numManiglia;
    }
    @Override
    public void run() {
        System.out.println("Creo la Maniglia numero " + NumManiglia);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prendo il legno dal magazzino");
        System.out.println("Maniglia numero" + NumManiglia + " al 25%");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("taglio il legno");
        System.out.println("Maniglia numero " + NumManiglia + " al 50%");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("lavoro il legno");
        System.out.println("Maniglia numero " + NumManiglia + " al 75%");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("vernicio la Maniglia");
        System.out.println("Maniglia numero " + NumManiglia + " al 100%");
    }
}
