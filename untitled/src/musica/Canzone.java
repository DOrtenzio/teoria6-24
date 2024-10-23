package musica;

public class Canzone {
    private String nomeCanzone;
    private String nomeArtista;
    private int tempo;

    public String getNomeCanzone() { return nomeCanzone; }
    public int getTempo() { return tempo; }
    public String getNomeArtista() { return nomeArtista; }

    public void setNomeArtista(String nomeArtista) { this.nomeArtista = nomeArtista; }
    public void setNomeCanzone(String nomeCanzone) { this.nomeCanzone = nomeCanzone; }
    public void setTempo(int tempo) {
        if (tempo<0)
            this.tempo = 0;
        else
            this.tempo = tempo;
    }

    public Canzone(String nomeCanzone,String nomeArtista,int tempo){
        this.nomeCanzone=nomeCanzone;
        this.nomeArtista=nomeArtista;
        setTempo(tempo);
    }
    public Canzone(){
        this("sconosciuto","sconosciuto",0);
    }

    public String toString(){
        return "Nome canzone:"+this.nomeCanzone+" Nome artista:"+this.nomeArtista+" durata: "+this.tempo;
    }
}
