import java.util.ArrayList;

public class Parqueadero {
    private ArrayList<Vehiculo> vehiculos;

    // Constructor
    public Parqueadero() {
        vehiculos = new ArrayList<>();
    }

    // Métodos principales
    public void registrarVehiculo(String placa, String marca, String modelo, String propietario) {
        Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, modelo, propietario);
        vehiculos.add(nuevoVehiculo);
        System.out.println("\nVehículo registrado exitosamente.");
    }

    public void consultarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("\nVehículo encontrado:");
                System.out.println(vehiculo);
                return;
            }
        }
        System.out.println("\nNo se encontró un vehículo con la placa especificada.");
    }

    public void actualizarVehiculo(String placa, String nuevaMarca, String nuevoModelo, String nuevoPropietario) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                vehiculo.setMarca(nuevaMarca);
                vehiculo.setModelo(nuevoModelo);
                vehiculo.setPropietario(nuevoPropietario);
                System.out.println("\nVehículo actualizado exitosamente.");
                return;
            }
        }
        System.out.println("\nNo se encontró un vehículo con la placa especificada.");
    }

    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("\nNo hay vehículos registrados.");
        } else {
            System.out.println("\nLista de vehículos registrados:");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }
        }
    }
}
