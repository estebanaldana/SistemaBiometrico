
package JAVA.conjuntos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bocasknn {
    double[][] instanciasBocas = {
        {1.22, 4.10, 0.30, 0.15},//labios 1
        {1.30, 4.30, 0.56, 0.07},//labios 2
        {1.80, 4.20, 0.48, 0.12},//labios 3
        {1.50, 4.57, 0.42, 0.18} //labios 4
        //{1.10, 4.47, 0.72, 0.14}
    };
    
    public double bo1, bo2, bo3, bo4;
    
    public String majClass;
    
    public void main(){
        

        int k = 4;
        
        JAVA.knn knn = new JAVA.knn();
        
        DecimalFormat decimal = new DecimalFormat("0.00000");
            
        
        List<valores> bocalista = new ArrayList<valores>();
        
        List<resultados> resultadosboca= new ArrayList<resultados>();
    
        
        bocalista.add(new valores(instanciasBocas[0], "labios1"));
        bocalista.add(new valores(instanciasBocas[1], "labios2"));
        bocalista.add(new valores(instanciasBocas[2], "labios3"));
        bocalista.add(new valores(instanciasBocas[3], "labios4"));
        //bocalista.add(new valores(instanciasBocas[4], "Pequeño"));

        //entrada

        double[]querybocas = {bo1, bo2, bo3, bo4};
      
        
        for(valores boca : bocalista)
        {
            double dis = 0.0;
            
            for(int j = 0; j < boca.Atributos.length; j++){
                dis += Math.pow(boca.Atributos[j] - querybocas[j], 2);  
                System.out.println(boca.Atributos[j] +" ");     
            }   
                double distancia = Math.sqrt(dis);    
                resultadosboca.add(new resultados(distancia, boca.Nombre));    
                System.out.println(decimal.format(distancia));
        }
              
        Collections.sort(resultadosboca, new comparardistancia());
        
        String[] sbo = new String[k];
        
        for(int x=0; x < k; x++){
            System.out.println( resultadosboca.get(x).Nombre+ " .... " +decimal.format(resultadosboca.get(x).Distancia));
            sbo[x] =  resultadosboca.get(x).Nombre;
        }

        majClass = knn.clase(sbo);
       
    }
    
}
