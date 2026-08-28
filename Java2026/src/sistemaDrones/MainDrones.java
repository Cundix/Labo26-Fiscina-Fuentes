package sistemaDrones;

public class MainDrones {
    public static void main(String[] args) {
        Carga carga1 = new Carga();
        Carga carga2 = new Carga();
        Vigilancia vigilancia1 = new Vigilancia(10, 1);
        Vigilancia vigilancia2 = new Vigilancia(1000000000, 2);

        carga1.ejecutarMision(-34.5791, -58.49579372579535);
        carga2.ejecutarMision(-34.755142427902214, -71.0885016744234);


        vigilancia1.ejecutarMision(-34.755142427902214, -58.4985016744234);
        vigilancia2.ejecutarMision(-34.755142427902214, -71.0885016744234);


    }
}
