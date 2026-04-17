import java.util.ArrayList;

public class CD {

    private ArrayList<Cancion> songList;


    public CD() {
        songList = new ArrayList<>();
    }

    public CD(ArrayList<Cancion> songList) {
        this.songList = new ArrayList<>();
        this.songList.addAll(songList);
    }

    public ArrayList<Cancion> getSongList()
    {
        return this.songList;
    }

    public void setSongList(ArrayList<Cancion> songList)
    {
        this.songList = songList;
    }

    public int numeroCanciones()
    {
        return this.songList.size();
    }

    public Cancion verCancion(int index)
    {
        return this.songList.get(index);
    }

    public void grabarCancion(int index, Cancion cancion)
    {
        this.songList.set(index, cancion);
    }

    public void agregarCancion(Cancion cancion)
    {
        this.songList.add(cancion);
    }

    public void eliminarCancion(int index)
    {
        this.songList.remove(index);
    }

    public void listarCanciones()
    {
        int i = 0;

        for (Cancion cancion : this.songList)
        {
            i++;
            System.out.println("Track " + i + ": " + cancion.getTitulo());
        }
    }

    public static void main(String[] args) {
        CD awesomeMixVol1 = new CD();
    }
}
