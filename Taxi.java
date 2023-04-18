import java.awt.*;

public class Taxi  extends Automovil{

    private String localidad;
    private double tarifa;
    private String condicion;

    public Taxi() {
    }

    public Taxi(String tipo, String terreno, String tipoDeCombustible, String marca, String modelo, Color color, String localidad, double tarifa, String condicion) {
        super(tipo, terreno, tipoDeCombustible, marca, modelo, color);
        this.localidad = localidad;
        this.tarifa = tarifa;
        this.condicion = condicion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "localidad='" + localidad + '\'' +
                ", tarifa=" + tarifa +
                ", condicion='" + condicion + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", tipo='" + tipo + '\'' +
                ", terreno='" + terreno + '\'' +
                ", tipoDeCombustible='" + tipoDeCombustible + '\'' +
                '}';
    }
    public String pasaje(){
        System.out.println("Tiene pasaje");
        return null;
    }
    public boolean servicio(){
        System.out.println("Esta en servicio");
        return true;
    }

    @Override
    public double velocidad() {
        System.out.println(50 + "km/h");
        return 0;
    }

    @Override
    public String radio() {
        System.out.println("El radio esta encendido");
        return null;
    }

    @Override
    public boolean estado() {
        System.out.println("encendido");
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Esta avanzando fiuuum");
    }
}
