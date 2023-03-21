package rut.rutificador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RutificadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RutificadorApplication.class, args);
	}

	public static int calculaDigitoVerificador(int rut) {
		var producto = CalcularProducto.calcularProducto(rut);
		var aproximado = (producto / 11) * 11;

		return 11 - (producto - aproximado);
	}

	public static String getDigito(int rut) {

		var digito = calculaDigitoVerificador(rut);

		if (esK(digito)) {
			return "K";
		}

		if (es0(digito)) {
			return "0";
		}

		return String.valueOf(digito);
	}

	private static boolean esK(int digito) {
		return digito == 11;
	}

	private static boolean es0(int digito) {
		return digito == 10;
	}
}
