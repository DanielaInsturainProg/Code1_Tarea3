//Codigo 1/2 Actividad n3
//Toma datos de ingreso a un PH
import java.util.Scanner;

public class Code1_Tarea3 {
    public static void main(String[] args) {
        // Crear el objeto Scanner para capturar entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        String ID;
        int numero_apartamento;
        String nombre_propietario;

        // Capturar datos del usuario
        System.out.print("Digite su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Digite su ID: ");
        ID = entrada.nextLine();
        System.out.print("Digite el número del apartamento: ");
        numero_apartamento = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite el nombre del propietario: ");
        nombre_propietario = entrada.nextLine();

        // Crear la cadena concatenada
        String datosConcatenados = "Nombre: " + nombre + ", ID: " + ID +
                ", Número del apartamento: " + numero_apartamento +
                ", Nombre del propietario: " + nombre_propietario;

        // Mostrar los datos del visitante
        System.out.println("Datos del visitante: " + datosConcatenados);
    }
}