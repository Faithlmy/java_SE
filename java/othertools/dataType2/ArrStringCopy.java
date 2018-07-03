package dataType2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 构建数据格式并将数据格式转换
 * 
 * {
Q118=[{name=CDF, value=4.5}, {name=FOC, value=18.6}, {name=FTX, value=8.3}, {name=FJZ, value=11.9}, {name=FCZ, value=4.6}], 
Q218=[{name=CDF, value=4.3}, {name=FOC, value=20.9}, {name=FTX, value=9.2}, {name=FJZ, value=10.9}, {name=FCZ, value=1.7}], 
Q318=[{name=CDF, value=4.6}, {name=FOC, value=13.3}, {name=FTX, value=8.3}, {name=FJZ, value=14.1}, {name=FCZ, value=3.4}], 
Q418=[{name=CDF, value=5.9}, {name=FOC, value=10.8}, {name=FTX, value=10.5}, {name=FJZ, value=13.1}, {name=FCZ, value=2.9}]
}

{
	"x":["CDF", "FOC", "FTX", "FJZ", "FCZ"],
	"y":[
	{
		"name":"Q118",
		"data":[4.5, 18.6, 8.3, 11.9, 4.6]
	},
	{
		"name":"Q218",
		"data":[4.3, 20.9, 9.2, 10.9, 1.7]
	},
	{
		"name":"Q318",
		"data":[4.6, 13.3, 8.3, 14.1, 3.4]
	},
	{
		"name":"Q418",
		"data":[5.9, 10.8, 10.5, 13.1, 2.9]
	}
	]
}
 * 
 * 
 */
public class ArrStringCopy {
	public static void main(String[] args) {
		String[] allKey = {"Q118", "Q218", "Q318", "Q418"};
		String[] p0 = {"name", "value"};
		String[] p1 = {"CDF", "FOC", "FTX", "FJZ", "FCZ"};
		
		String[] p2 = {"4.5", "18.6", "8.3", "11.9" };
		String[] p3 = {"4.3", "20.9", "9.2", "10.9", "1.7" };
		String[] p4 = {"4.6", "13.3", "8.3", "14.1", "3.4" };
		String[] p5 = {"5.9", "10.8", "10.5", "13.1", "2.9" };
		
		
		List myListMapList = new LinkedList<>();
		ConData cd = new ConData();
		myListMapList.add(cd.myListMap(p0, p1, p2));
		myListMapList.add(cd.myListMap(p0, p1, p3));
		myListMapList.add(cd.myListMap(p0, p1, p4));
		myListMapList.add(cd.myListMap(p0, p1, p5));
		Map res = cd.qName(allKey, myListMapList);
		System.out.println(res);
		//
//		DeConData dd = new  DeConData();
//		int a = dd.InkeyNum(res);
//		int b = dd.InkeyNumRe(res);
//		List resList = dd.OutkeyNum(res);
//		Map resMap = dd.ConData(resList, res);
//		Map r = dd.OpenValue(resMap);
////		System.out.println(a);
////		System.out.println(b);
////		System.out.println(resList);
//		System.out.println(r);
	}

}

/**
 * 
 * @Description： 构造三维数据格式
 * @param: p0 为里面的key的字段，不给默认为name0 到namen
 * @param: p1为value1的值，默认为""
 * @param: p2为value2的值，默认为""
 * @return:
 * @throws:
 * @date:
 */
class ConData{
	public ConData() {}
	// 将最外层key和value对应
	public Map qName(String[] totalKey, List mList) {
		Map conMapOut = new LinkedHashMap<>();
		if(totalKey.length == 0 || mList.size() == 0) return null;
		if(totalKey.length == mList.size()) {
			for(int i = 0; i <totalKey.length; i++) {
				conMapOut.put(totalKey[i], mList.get(i));
			}
		}
		return conMapOut;
	}
	//构造最里面的list<Map>
	public List<Map> myListMap(String[] p0,  String[] p1, String[] p2){
		if((p1 == null || p2 == null) || (p1.length == 0 && p2.length == 0)) {
			return null;
		}
		if(p1.length == 0 && p2.length != 0 && p2.length > p1.length) {
			// 
		}
		if(p1.length != 0 && p2.length == 0 && p2.length < p1.length) {
			
		}
		int numString = p1.length;
		Map<String, List> conMapOut = new LinkedHashMap<>();
		Map<String, String> conMapIn = new LinkedHashMap<>();
		List mList = new ArrayList<>();
		
		if(numString == 0) {
			if(p0 != null) {
				conMapIn.put(p0[0].toString(), "");
				mList.add(conMapIn);
			}else {
				conMapIn.put("name0", "");
				mList.add(conMapIn);
			}
		}
		
		if(numString != 0) {
			if(p0 != null) {
				for(int i = 0; i < numString; i++) {
					Map<String, String> conMapTwo = new LinkedHashMap<>();
					conMapTwo.put(p0[0], p1[i]);
					conMapTwo.put(p0[1], p2[i]);
					mList.add(conMapTwo);
				}
			}else {
				for(int i = 0; i < numString; i++) {
					Map<String, String> conMapTwo = new LinkedHashMap<>();
					conMapTwo.put("name", p1[i]);
					conMapTwo.put("value", p2[i]);
					mList.add(conMapTwo);
				}
			}
		}
		return mList;
	}
}

/**
 * 
 * @Description:
 * @Author faith
 * @Date:
 * @Version:
 */
class DeConData{
	public DeConData() {}
	
	public Map deConData(Map<Object, Object> resMap){
		Map qName = new LinkedHashMap<>();
		Map qValue = new LinkedHashMap<>();
		List q = new ArrayList<>();
		List name = new ArrayList<>();
		List value = new ArrayList<>();
		
		Map deConDataMap = new LinkedHashMap<>();
		for(Map.Entry<Object, Object> OutMap: resMap.entrySet()) {
			if(OutMap != null) {
				q.add(OutMap.getKey());
				List<Map> inList= (List<Map>) OutMap.getValue();
				// 找key的种类
				for(int i = 0; i < inList.size(); i++) {
					Map InMap = inList.get(i);
				}
			}
		}
		return deConDataMap;
	}
	
	// 找内部map的个数
	public int InkeyNum(Map<String, List<Map>> resMap) {
		int num = 0;
		List resList = new ArrayList<>();
//		List<String> q = new ArrayList<>();// 接收Q118
		for(Map.Entry<String, List<Map>> OutMap: resMap.entrySet()) {
			if(OutMap != null) {
				List<Map> inList= (List<Map>) OutMap.getValue();
				num = inList.size();
			}
		}
		return num;
	}
	
	
	// 找内部map的个数
	public int InkeyNumRe(Map<String, List<Map>> resMap) {
		int num = 0;
		List resList = new ArrayList<>();
//		List<String> q = new ArrayList<>();// 接收Q118
		for(Map.Entry<String, List<Map>> OutMap: resMap.entrySet()) {
			if(OutMap != null) {
				List<Map> inList= (List<Map>) OutMap.getValue();
				num = inList.size();
				// 找key的种类
				for(int i = 0; i < inList.size(); i++) {
					Map<Object, Object> InMap = inList.get(i);
					for(Map.Entry<Object, Object> value : InMap.entrySet()) {
						if(value.getKey() != null) {
							resList.add(value.getKey());
						}
					}
				}
			}
		}
		resList = removeDuplicateWithOrder(resList);
		return resList.size();
	}
	
	// 删除ArrayList中重复元素，保持顺序     
	 public List removeDuplicateWithOrder(List list) {    
	    Set set = new HashSet();    
	     List newList = new ArrayList();    
	   for (Iterator iter = list.iterator(); iter.hasNext();) {    
	         Object element = iter.next();    
	         if (set.add(element))    
	            newList.add(element);    
	      }     
	     list.clear();    
	     list.addAll(newList);    
	     return list;
	 }
	 
		// 找外部key的种类
		public List OutkeyNum(Map<String, List<Map>> resMap) {
			List<String> q = new ArrayList<>();// 接收Q118
			for(Map.Entry<String, List<Map>> OutMap: resMap.entrySet()) {
				if(OutMap != null) {
					if(OutMap.getKey() != null) {
						q.add(OutMap.getKey().toString());
					}
				}
			}
			return q;
		}
		
		
		//将内部值形成list
		public Map ConData(List outKey, Map<String, List<Map>> resMap){
			Map conMap = new LinkedHashMap<>();
			List<String> oneStringPoint = new ArrayList<>();
			for(Entry<String, List<Map>> mapIn: resMap.entrySet()) {
				for(int i = 0; i < outKey.size(); i++) {
					if(mapIn != null && mapIn.getKey() != null && mapIn.getKey().equals(outKey.get(i)) ) {
						 List<String> oneString = new ArrayList<>();
						 oneStringPoint = oneString;
							 List<Map> valueMap  = mapIn.getValue();
							 for(int j = 0; j < valueMap.size();  j++) {
								 Map<Object, Object> iNmap = valueMap.get(j);
								 for(Entry<Object, Object> im: iNmap.entrySet()) {
									 oneString.add(im.getValue().toString());
								 }
							 }
						conMap.put(outKey.get(i), oneStringPoint);
					}
				}
			}
			return conMap;
		}
		
		//将list的值分开
		public Map OpenValue(Map<Object, Object> conMap) {
			int flag = 0;
			int i = 0;
			Map resMap = new LinkedHashMap<>();
			for(Map.Entry<Object, Object> kv: conMap.entrySet()) {
				List<String> res = new ArrayList<>();
				List<String> getKv = (List<String>) kv.getValue();
				for(i = 0; i < getKv.size(); i++) {
					flag = i * 2 + 1;
					if(flag <= getKv.size()) {
						res.add(getKv.get(flag));
					}
				}
				resMap.put(kv.getKey(), res);
			}
			return resMap;
		}
}



