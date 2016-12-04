
package JAVA.conjuntos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cabelloknn {
    double[][] instanciasCabello = {
        {1.90, 3.40, 2.20, 0.20, 2.50},//Cabello Crespo
        {2.20, 3.60, 2.30, 0.10, 2.50},//Cabello Liso
        {1.70, 3.80, 1.80, 0.10, 2.50},//Cabello Grueso y Recto
        {1.60, 3.50, 1.60, 0.50, 2.30},//Cabello Ondulado
        {3.50, 7.40, 1.20, 0.10, 2.50},//Cabello Grueso y Ondulado
        {3.90, 7.80, 1.20, 0.10, 2.50} //Cabello Grueso y Liso
    };
    
    public double cab1, cab2, cab3, cab4, cab5;
    
    public String majClass;
    
    public void main(){
        
        
        int k = 5;
        
        JAVA.knn knn = new JAVA.knn();
      
        DecimalFormat decimal = new DecimalFormat("0.00000");
            
        
        List<valores> cabellolista = new ArrayList<valores>();

        List<resultados> resultadoscabello= new ArrayList<resultados>();
       
     
        cabellolista.add(new valores(instanciasCabello[0], "cabello crespo"));
        cabellolista.add(new valores(instanciasCabello[1], "cabello liso"));
        cabellolista.add(new valores(instanciasCabello[2], "cabello grueso y recto"));
        cabellolista.add(new valores(instanciasCabello[3], "cabello ondulado"));
        cabellolista.add(new valores(instanciasCabello[4], "cabello grueso y ondulado"));
        cabellolista.add(new valores(instanciasCabello[5], "cabello grueso y liso"));
        
      
        //entrada

        double[]querycabello = {cab1, cab2, cab3, cab4, cab5};
       
        
        for(valores cabello : cabellolista)
        {
            double dis = 0.0;
            
            for(int j = 0; j < cabello.Atributos.length; j++){
                dis += Math.pow(cabello.Atributos[j] - querycabello[j], 2);  
                System.out.println(cabello.Atributos[j] +" ");     
            }   
                double distancia = Math.sqrt(dis);    
                resultadoscabello.add(new resultados(distancia, cabello.Nombre));    
                System.out.println(decimal.format(distancia));
        }

        Collections.sort(resultadoscabello, new comparardistancia());
       
        String[] scab = new String[k];
       
        
        for(int x=0; x < k; x++){
            System.out.println( resultadoscabello.get(x).Nombre+ " .... " +decimal.format(resultadoscabello.get(x).Distancia));
            scab[x] =  resultadoscabello.get(x).Nombre;
        }
        
        majClass = knn.clase(scab);
        
    }
}
