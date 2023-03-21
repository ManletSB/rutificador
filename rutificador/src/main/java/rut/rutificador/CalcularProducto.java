package rut.rutificador;

public class CalcularProducto {

        public static int calcularProducto(int rut) {

            var listaRut = Utilidades.getListaInvertida(rut);

            var digitoVerificador = 0;
            var multiplicador = 2;

            for (var digito : listaRut) {
                digitoVerificador += getProductoDigito(new int[]{digito, multiplicador});
                multiplicador++;
            }
            return digitoVerificador;
        }

        private static int getProductoDigito(int[] partes) {

            var multiplicador = partes[1];
            var digito = partes[0];

            if (Utilidades.esMayorA7(multiplicador)) {
                multiplicador = 1 + multiplicador % 7;
            }
            return digito * multiplicador;
        }
}
