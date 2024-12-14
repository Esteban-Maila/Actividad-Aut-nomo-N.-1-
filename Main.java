import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PARQUEADERO ===");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Consultar vehículo");
            System.out.println("3. Actualizar vehículo");
            System.out.println("4. Mostrar todos los vehículos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese la placa del vehículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del vehículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el propietario del vehículo: ");
                    String propietario = scanner.nextLine();
                    parqueadero.registrarVehiculo(placa, marca, modelo, propietario);
                    break;
                case 2:
                    System.out.print("\nIngrese la placa del vehículo a consultar: ");
                    String placaConsulta = scanner.nextLine();
                    parqueadero.consultarVehiculo(placaConsulta);
                    break;
                case 3:
                    System.out.print("\nIngrese la placa del vehículo a actualizar: ");
                    String placaActualizar = scanner.nextLine();
                    System.out.print("Ingrese la nueva marca del vehículo: ");
                    String nuevaMarca = scanner.nextLine();
                    System.out.print("Ingrese el nuevo modelo del vehículo: ");
                    String nuevoModelo = scanner.nextLine();
                    System.out.print("Ingrese el nuevo propietario del vehículo: ");
                    String nuevoPropietario = scanner.nextLine();
                    parqueadero.actualizarVehiculo(placaActualizar, nuevaMarca, nuevoModelo, nuevoPropietario);
                    break;
                case 4:
                    parqueadero.mostrarVehiculos();
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
