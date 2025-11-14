import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Cassetta Nicolas - Classe 5CINF
 * @version 1.0
 *
 *     Questa classe gestisce la creazione di uno o più mobili, composti da pannelli,
 *     cassetti, ante e maniglie, mostrando a schermo la percentuale di completamento
 *     di ciascuna componente del mobile e infine la percentuale di completamento
 *     dell'assemblaggio del mobile stesso.
 */
public class Mobile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire il numero di mobili da produrre: ");
        int numMobili = input.nextInt();


        for (int i = 1; i <= numMobili; i++){

            ArrayList<Thread> processi = new ArrayList<>();

            processi.add(new PannelloMobile(1));
            processi.add(new PannelloMobile(2));
            processi.add(new PannelloMobile(3));
            processi.add(new PannelloMobile(4));
            processi.add(new CassettoMobile(1));
            processi.add(new CassettoMobile(2));
            processi.add(new ManigliaMobile(1));
            processi.add(new ManigliaMobile(2));
            processi.add(new ManigliaMobile(3));
            // Avvio di tutti i thread
            for (int j = 0; j < processi.size(); j++) {
                processi.get(j).start();
            }

            // Attesa del completamento di tutti i thread
            for (int k = 0; k < processi.size(); k++){
                try{
                    processi.get(k).join();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("assemblamento del mobile");
        for (int j = 0; j <= 100; j+=10) {
            System.out.println("Mobile pronto al " + j + "%");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Mobile costruito numero" + numMobili);
    }
}

