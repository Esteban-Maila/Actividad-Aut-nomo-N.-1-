public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String propietario;

    // Constructor
    public Vehiculo(String placa, String marca, String modelo, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    // Representación del vehículo en texto
    @Override
    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Propietario: " + propietario;
    }
}
