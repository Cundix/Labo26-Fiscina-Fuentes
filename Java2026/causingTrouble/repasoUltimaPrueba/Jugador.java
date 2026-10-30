package repasoUltimaPrueba;

import personas.Persona;

import java.lang.reflect.Array;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.HashSet;

public class Jugador extends Persona {
    private int energia;
    private String numeroParticipante;
    private ArrayList<String> recompensas;
    private int riesgo;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNumeroParticipante() {
        return numeroParticipante;
    }

    public void setNumeroParticipante(String numeroParticipante) {
        this.numeroParticipante = numeroParticipante;
    }

    public ArrayList<String> getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(ArrayList<String> recompensas) {
        this.recompensas = recompensas;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public void realizarPrueba(Prueba p) throws FaltaEnergiaExeption
    {
        if(this.energia < 20) throw new FaltaEnergiaExeption("No hay energia suficiente", this.energia);
        this.restarEnergia();
        this.recibirDanio();

    }

    public void recargarEnergia()
    {
        this.energia += 10;
    }

    public void recibirDanio()
    {
        this.riesgo += 10;
    }

    public void restarEnergia()
    {
        this.energia -= 10;
    }
}
