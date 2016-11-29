
package JAVA.conjuntos;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Naricesknn {
     double[][] instanciasNarices = {
        {0.23, 1.70, 0.30, 2.12, 0.67},//nariz 1
        {0.90, 1.50, 0.50, 2.22, 0.70},//nariz 2
        {0.70, 1.60, 1.11, 2.32, 0.30},//nariz 3
        {0.60, 1.72, 1.02, 2.40, 0.45},//nariz 3a
        {0.44, 1.80, 0.70, 2.48, 0.28},//nariz 4
        {0.89, 1.67, 0.44, 2.72, 0.38},//nariz 5
        {0.65, 1.36, 0.58, 2.25, 0.13},//nariz 5a
        {0.55, 1.26, 1.00, 2.45, 0.23},//nariz 6
        {0.35, 1.46, 0.28, 2.12, 0.13},//nariz 7
        {0.55, 1.26, 0.58, 1.75, 0.33} //nariz 8
    };
     
     public double na1, na2, na3, na4, na5;
     
    public String majClass;
     
     public void main(){

        int k = 5;
        
        JAVA.knn knn = new JAVA.knn();
       
        DecimalFormat decimal = new DecimalFormat("0.00000");

        List<valores> nariceslista = new ArrayList<valores>();
       
        List<resultados> resultadosnarices= new ArrayList<resultados>();
        
        
        nariceslista.add(new valores(instanciasNarices[0], "nariz1"));
        nariceslista.add(new valores(instanciasNarices[1], "nariz2"));
        nariceslista.add(new valores(instanciasNarices[2], "nariz3"));
        nariceslista.add(new valores(instanciasNarices[3], "nariz3a"));
        nariceslista.add(new valores(instanciasNarices[4], "nariz4"));
        nariceslista.add(new valores(instanciasNarices[5], "nariz5"));
        nariceslista.add(new valores(instanciasNarices[6], "nariz5a"));
        nariceslista.add(new valores(instanciasNarices[7], "nariz6"));
        nariceslista.add(new valores(instanciasNarices[8], "nariz7"));
        nariceslista.add(new valores(instanciasNarices[9], "nariz8"));

        
        //entrada

        double[]querynarices = {na1, na2, na3, na4, na5};
        
        for(valores nariz : nariceslista)
        {
            double dis = 0.0;
            
            for(int j = 0; j < nariz.Atributos.length; j++){
                dis += Math.pow(nariz.Atributos[j] - querynarices[j], 2);  
                System.out.println(nariz.Atributos[j] +" ");     
            }   
                double distancia = Math.sqrt(dis);    
                resultadosnarices.add(new resultados(distancia, nariz.Nombre));    
                System.out.println(decimal.format(distancia));
        }
        
        Collections.sort(resultadosnarices, new comparardistancia());
        
        String[] sna = new String[k];
        
        for(int x=0; x < k; x++){
            System.out.println( resultadosnarices.get(x).Nombre+ " .... " +decimal.format(resultadosnarices.get(x).Distancia));
            sna[x] =  resultadosnarices.get(x).Nombre;
        }

        majClass = knn.clase(sna);

    }
}
