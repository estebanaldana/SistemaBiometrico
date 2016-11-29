
package JAVA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class knn {
    
    public String clase(String[] array){
       
        
        Set<String> h = new HashSet<String>(Arrays.asList(array));
        String[] ValoresUnicos = h.toArray(new String[0]);
        int[] counts = new int[ValoresUnicos.length];
        
        for (int i=0; i < ValoresUnicos.length; i++){
            for (int j=0; j < array.length; j++){
               if(array[j].equals(ValoresUnicos[i])){
                   counts[i]++;
               }
            }
        }
        
        for(int i=0; i < counts.length; i++)
            System.out.println(counts[i]);
        
        for(int i=0; i < counts.length; i++)
            System.out.println(ValoresUnicos[i]);
        
        int max = counts[0];
        for(int contador = 1; contador < counts.length; contador++){
            if(counts[contador] > max){
                max = counts[contador];
            }
        }
        System.out.println("max # de ocurrencias" +max);
        
        
        int freq = 0;
        for(int contador = 0; contador < counts.length; contador++){
            if(counts[contador] == max){
                freq++;
            }
        }
        
        
        int indice = -1;
        if(freq == 1){
            for(int contador = 0; contador < counts.length; contador++){
                if(counts[contador] == max){
                    indice = contador;
                    break;
                }
            }
            System.out.println("una clase de la mayoría, el índice es" +indice);
            
            return ValoresUnicos[indice];
        } 
        else{
            
            int[] ix = new int[freq];
            System.out.println("multiples mayoria de clases:" +freq +"Clases");
            int ixi = 0;
            for(int contador = 0; contador < counts.length; contador++){
                if(counts[contador] == max){
                    ix[ixi] = contador;
                    ixi++;
                }
            }
            
            for(int contador = 0; contador < ix.length; contador++)
                System.out.println("indice de la clase" +ix[contador]);
                
                Random generador = new Random();
                int rindice = generador.nextInt(ix.length);
                System.out.println("indice aleatorio: " +rindice);
                int nindice = ix[rindice];
                return ValoresUnicos[nindice];
        } 
    }

}
