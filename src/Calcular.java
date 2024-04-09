public class Calcular {

    int calcularMedia(int[] array){

        int nota = 0;
        int divisor = array.length;
        for (int j : array) {
            nota += j;
        }
        return nota / divisor;
    }
}
