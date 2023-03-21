package rut.rutificador;

public class Utilidades {

    public static boolean esValido(String rut) {

        var rutSinDigitoVerificador = Integer.parseInt(rut.substring(0, rut.length() - 1));
        var digitoVerificador = rut.substring(rut.length() - 1);

        System.out.println(digitoVerificador);
        return digitoVerificador.equals(RutificadorApplication.getDigito(rutSinDigitoVerificador));
    }

    public static int[] getListaInvertida(int numero) {

        var tamanio = String.valueOf(numero).length();
        var lista = new int[tamanio];

        for (var indice = 0; indice < lista.length; indice++) {
            lista[indice] = numero % 10;
            numero /= 10;
        }
        return lista;
    }

    public static boolean esMayorA7(int numero) {
        return numero > 7;
    }
}
