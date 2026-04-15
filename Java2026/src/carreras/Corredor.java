package carreras;

public class Corredor {
        private String name;
        private String apellido;
        private int maxVel;
        private int carrerasGanadas;
        private int carrerasTotales;

        public String getName() {return this.name;}
        public String getApellido() {return this.apellido;}
        public int getMaxVel() {return this.maxVel;}
        public int getCarrerasGanadas() {return this.carrerasGanadas;}
        public int getCarrerasTotales() {return this.carrerasTotales;}

        public void setName(String name) {this.name = name;}
        public void setApellido(String apellido) {this.apellido = apellido;}
        public void setMaxVel(int maxVel) {this.maxVel = maxVel;}
        public void setCarrerasGanadas(int carrerasGanadas) {this.carrerasGanadas = carrerasGanadas;}
        public void setCarrerasTotales(int carrerasTotales) {this.carrerasTotales = carrerasTotales;}

        public float getWinRate()
        {
            return (float) (this.carrerasGanadas * 100)/this.carrerasTotales;
        }

        public Corredor()
        {
            this.name = "default";
            this.apellido = "default";
            this.maxVel = 30;
            this.carrerasGanadas = 10;
            this.carrerasTotales = 10;

        }

        public Corredor whoIsFaster(Corredor Corredor2)
        {
            if(this.maxVel < Corredor2.getMaxVel()) {return Corredor2;}
            else return this;
        }

        public Corredor(String name, String apellido, int maxVel, int carrerasGanadas, int carrerasTotales)
        {
            this.name = name;
            this.apellido = apellido;
            this.maxVel = maxVel;
            this.carrerasGanadas = carrerasGanadas;
            this.carrerasTotales = carrerasTotales;
        }

        public Corredor whoWinsMoreFrequently(Corredor corredor2)
        {
            if(this.getWinRate() > corredor2.getWinRate()) return this;
            else return corredor2;
        }

        public static void main(String[]args)
        {
            Corredor Corredor1 = new Corredor();
            Corredor Corredor2 = new Corredor("Pablo", "Clinton", 32, 100, 2000);

            Corredor corredorMasRapido = Corredor1.whoIsFaster(Corredor2);
            System.out.println("El corredor mas rápido es: " + corredorMasRapido.name);

            Corredor corredorMasGanador = Corredor1.whoWinsMoreFrequently(Corredor2);
            System.out.println("El corredor que gana con mayor frecuencia es: " + corredorMasGanador.name);
        }



}
