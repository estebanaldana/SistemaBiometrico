package JAVA.conjuntos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ojosknn {
    double[][] instanciasOjos = {
        {2.52, 2.52, 1.32, 1.32, 0.65, 0.65},//Almendrados
        {2.22, 2.22, 0.72, 0.72, 0.42, 0.42},//Asiaticos
        {2.42, 2.42, 0.90, 0.90, 0.68, 0.68},//Caidos
        {2.62, 2.62, 1.62, 1.62, 0.23, 0.23},//Entornados
        {2.52, 2.52, 1.32, 1.32, 0.78, 0.78},//Hundidos
        {2.32, 2.32, 1.52, 1.52, 0.55, 0.55},//Juntos
        {1.88, 1.88, 0.88, 0.88, 0.47, 0.47},//Saltones
        {2.72, 2.72, 1.22, 1.22, 0.33, 0.33} //Separados
    };
    
    public double oj1, oj2, oj3, oj4, oj5, oj6;
    
    public String majClass;
    
    
    
    public void main(){

        int k = 6;
        
        JAVA.knn knn = new JAVA.knn();

        DecimalFormat decimal = new DecimalFormat("0.00000");
            
        List<valores> ojoslista = new ArrayList<valores>();

        List<resultados> resultadosojos = new ArrayList<resultados>();
       
        
        ojoslista.add(new valores(instanciasOjos[0], "almendrados"));
        ojoslista.add(new valores(instanciasOjos[1], "asiaticos"));
        ojoslista.add(new valores(instanciasOjos[2], "caidos"));
        ojoslista.add(new valores(instanciasOjos[3], "entornados"));
        ojoslista.add(new valores(instanciasOjos[4], "hundidos"));
        ojoslista.add(new valores(instanciasOjos[5], "juntos"));
        ojoslista.add(new valores(instanciasOjos[6], "saltones"));
        ojoslista.add(new valores(instanciasOjos[7], "separados"));
        
        //entrada

        
        double[]queryOjos = {oj1, oj2, oj3, oj4, oj5, oj6};
        
        
        for(valores ojo : ojoslista){
            double dis = 0.0;
            
            for(int j = 0; j < ojo.Atributos.length; j++){
                dis += Math.pow(ojo.Atributos[j] - queryOjos[j], 2);  
                System.out.println(ojo.Atributos[j] +" ");     
            }   
                double distancia = Math.sqrt(dis);    
                resultadosojos.add(new resultados(distancia, ojo.Nombre));    
                System.out.println(decimal.format(distancia));
        }
        
         
        Collections.sort(resultadosojos, new comparardistancia());

        String[] soj = new String[k];
        
        for(int x=0; x < k; x++){
            System.out.println( resultadosojos.get(x).Nombre+ " .... " +decimal.format(resultadosojos.get(x).Distancia));
            soj[x] = resultadosojos.get(x).Nombre;
        }
 
        majClass = knn.clase(soj);

    }
}
