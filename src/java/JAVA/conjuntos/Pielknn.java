
package JAVA.conjuntos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pielknn {
     double[][] instanciasPiel = {
        {0.50},
        {1.50},
        {3.50},
        {5.50},
        {7.30},
        {9.50}
    };
     
    public double pl1;
    
    public String majClass;
    
    public void main(){

        int k = 1;
        
        JAVA.knn knn = new JAVA.knn();
        
        DecimalFormat decimal = new DecimalFormat("0.00000");
            
       
        List<valores> piellista = new ArrayList<valores>();

        List<resultados> resultadospiel= new ArrayList<resultados>();
        
   
        piellista.add(new valores(instanciasPiel[0], "Piel Blanca"));
        piellista.add(new valores(instanciasPiel[1], "Piel Blanco Claro"));
        piellista.add(new valores(instanciasPiel[2], "Piel Oscura"));
        piellista.add(new valores(instanciasPiel[3], "Piel Morena"));
        piellista.add(new valores(instanciasPiel[4], "Piel Morena Oscura"));
        piellista.add(new valores(instanciasPiel[5], "Piel Negra"));
        
        
        //entrada

        double[]querypiel = {pl1};
        

        for(valores piel : piellista)
        {
            double dis = 0.0;
            
            for(int j = 0; j < piel.Atributos.length; j++){
                dis += Math.pow(piel.Atributos[j] - querypiel[j], 2);  
                System.out.println(piel.Atributos[j] +" ");     
            }   
                double distancia = Math.sqrt(dis);    
                resultadospiel.add(new resultados(distancia, piel.Nombre));    
                System.out.println(decimal.format(distancia));
        }

        Collections.sort(resultadospiel, new comparardistancia());

        String[] spl = new String[k];
       
        for(int x=0; x < k; x++){
            System.out.println( resultadospiel.get(x).Nombre+ " .... " +decimal.format(resultadospiel.get(x).Distancia));
            spl[x] =  resultadospiel.get(x).Nombre;
        }
       
        majClass = knn.clase(spl);

    }
    
}
