
package JAVA.conjuntos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pilocidadknn {
     double[][] instanciasPilocidad = {
        {4.80, 8.40},
        {5.20, 9.40},
        {4.50, 8.60},
        {4.50, 8.56}
    };
     
     public double pi1, pi2;
     
    public String majClass;
     
      public void main(){
        

        int k = 2;
        
        JAVA.knn knn = new JAVA.knn();
        
        DecimalFormat decimal = new DecimalFormat("0.00000");
            
        List<valores> piocidadlista = new ArrayList<valores>();

        List<resultados> resultadospilocidad= new ArrayList<resultados>();

        piocidadlista.add(new valores(instanciasPilocidad[0], "pilocidad tipo 1"));
        piocidadlista.add(new valores(instanciasPilocidad[1], "pilocidad tipo 2"));
        piocidadlista.add(new valores(instanciasPilocidad[2], "pilocidad tipo 3"));
        piocidadlista.add(new valores(instanciasPilocidad[3], "pilocidad tipo 7"));

        //entrada

        double[]querypilocidad = {pi1, pi2};
 
        
        for(valores pilisidad : piocidadlista)
        {
            double dis = 0.0;
            
            for(int j = 0; j < pilisidad.Atributos.length; j++){
                dis += Math.pow(pilisidad.Atributos[j] - querypilocidad[j], 2);  
                System.out.println(pilisidad.Atributos[j] +" ");     
            }   
                double distancia = Math.sqrt(dis);    
                resultadospilocidad.add(new resultados(distancia, pilisidad.Nombre));    
                System.out.println(decimal.format(distancia));
        }
                
        
        Collections.sort(resultadospilocidad, new comparardistancia());
        
        String[] spi = new String[k];

        for(int x=0; x < k; x++){
            System.out.println( resultadospilocidad.get(x).Nombre+ " .... " +decimal.format(resultadospilocidad.get(x).Distancia));
            spi[x] =  resultadospilocidad.get(x).Nombre;
        }

        majClass = knn.clase(spi);
       
    }
}
