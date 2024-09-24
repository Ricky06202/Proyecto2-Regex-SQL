public class Validaciones {
	public boolean palabrasClave(String palabra) {
		String regex = "SELECT|FROM|WHERE|INSERT|DELETE|UPDATE";
		return palabra.toUpperCase().matches(regex);
	}

	public boolean operadoresLogicos(String palabra) {
		String regex = "AND|OR|NOT";
		return palabra.toUpperCase().matches(regex);
	}

	public boolean operadoresRelacionales(String palabra) {
		String regex = ">|<|>=|<=|=|!=|<>";
		return palabra.matches(regex);
	}

	public boolean constante(String palabra) {
		String regex = "\"[0-9a-zA-Z_]*\"|\\d+";
		return palabra.matches(regex);
	}

	public boolean identificador(String palabra) {
		String regex = "[a-zA-Z_]+[,]?|[*]";
		return palabra.matches(regex);
	}
}
