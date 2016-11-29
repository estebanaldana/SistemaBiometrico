
package JAVA.conjuntos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carasknn {
    double[][] instanciasCaras = {
        {5.10, 3.20},//cara 1
        {3.30, 1.50},//cara 2
        {4.80, 3.40},//cara 3
        {6.50, 3.40},//cara 4
        {4.20, 3.40},//cara 5
        {2.50, 3.10},//cara 6
        {3.70, 3.20},//cara 7
        {4.30, 4.20},//cara 8
        {4.30, 3.30},//cara 9
        {4.50, 3.50} //cara 10
    };
    
     public double ca1, ca2;
     
    public String majClass;
     
     public void main(){
        
        
        int k = 2;
        
        JAVA.knn knn = new JAVA.knn();

        DecimalFormat decimal = new DecimalFormat("0.00000");
            
        List<valores> caralista = new ArrayList<valores>();

        List<resultados> resultadoscara= new ArrayList<resultados>();
           
        caralista.add(new valores(instanciasCaras[0], "cara1"));
        caralista.add(new valores(instanciasCaras[1], "cara2"));
        caralista.add(new valores(instanciasCaras[2], "cara3"));
        caralista.add(new valores(instanciasCaras[3], "cara4"));
        caralista.add(new valores(instanciasCaras[4], "cara5"));
        caralista.add(new valores(instanciasCaras[5], "cara6"));
        caralista.add(new valores(instanciasCaras[6], "cara7"));
        caralista.add(new valores(instanciasCaras[7], "cara8"));
        caralista.add(new valores(instanciasCaras[8], "cara9"));
        caralista.add(new valores(instanciasCaras[9], "cara10"));

        //entrada

        double[]querycaras = {ca1, ca2};
       

        for(valores cara : caralista)
        {
            double dis = 0.0;
            
            for(int j = 0; j < cara.Atributos.length; j++){
                dis += Math.pow(cara.Atributos[j] - querycaras[j], 2);  
                System.out.println(cara.Atributos[j] +" ");     
            }   
                double distancia = Math.sqrt(dis);    
                resultadoscara.add(new resultados(distancia, cara.Nombre));    
                System.out.println(decimal.format(distancia));
        }
        
        
        Collections.sort(resultadoscara, new comparardistancia());
      

        String[] sca = new String[k];

        for(int x=0; x < k; x++){
            System.out.println( resultadoscara.get(x).Nombre+ " .... " +decimal.format(resultadoscara.get(x).Distancia));
            sca[x] =  resultadoscara.get(x).Nombre;
        }
       
        
        majClass = knn.clase(sca);
       
    }
    
}
