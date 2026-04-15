import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> songList = new ArrayList();

    public ArrayList getSongList()
    {
        return this.songList;
    }
    public void setSongList(ArrayList<Cancion> songList)
    {
        this.songList = songList;
    }
    public int cantCanciones()
    {
        return this.songList.size();
    }
    public Cancion getCancion(int index)
    {
        return this.songList.get(index);
    }
    public void setCancion(int index, Cancion cancion)
    {
        this.songList.set(index, cancion);
    }
    public void addSong(Cancion cancion)
    {
        this.songList.add(cancion);
    }
    public void removeSong(Cancion cancion)
    {
        this.songList.remove(cancion);
    }
    public void showCanciones()
    {
        int i = 0;
        for (Cancion cancion : this.songList)
        {
            i++;
            System.out.println("Track " + i + ": " + cancion.getTitulo());
        }
    }
}
