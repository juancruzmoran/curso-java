package clase_03;


public class Main {
	
	public static void main(String[] args) {

		//Ejercicio A
		System.out.println("Ejercicio A");
		System.out.println(ejercicioA("Abdala", 'a'));

		System.out.println();

		/*----------------------------------------------------------------------------*/

		//Ejercicio B
		System.out.println("Ejercicio B");

		int[] array = ejercicioB(4, 1, 8, "desc");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Ejercicio C
		System.out.println("Ejercicio C");

		int numeros[] = { 3, 5, 9, 10 };
		System.out.println(ejercicioC(numeros, 4));
		System.out.println();
		// Codificador y decodificador
		System.out.println("Actividad 2");
		System.out.println(codificadorDecodificador.codificar("hola que tal", 2));
		System.out.println(codificadorDecodificador.decodificar("jqnc\"swg\"vcn", 2));
	}

	/**
	 * Ejercicio A: Dado un String y una letra, que cuente la cantidad de
	 * apariciones de la letra en el String
	 * 
	 * @param unString
	 * @param unaLetra
	 * @return
	 */
	public static int ejercicioA(String unString, char unaLetra) {
		int count = 0;

		for (int i = 0; i < unString.length(); i++) {
			if (unString.charAt(i) == unaLetra) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Ejercicio B: Dados 3 numeros y un orden (ascendente o decreciente) que ordene
	 * los mismos y los retorne en un vector de 3
	 * 
	 * @return
	 */
	public static int[] ejercicioB(int numero1, int numero2, int numero3, String orden) {

		int[] resultado = new int[3];

		resultado[0] = numero1;
		resultado[1] = numero2;
		resultado[2] = numero3;

		int temp = 0;

		if (orden == "asc") {
			for (int i = 0; i < resultado.length; i++) {
				for (int j = i + 1; j < resultado.length; j++) {
					if (resultado[i] > resultado[j]) {
						temp = resultado[i];
						resultado[i] = resultado[j];
						resultado[j] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < resultado.length; i++) {
				for (int j = i + 1; j < resultado.length; j++) {
					if (resultado[i] < resultado[j]) {
						temp = resultado[i];
						resultado[i] = resultado[j];
						resultado[j] = temp;
					}
				}
			}
		}
		return resultado;
	}

	/**
	 * Ejercicio C: Dado un vector de numeros, y un numero X, que sume todos los
	 * numeros > X y retorne el resultado
	 * 
	 * @return
	 */
	public static int ejercicioC(int[] vector, int unNumero) {
		int res = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > unNumero) {
				res = res + vector[i];
			}
		}
		return res;
		
	}
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
