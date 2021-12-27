package kata5.model;

import java.util.HashMap;
import java.util.Set;

public class Histogram <key>{
    private final HashMap <key , Integer> map = new HashMap<key, Integer> ();
    
    public int get(key clave){
        return map.get(clave);
    }
    
    public Set<key> keySet(){
        return map.keySet();
    }
    
    public void increment(key clave){
        map.put(clave, map.containsKey(clave) ? map.get(clave) + 1 : 1);
    }
}
