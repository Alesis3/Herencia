import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehi = new Vehiculo("De carga", "Agua", "Gasolina");
        System.out.println(vehi);
        vehi.avanzar();
        vehi.estado();

        System.out.println("-----------------automovil----------------");

        Automovil auto = new Automovil("transporte",
                "tierra",
                "electrico",
                "tesla",
                "A3",
                Color.black);
        System.out.println( auto);
        auto.radio();
        auto.avanzar();
        auto.estado();
        auto.velocidad();

        System.out.println("-----------------taxi-----------");

        Taxi taxi = new Taxi("transporte publico",
                "Pavimento",
                "gasolina",
                "Seat",
                "toledo",
                Color.yellow,
                "neza",
                24,
                "buena");
        System.out.println(taxi);
        taxi.avanzar();
        taxi.estado();
        taxi.radio();
        taxi.servicio();
        taxi.pasaje();
        taxi.velocidad();

    }
}