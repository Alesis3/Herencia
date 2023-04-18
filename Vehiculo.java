public class Vehiculo {

    protected String tipo;
    protected String terreno;
    protected String tipoDeCombustible;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String terreno, String tipoDeCombustible) {
        this.tipo = tipo;
        this.terreno = terreno;
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", terreno='" + terreno + '\'' +
                ", tipoDeCombustible='" + tipoDeCombustible + '\'' +
                '}';
    }
    public void avanzar (){
        System.out.println("El vehiculo avanza chuchu");
    }
    public boolean estado(){
        System.out.println("Esta encendido");
        return true;
    }

}
