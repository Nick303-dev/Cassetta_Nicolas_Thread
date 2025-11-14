# Simulazione Produzione Mobili

## Autore
Cassetta Nicolas Classe 5CINF

## Descrizione
Questo progetto in Java simula, tramite thread, il processo di produzione di uno o più mobili. Ogni mobile è composto da:
* 4 pannelli
* 2 cassetti
* 1 anta
* Maniglie 

Ogni componente viene costruito in parallelo (grazie ai thread) e mostra a schermo la percentuale di completamento. Al termine della costruzione di tutte le parti, viene simulato anche l'assemblaggio finale del mobile.

## Struttura del progetto
Il progetto è composto da cinque classi principali:

### 1. PannelloMobile
Estende Thread e simula la creazione di un singolo pannello del mobile, mostrando la percentuale di completamento ogni 25%.

### 2. CassettoMobile
Estende Thread e simula la creazione di un cassetto del mobile, anch'esso con aggiornamenti di avanzamento.

### 3. AntaMobile
Estende Thread e simula la creazione dell'anta del mobile, mostrando a schermo la percentuale di completamento.

### 4. ManigliaMobile
Estende Thread e simula la creazione delle maniglie del mobile, con aggiornamenti progressivi.

### 5. Mobile
Contiene il metodo main e gestisce:
* la richiesta del numero di mobili da produrre,
* l'avvio in parallelo dei thread delle varie parti,
* l'attesa del completamento di tutti i thread (join()),
* la simulazione dell'assemblaggio finale.

Il programma mostrerà a schermo l'avanzamento della costruzione di ogni parte e l'assemblaggio finale.

## Note
* Ogni parte del mobile (pannello, cassetto, anta, maniglie) viene eseguita in thread separati per simulare una produzione parallela.
* I tempi di produzione sono differenziati per ogni componente per rendere la simulazione più realistica:
    - Pannelli: 750ms per step
    - Cassetti: 500ms per step
    - Anta: 500ms per step
    - Maniglie: 300ms per step

## Esempio di output

``` Java
Inserire il numero di mobili da produrre: 1
Creo la Maniglia numero 1
Creo il pannello numero 4
Creo la Maniglia numero 2
Creo il pannello numero 1
Creo il pannello numero 2
Creo il Cassetto numero1
Creo la Maniglia numero 3
Creo il pannello numero 3
Creo il Cassetto numero2
prendo il legno dal magazzino
prendo il legno dal magazzino
prendo il legno dal magazzino
Maniglia numero1 al 25%
Maniglia numero2 al 25%
Maniglia numero3 al 25%
taglio il legno
taglio il legno
taglio il legno
Maniglia numero 3 al 50%
Maniglia numero 1 al 50%
Maniglia numero 2 al 50%
prendo il legno dal magazzino
prendo il legno dal magazzino
prendo il legno dal magazzino
prendo il legno dal magazzino
prendo il legno dal magazzino
prendo il legno dal magazzino
Cassetto numero1al 25%
Pannello numero1 al 25%
Pannello numero2 al 25%
Pannello numero4 al 25%
Cassetto numero2al 25%
Pannello numero3 al 25%
lavoro il legno
lavoro il legno
lavoro il legno
Maniglia numero 2 al 75%
Maniglia numero 1 al 75%
Maniglia numero 3 al 75%
vernicio la Maniglia
vernicio la Maniglia
vernicio la Maniglia
Maniglia numero 3 al 100%
Maniglia numero 2 al 100%
Maniglia numero 1 al 100%
taglio il legno
taglio il legno
taglio il legno
taglio il legno
taglio il legno
Cassetto numero2al 50%
taglio il legno
Pannello numero4 al 50%
Cassetto numero1al 50%
Pannello numero2 al 50%
Pannello numero1 al 50%
Pannello numero3 al 50%
lavoro il legno
lavoro il legno
lavoro il legno
lavoro il legno
Pannello numero3 al 75%
lavoro il legno
Pannello numero1 al 75%
lavoro il legno
Cassetto numero1al 75%
Pannello numero4 al 75%
Pannello numero2 al 75%
Cassetto numero2al 75%
vernicio il Pannello
vernicio il Cassetto
vernicio il Cassetto
vernicio il Pannello
vernicio il Pannello
vernicio il Pannello
Pannello numero4 al 100%
Pannello numero1 al 100%
Pannello numero3 al 100%
Cassetto numero1al 100%
Cassetto numero2al 100%
Pannello numero2 al 100%
assemblamento del mobile
Mobile pronto al 0%
Mobile pronto al 10%
Mobile pronto al 20%
Mobile pronto al 30%
Mobile pronto al 40%
Mobile pronto al 50%
Mobile pronto al 60%
Mobile pronto al 70%
Mobile pronto al 80%
Mobile pronto al 90%
Mobile pronto al 100%
Mobile costruito numero1

Process finished with exit code 0
```