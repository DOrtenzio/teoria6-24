## Esercizio sulle classi composte
### Scrivere una classe Canzone avente tre attributi: il nome della canzone, il nome del cantante (o della band) e la durata in secondi della canzone. 
Tale classe deve implementare : 
- i metodi set e get per tutti gli attributi
- due costruttori:
  - il costruttore privo di parametri che assegna il valore “sconosciuto” al nome della canzone e del cantante e 0 alla durata.
  - il costruttore che prende i tre parametri e inizializza opportunamente le variabili di istanza
- il metodo String toString() che restituisce una descrizione testuale dell’oggetto sotto forma
di stringa.

### Scrivere, poi, la classe Playlist che contiene l’attributo miaPlaylist che è un array di oggetti di tipo Canzone.
Tale classe deve implementare :
- il metodo get e il metodo set
- il costruttore privo di parametri che crea un array vuoto di max 100 elementi
- un metodo che restituisce il numero di canzoni presenti nella playlist
- il metodo aggiungiCanzone() che prende come parametro la canzone da aggiungere alla playlist
- il metodo aggiungiCanzone() che prende come parametri il nome della canzone, il nome del cantante (o della band) e la durata in secondi della canzone da aggiungere alla playlist
- il metodo cancellaCanzone() che prende come parametro la canzone da cancellare dalla playlist
- il metodo ricercaCantante() che prende come parametro il titolo della canzone da ricercare e restituisce il cantante (o la band) che canta quella canzone.
- il metodo ricercaCanzoni() che prende come parametro il nome del cantante (o della band) di cui si vuol conoscere le canzoni e restituisce un array con le canzoni (oggetti) del cantante (o della band) cercato
- il metodo String toString() che restituisce l’array sotto forma di stringa. La stringa restituita ha la forma "[el-1, el-2, ..., el-n]" dove el-i sono oggetti di tipo Canzone

### Scrivere, infine, la classe TestPlaylist che contiene il metodo main(). 
Tale classe deve implementare:
- creare un oggetto di tipo Playlist
- restituire il numero di canzoni presenti in playlist richiamando il metodo opportuno
- aggiungere tre oggetti canzoni alla playlist usando entrambi i metodi aggiungiCanzone()
- restituire il numero di canzoni presenti in playlist richiamando il metodo opportuno
- cancellare una canzone
- ricercare le canzoni dato il nome del cantante (o della band) e visualizzare a video il risultato
- ricercare un cantante dato il nome di un titolo di una canzone e visualizzare a video il risultato
