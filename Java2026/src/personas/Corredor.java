package personas;

import escuela.Materias;
import fechas.Fecha;

public class Corredor extends Persona
{

        private int maxVel;
        private int carrerasGanadas;
        private int carrerasTotales;

        public int getMaxVel() {return this.maxVel;}
        public int getCarrerasGanadas() {return this.carrerasGanadas;}
        public int getCarrerasTotales() {return this.carrerasTotales;}

        public void setMaxVel(int maxVel) {this.maxVel = maxVel;}
        public void setCarrerasGanadas(int carrerasGanadas) {this.carrerasGanadas = carrerasGanadas;}
        public void setCarrerasTotales(int carrerasTotales) {this.carrerasTotales = carrerasTotales;}

        public float getWinRate()
        {
            return (float) (this.carrerasGanadas * 100)/this.carrerasTotales;
        }

        public Corredor()
        {
            super();
            this.maxVel = 30;
            this.carrerasGanadas = 10;
            this.carrerasTotales = 10;

        }
        public Corredor(String nombre, String apellido, int edad, Fecha fechaNacimiento, String direccion, int maxVel, int carrerasGanadas, int carrerasTotales)
        {
            super(nombre, apellido, edad, fechaNacimiento, direccion);
            this.maxVel = maxVel;
            this.carrerasGanadas = carrerasGanadas;
            this.carrerasTotales = carrerasTotales;
        }
        public Corredor whoIsFaster(Corredor Corredor2)
        {
            if(this.maxVel < Corredor2.getMaxVel()) {return Corredor2;}
            else return this;
        }

        public Corredor whoWinsMoreFrequently(Corredor corredor2)
        {
            if(this.getWinRate() > corredor2.getWinRate()) return this;
            else return corredor2;
        }

        public static void main(String[]args)
        {
            Corredor Corredor1 = new Corredor();
            Corredor Corredor2 = new Corredor();

            Corredor corredorMasRapido = Corredor1.whoIsFaster(Corredor2);
            System.out.println("El corredor mas rápido es: " + corredorMasRapido.getNombre());

            Corredor corredorMasGanador = Corredor1.whoWinsMoreFrequently(Corredor2);
            System.out.println("El corredor que gana con mayor frecuencia es: " + corredorMasGanador.getNombre());
        }



}
