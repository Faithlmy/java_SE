package com.hashmap1;
/*
 * How to use hashmap
 * */

import static java.lang.System.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMap1 {

	public static <Emp> void main(String[] args)
	{
		Map<String, Emp> sta = new HashMap<String, Emp>();
		// add
		sta.put("12-34", (Emp) "faith2");
		sta.put("13-34", (Emp) "faith3");
		sta.put("14-34", (Emp) "faith4");
		out.println(sta);
		out.println("====================================================");
		// delete
		sta.remove("12-34");
		out.println(sta);
		out.println("=====================================================");
		// put
		sta.put("15-34", (Emp) "you");
		sta.put("14-34", (Emp) "jingji");
		out.println(sta);
		out.println("=====================================================");
		
		// get
		out.println(sta.get("15-34"));
		out.println("======================================================");
		
		// get all keys and values
        for(Map.Entry<String, Emp> entry : sta.entrySet()) 
        {  
            String key = entry.getKey();  
            Emp value = entry.getValue();  
            System.out.println("key=" + key + ", value=" + value + "");  
        }
        out.println("================================================");
        // get all keys
        Set<String> keys = sta.keySet();  
        for(String key : keys) {  
            System.out.println(key);  
        }  
        out.println("=====================================");
        //get all values
        Collection<Emp> values = sta.values();  
        for(Emp value : values) {  
            System.out.println(value);  
        }
	}
}
