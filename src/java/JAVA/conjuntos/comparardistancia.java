
package JAVA.conjuntos;

import java.util.Comparator;

public class comparardistancia implements Comparator<resultados>{

    @Override
    public int compare(resultados a, resultados b) {
         return a.Distancia < b.Distancia ? -1 : a.Distancia == b.Distancia ? 0 : 1;
    }
}
