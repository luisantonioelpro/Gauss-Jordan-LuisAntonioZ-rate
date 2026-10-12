// Luis Antonio Zárate Romero
// Lanzador_GaussJordan.java

public class Lanzador_GaussJordan {
    public static void main(String[] args) {
        // 1. Obtiene la matriz aumentada [A | b]
        double[][] matriz = defmatrizz.defmatriz();

        // 2. Aplica el método de Gauss-Jordan (reutiliza Gauss)
        double[] soluciones = GaussJordan.resolverGaussJordan(matriz);

        // 3. Imprime los resultados finales de manera limpia
        System.out.println("Soluciones del sistema por el método de Gauss-Jordan:");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}
