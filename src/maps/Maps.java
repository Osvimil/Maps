
package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Maps {

   
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        
        verMapa(hm);
        
    }

    private static void verMapa(HashMap<Integer, String> mapis) {
        
        mapis.put(1993, "Oswaldo");
        mapis.put(1991, "Alfonso");
        mapis.put(2015, "Paps");
        mapis.put(2000, "Mayte");
        
        for(Integer anios: mapis.keySet()){
            String nombres = mapis.get(anios);
            System.out.println(anios+ ": "+nombres);        
        }
        
    }
    
}
