
package JAVA.conjuntos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orejasknn {
    double[][] instanciasOrejas = {
        {2.52, 2.52, 1.32},//oreja 1
        {2.22, 2.22, 0.72},//oreja 2
        {2.12, 3.22, 1.42},//oreja 3
        {1.52, 2.72, 1.52},//oreja 4
        {2.32, 1.22, 0.82},//oreja 5
        {1.72, 2.92, 0.92} //oreja 6
    };
    
    public double or1, or2, or3;
    
    public String majClass;
    
    
     public void main(){
        
        int k = 3;
        
        JAVA.knn knn = new JAVA.knn();
        
        DecimalFormat decimal = new DecimalFormat("0.00000");
            
        List<valores> orejaslista = new ArrayList<valores>();

        List<resultados> resultadosorejas= new ArrayList<resultados>();

        
        orejaslista.add(new valores(instanciasOrejas[0], "oreja1d"));
        orejaslista.add(new valores(instanciasOrejas[1], "oreja2d"));
        orejaslista.add(new valores(instanciasOrejas[2], "oreja3d"));
        orejaslista.add(new valores(instanciasOrejas[3], "oreja4d"));
        orejaslista.add(new valores(instanciasOrejas[4], "oreja5d"));
        orejaslista.add(new valores(instanciasOrejas[5], "oreja6d"));

        //entrada

        double[]queryOrejas = {or1, or2, or3};
        
        
        for(valores oreja : orejaslista){
            double dis = 0.0;
            
            for(int j = 0; j < oreja.Atributos.length; j++){
                dis += Math.pow(oreja.Atributos[j] - queryOrejas[j], 2);  
                System.out.println(oreja.Atributos[j] +" ");     
            }   
                double distancia = Math.sqrt(dis);    
                resultadosorejas.add(new resultados(distancia, oreja.Nombre));    
                System.out.println(decimal.format(distancia));
        }
         
        Collections.sort(resultadosorejas, new comparardistancia());
       

        String[] sor = new String[k];
        
    
        for(int x=0; x < k; x++){
            System.out.println( resultadosorejas.get(x).Nombre+ " .... " +decimal.format(resultadosorejas.get(x).Distancia));
            sor[x] =  resultadosorejas.get(x).Nombre;
        }
 
        majClass = knn.clase(sor);
       

    }
    
}
