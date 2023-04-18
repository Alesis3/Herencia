import java.awt.*;

public class Automovil extends Vehiculo {
    protected String marca;
    protected String modelo;
    protected Color color;

    public Automovil() {
    }

    public Automovil(String tipo, String terreno, String tipoDeCombustible, String marca, String modelo, Color color) {
        super(tipo, terreno, tipoDeCombustible);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", tipo='" + tipo + '\'' +
                ", terreno='" + terreno + '\'' +
                ", tipoDeCombustible='" + tipoDeCombustible + '\'' +
                '}';
    }
    public double velocidad(){
        System.out.println(100 + "km/h");
        return 0;
    }
    public String radio(){
        System.out.println("Esta sonando la Q buena");
        return null;
    }

    @Override
    public boolean estado() {
        System.out.println("esta encendido");
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Esta avanzando ruuun");
    }

}
