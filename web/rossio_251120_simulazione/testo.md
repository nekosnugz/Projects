## Tecnologie e progettazione di sistemi informatici e di telecomunicazioni
# Verifica del 20.11.2025

In questo progetto creerete un'applicazione web che vi permetta di tirare dadi di forma distinta tenendo il conto del punteggio realizzato con successivi lanci di dado.

---

**Avvertenze**

- E' consentito l'utilizzo di Visual Studio Code o di qualunque altro editor di testo.

- Non è consentito l'utilizzo di estensioni per l'editor o per il browser che suggeriscano porzioni di codice già pronto. 

- Non è consentito, per nessuna ragione, tenere vicino il telefono durante la prova: potete lasciarlo sulla cattedra o nel vostro zaino (se questi è riposto, come da norme di sicurezza, lontano dalle postazioni).

- In caso di rallentamenti del sistema `http://172.20.0.22/codarapietro/subsys/` o difficoltà nella consultazione della documentazione sul server `172.20.0.20` provate con l'altro browser. Nella maggior parte dei casi, per ragioni al momento non perfettamente note, *Microsoft Edge* funziona meglio. 

- Se non sapete risolvere qualche punto indispensabile per progredire nel progetto, semplificate le richieste segnalando con un commento le scelte fatte.

- Siete liberi di implementare funzioni e metodi aggiuntivi non espressamente richiesti che vi facilitino l'implementazione del progetto.

- Risolvete gli esercizi in ordine, assicurandovi di aver completato correttamente un punto prima di passare al successivo. Lavorate senza troppa fretta: meglio fare un po' meno, ma bene, che tutto in maniera approssimativa. Se vi bloccate su un punto, commentate il codice non funzionante, implementate una soluzione provvisoria e veloce (vedi quanto scritto sopra) e proseguite.

- Leggete tutto il testo prima di iniziare.

---

### Parte 1
Predisponete una pagina web contenente solamente un titolo: *Lancio dei dadi*.
In questa prima parte implementerete alcune funzioni che non aggiungeranno nulla al contenuto della pagina, ma stamperanno alcune informazioni sulla console. Le funzioni implementate vi torneranno utili in seguito. 

### 1.1
Come prima cosa create in Javascript un oggetto letterale per descrivere un dado. Il vostro oggetto dovrà avere le seguenti tre proprietà (tra parentesi il tipo di dato delle proprietà).
- `tipo`: la tipologia di dado (una stringa)
- `facce`: il numero di facce del dado (un numero)
- `punteggi`:  i punteggi presenti sulle facce del dado (un array di numeri interi)

Decidete voi che valori dare alle proprietà dell'oggetto. Un esempio è il dado classico, di `tipo` *d6*, con *6* `facce` aventi punteggi *1*, *2*, *3*, *4*, *5* e *6*. Potete considerare anche altri tipi di dado, ad esempio dadi *d4* con *4* facce, *d8* con 8 facce, etc. Potete anche inventare voi una vostra tipologia di dadi.

Dopo aver creato l'oggetto, stampate sulla console tutte le sue proprietà, ad una ad una.

### 1.2
Implementate una funzione chiamata `lanciaDado`. La funzione `lanciaDado()` deve ricevere un solo parametro, un oggetto *di tipo dado* (si intende un oggetto con le stesse proprietà di quello descritto al punto 1.1), e restituire un punteggio a caso tra quelli presenti sulle facce del dado.

Per la selezione casuale, potete utilizzare la funzione `Math.random()`, che restituisce un numero in virgola mobile compreso tra 0 (incluso) e 1 (escluso). Potrebbe inoltre servirvi la funzione `Math.floor()` che riceve un numero in virgola mobile e restituisce il più grande intero inferiore a quel numero. 

Ricordate inoltre che un array Javascript contiene una proprietà `length` che ne descrive la lunghezza.

Dopo aver implementato la funzione, stampate sulla console il valore restituito quando viene passato come argomento l'oggetto creato al punto 1.1.

### 1.3
Implementate una funzione chiamata `mostraLancio` che riceva come parametri un oggetto *di tipo dado* e un *id* e che non restituisca nulla. La funzione scriverà all'interno dell'elemento HTML avente *id* come identificativo:
- la tipologia e il numero di facce del dado ricevuto come parametro,
- il valore ottenuto effettuando un lancio del dado, ovvero invocando la funzione `lanciaDado()` implementata al punto 1.2 sul dado ricevuto come parametro.

Se volete testare questa funzione, fatelo da console, in modo che all'apertura della pagina continui a essere visibile solamente il titolo.

### 1.4
Create un array contenente 3 oggetti *di tipo dado*. Riempite gli oggetti come volete, purché le proprietà degli oggetti abbiano valori distinti.

### Parte 2
In questa parte, sfruttando quanto fatto nella parte precedente, riempirete di contenuto la vostra pagina web, che per ora dovrebbe contenere solo un titolo (e del codice Javascript che stampa qualcosa in console).

### 2.1
Aggiungete sotto il titolo tre pulsanti con la scritta *Lancia dado 1*, *Lancia dado 2* e *Lancia dado 3*.

Alla pressione del pulsante *Lancia dado n* visualizzate sulla pagina:
- la tipologia e il numero di facce dell'*n*-esimo dado dell'array creato al punto 1.4,
- il valore ottenuto effettuando un lancio del dado, ovvero invocando la funzione `lanciaDado()` implementata al punto 1.2 sul dado in questione.

Per visualizzare queste informazioni potete invocare in maniera opportuna la funzione `mostraLancio()`.

Se nella pagina è già visualizzato il risultato di un precedente lancio, potete sovrascriverlo.

### 2.2
Aggiungete la possibilità di tener conto del punteggio totale realizzato dopo vari lanci. Visualizzate il punteggio totale sotto le informazioni relative all'ultimo lancio realizzato. Per effettuare il conteggio potete utilizzare, ad esempio, una variabile globale. 

Aggiungete inoltre un pulsante per azzerare il conteggio. All'azzeramento del conteggio deve anche essere rimosso dalla pagina l'ultimo lancio realizzato.

### Parte 3
Se ancora non l'avete fatto personalizzate l'aspetto grafico della vostra pagina con CSS, in modo da rendere la pagina più gradevole. Aggiungete inoltre un pulsante *Supertiro* che lanci i 3 dadi contemporaneamente, visualizzi sulla pagina, su 3 colonne, informazioni sui punteggi realizzati sui 3 dati e aggiunga tutti e 3 i punteggi al punteggio totale.

### Valutazione
Oltre che sui singoli punti risolti, la valutazione si baserà sulla qualità del codice e sull'assenza di errori. Non è necessario svolgere tutta la prova per arrivare alla sufficienza, ma occorre mostrare di saper utilizzare sufficientemente bene il linguaggio e le sue strutture fondamentali (oggetti e array, elementi HTML, eventi o altro). Indicativamente, un'ottima risoluzione della Parte 1 potrebbe bastare.

### Consegna dell'elaborato e documentazione
Consegnerete la vostra prova di verifica in un unico file zip mediante la stessa piattaforma *subsys* che avete usato per scaricare questo testo: 
`http://172.20.0.22/codarapietro/subsys/`

Dovrete accedere alla piattaforma utilizzando il codice temporaneo che avete ricevuto.

In caso di problemi seguite le istruzioni del docente.

Per quanto riguarda la documentazione, durante la verifica potete consultare **esclusivamente** questo materiale:
- tutto ciò che avete salvato sul vostro PC *prima* di questa prova;
- la documentazione disponibile agli indirizzi:

    `http://172.20.0.20/codarapietro/manuali/w3s`

    `http://172.20.0.20/codarapietro/manuali/php`

    `http://172.20.0.20/codarapietro/manuali/bootstrap`