# TPSI
## Tecnologie e progettazione di sistemi informatici e di telecomunicazioni (Prof. Pietro Codara)

## Classe 4G
## Verifica del 27/11/25

---

**Avvertenze**

* Non è consentito l’uso di estensioni dell’editor o del browser che suggeriscono codice già pronto.
* Non è consentito tenere il telefono vicino durante la prova.
* In caso di lentezza del sistema o problemi con la documentazione sul server, cambiate browser (Firefox consigliato).
* Se un punto blocca il progetto, semplificatelo motivando le scelte con un commento nel codice.
* È possibile aggiungere funzioni o metodi di supporto.
* Leggete l’intero testo prima di iniziare.
* Consegnate codice funzionante, commentando eventuali parti che provocano errori.

---

## Tema: poligoni regolari

**Premessa.** Un poligono regolare è un poligono convesso che è contemporaneamente equilatero (cioè ha tutti i lati congruenti fra loro) ed equiangolo. Un poligono regolare con 3 lati è un triangolo equilatero, con 4 un quadrato, con 5 un pentagono regolare, con 6 un esagono regolare, e così via.  (Per approfondimenti: [Poligono regolare - Wikipedia](https://it.wikipedia.org/wiki/Poligono_regolare))

### Compiti da svolgere

1. Preparate un oggetto letterale `poligono` con le proprietà:  
   - `lato` (la dimensione del lato del poligono)  
   - `num` (il numero di lati del poligono)  
   
   Nota: d'ora in poi chiameremo *poligono* ogni oggetto di questo tipo.

2. Implementate una funzione `perimetro()` che riceve in ingresso un *poligono* e ne restituisce il perimetro.

3. Implementate una funzione `aggiungiLato()` in grado di trasformate un *poligono* ricevuto come parametro nel poligono regolare con un lato in più, mantenendo invariata la dimensione del lato. La funzione aggiungi lato deve restituire il numero di lati aggiornato.

4. Implementate una funzione `modificaPoligono()` che riceve come parametri  un *poligono* e un intero `newNum` e trasforma il poligono nel poligono regolare con `newNum` lati, mantenendo invariata la dimensione del lato. La funzione `modificaPoligono()` non deve restituire nulla.

5. Testate attentamente tutte le funzioni implementate su un *poligono* a piacere.

6. Costruite un array `figure` e riempitelo con 5 *poligoni* a piacere. Visualizzate in una tabella HTML: numero di lati, dimensione del lato e perimetro, calcolato mediante la funzione `perimetro()`, di ogni *poligono* nell'array. Ecco un esempio di come deve essere strutturata la tabella:
   
   **Poligoni**

   | Numero lati | Dimensione lato | Perimetro    |
   |-------------|-----------------|--------------|
   | 5           | 10.5            | 52.50        |
   | 3           | 7               | 21.00        |
   | 4           | 4               | 16.00        |
   | 4           | 3               | 12.00        |
   | 8           | 1               | 8.00         |

   Per visualizzare numeri con un numero fisso di cifre decimali, potete usare il metodo `toFixed()` degli oggetti di tipo `Number`, che riceve come parametro il numero di cifre decimali desiderate e restituisce una stringa con il numero formattato.
   
7. Utilizzando le funzioni implementate in precedenza, modificate i *poligoni* nell'array, aggiungendo un lato ai primi due *poligoni* e trasformando in triangoli gli altri 3. Visualizzate in una tabella HTML le proprietà di ogni poligono del nuovo array. Ecco un esempio:
   
   **Poligoni dopo le modifiche**

   | Numero lati | Dimensione lato | Perimetro    |
   |-------------|-----------------|--------------|
   | 6           | 10.5            | 63.00        |
   | 4           | 7               | 28.00        |
   | 3           | 4               | 12.00        |
   | 3           | 3               | 9.00         |
   | 3           | 1               | 3.00         |

8. Implementate una funzione `estraiTriangoli()` che riceve in ingresso un array di *poligoni* e restituisce un nuovo array, eventualmente vuoto, contenente tutti i triangoli (i *poligoni* di tipo triangolo) dell'array passato come parametro. Invocate la funzione `estraiTriangoli()` sull'array ottenuto nel punto precedente e visualizzate il contenuto dell'array restituito in una tabella HTML.  Ecco un esempio:

   **Triangoli estratti**

   | Numero lati | Dimensione lato | Perimetro    |
   |-------------|-----------------|--------------|
   | 3           | 4               | 12.00        |
   | 3           | 3               | 9.00         |
   | 3           | 1               | 3.00         |

9. Inserite sopra alla seconda tabella (punto 7) tre pulsanti (non necessariamente elementi di tipo `button`) con scritte **Triangoli**, **Quadrati** e **Pentagoni**. Fate in modo che al passaggio del mouse su uno dei pulsanti, vengano evidenziate (ad esempio cambiando il colore di sfondo della riga) tutte le righe della tabella corrispondenti ai poligoni del tipo indicato sul pulsante. Ad esempio, passando sul pulsante **Triangoli** devono essere evidenziate tutte le righe della tabella corrispondenti ai triangoli. Per gestire questo comportamento potete usare l'evento `mouseover` o `mouseenter`. Se non sapete gestire questi eventi potete gestire l'evento `click`. Suggerimento: potete anche ridisegnare l'intera tabella.
  

---

### Valutazione

Oltre che sui singoli punti risolti, la valutazione si baserà sulla qualità del codice e sull'assenza di errori. Non è necessario svolgere tutta la prova per arrivare alla sufficienza, ma occorre mostrare di saper utilizzare sufficientemente bene il linguaggio e le sue strutture fondamentali.

### Consegna dell'elaborato e documentazione

Consegnerete la vostra prova di verifica in un unico file zip mediante la stessa piattaforma *subsys* `http://172.20.0.22/codarapietro/subsys/` alla quale dovrete accedere utilizzando il codice temporaneo che avete ricevuto.

In caso di problemi seguite le istruzioni del docente.

Per quanto riguarda la documentazione, durante la verifica potete consultare **esclusivamente** questo materiale:
* tutto ciò che avete salvato sul vostro PC *prima* di questa prova;
* la documentazione disponibile agli indirizzi:

    `http://172.20.0.20/codarapietro/manuali/w3s`

    `http://172.20.0.20/codarapietro/manuali/php`

    `http://172.20.0.20/codarapietro/manuali/bootstrap`
* materiale cartaceo personale (libri, appunti, ecc.).