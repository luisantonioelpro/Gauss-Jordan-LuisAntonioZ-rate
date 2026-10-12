// Luis Antonio Zárate Romero
// GaussJordan.java

public class GaussJordan {

    /**
     * Método que implementa el algoritmo de Gauss-Jordan completo.
     * Reutiliza la triangulación superior y transforma la matriz en la matriz identidad.
     * @param matriz Matriz aumentada [A | b] modificada directamente en memoria.
     * @return Arreglo con el vector de soluciones de manera directa.
     */
    public static double[] resolverGaussJordan(double[][] matriz) {
        int n = matriz.length;

        // Paso 1: Reutilización del módulo de triangulación superior previo
        Gauss.eliminacionGaussiana(matriz);

        // Paso 2: Normalización de pivotes y barrido superior (eliminación hacia arriba)
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            // Normaliza el renglón actual para convertir el pivote en 1
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Anula los coeficientes de las filas superiores
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }

        // Paso 3: Lectura directa de resultados desde la columna de la matriz identidad
        double[] soluciones = new double[n];
        for (int i = 0; i < n; i++) {
            soluciones[i] = matriz[i][n];
        }

        return soluciones;
    }
}
