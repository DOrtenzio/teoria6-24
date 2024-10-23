package musica;

public class TestPlaylist {
    public static void main(String[] args) {
        Playlist miaPlaylist=new Playlist();
        System.out.println("Num canzoni: "+miaPlaylist.getNumeroCanzoniInserite());
        Canzone c1=new Canzone("Stavo pensando a te","Fabri Fibra",264);
        if (miaPlaylist.aggiungiCanzone(c1))
            System.out.println("V");
        else
            System.out.println("X");
        if (miaPlaylist.aggiungiCanzone("Icon","Tony Effe",128))
            System.out.println("V");
        else
            System.out.println("X");
        if (miaPlaylist.aggiungiCanzone("Guersacè","Gue Pequeno",218))
            System.out.println("V");
        else
            System.out.println("X");
        System.out.println("Num canzoni: "+miaPlaylist.getNumeroCanzoniInserite());
        System.out.println(miaPlaylist.toString());
        Canzone [] c= miaPlaylist.ricercaCanzoni("Tony Effe");
        for (int i=0;i<c.length;i++){
            System.out.println(c[i].toString());
        }
        System.out.println("Ricerca catante di Icon: "+miaPlaylist.ricercaCantante("Icon"));
    }
}