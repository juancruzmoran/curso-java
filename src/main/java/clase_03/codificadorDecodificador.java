package clase_03;



public class codificadorDecodificador {


	public static String codificar(String cadena, int desplazamiento) {

		String stringCodificado = new String();

		for (int i = 0; i < cadena.length(); i++) {
			stringCodificado += (char) (cadena.charAt(i) + desplazamiento);
		}

		return stringCodificado;
	}


	public static String decodificar(String cadena, int desplazamiento) {

		String stringDecodificado = new String();

		for (int i = 0; i < cadena.length(); i++) {
			stringDecodificado += (char) (cadena.charAt(i) - desplazamiento);
		}

		return stringDecodificado;
	}
}
