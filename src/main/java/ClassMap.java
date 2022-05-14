import java.util.HashMap;
import java.util.Map;

public class ClassMap {
    public static void main (String[] args){
        Map<String,String> mapA = new HashMap<String,String>();
        mapA.put("key1" , "1");
        mapA.put("key2" , "2");
        mapA.put("key3", "3");
        String key = mapA.get("key2");
        System.out.println(key);
       // map.remove("key3");
        System.out.println("key3");
       System.out.println( mapA.keySet());
       System.out.println(mapA.values());

       boolean haskey = mapA.containsKey("key6");
       System.out.println(haskey);
       boolean hasvalue = mapA.containsValue("3");
       System.out.println(hasvalue);
       Map<String,String> mapB= new HashMap<String,String>();
       mapB.putAll(mapA);
       System.out.println(mapB.keySet());
    }

}
