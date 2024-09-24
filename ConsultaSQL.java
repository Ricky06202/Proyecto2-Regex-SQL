import java.util.Scanner;

/**
 * ConsultaSQL
 */
public class ConsultaSQL {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingresa una consulta SQL");
		String consulta = scanner.nextLine();

		Validaciones validar = new Validaciones();
		for (String palabra : consulta.split(" ")) {
			System.out.print("'" + palabra + "' es: ");
			if (validar.palabrasClave(palabra))
				System.out.println("Palabra clave");
			else if (validar.operadoresLogicos(palabra))
				System.out.println("Operador lógico");
			else if (validar.operadoresRelacionales(palabra))
				System.out.println("Operador relacional");
			else if (validar.constante(palabra))
				System.out.println("Constante");
			else if (validar.identificador(palabra))
				System.out.println("Identificador de tabla o columna");
			else
				System.out.println("Error Léxico");
		}
	}
}