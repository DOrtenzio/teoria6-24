package musica;

public class Playlist {
    private Canzone [] miaPlaylist;
    private int inserite;

    public Canzone[] getMiaPlaylist() { return miaPlaylist; }
    public void setMiaPlaylist(Canzone[] miaPlaylist) { this.miaPlaylist = miaPlaylist; }

    public Playlist(){
        this.miaPlaylist=new Canzone[100];
        this.inserite=0;
    }

    public int getNumeroCanzoniInserite(){ return this.inserite; }
    public boolean aggiungiCanzone(Canzone canzoneNuova){
        if (this.inserite==this.miaPlaylist.length)
            return false;
        else{
            miaPlaylist[this.inserite]=canzoneNuova;
            this.inserite++;
            return true;
        }
    }
    public boolean aggiungiCanzone(String nomeCanzone,String nomeArtista,int tempo){
        if (this.inserite==this.miaPlaylist.length)
            return false;
        else{
            miaPlaylist[this.inserite]=new Canzone(nomeCanzone,nomeArtista,tempo);
            this.inserite++;
            return true;
        }
    }
    public boolean cancellaCanzone(Canzone cancellare){
        int posizione=-1;
        for (int i=0;i<this.inserite;i++){
            if (cancellare.getNomeCanzone().equals(miaPlaylist[i].getNomeCanzone())&&cancellare.getNomeArtista().equals(miaPlaylist[i].getNomeArtista())&&cancellare.getTempo()==miaPlaylist[i].getTempo()){
                posizione=i;
                break;
            }
        }
        if (posizione==-1)
            return false;
        else{
            for (int l=posizione;l<this.inserite-1;l++){
                miaPlaylist[l]=miaPlaylist[l+1];
            }
            return true;
        }
    }
    public String ricercaCantante(String titolo){
        for (int i=0;i<this.inserite;i++){
            if (titolo.equals(miaPlaylist[i].getNomeCanzone()))
                return miaPlaylist[i].getNomeArtista();
        }
        return "Non trovato";
    }
    public Canzone [] ricercaCanzoni(String nomeArtista){
        int [] posizioni=new int[this.inserite];
        int ins=0;
        for (int i=0;i<this.inserite;i++){
            if (nomeArtista.equals(miaPlaylist[i].getNomeArtista())){
                posizioni[ins]=i;
                ins++;
            }
        }
        Canzone [] canzoniArtista=new Canzone[ins];
        for (int l=0;l<ins;l++){
            canzoniArtista[l]=new Canzone(miaPlaylist[posizioni[l]].getNomeCanzone(),miaPlaylist[posizioni[l]].getNomeArtista(),miaPlaylist[posizioni[l]].getTempo());
        }
        return canzoniArtista;
    }
    public String toString(){
        String s="[ ";
        for (int i=0;i<this.inserite;i++){
            s=s+this.miaPlaylist[i].toString()+" , ";
        }
        s=s+" ]";
        return s;
    }

}
