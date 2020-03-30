import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String ,Integer> hm=new HashMap<String,Integer>();
		hm.put("a",new Integer(100));
		hm.put("b",new Integer(200));
		hm.put("c",new Integer(300));
		hm.put("d",new Integer(400));
		hm.put("e",new Integer(500));
		Set<Map.Entry<String,Integer>> st=hm.entrySet();
		
		for(Map.Entry<String,Integer>me:st)
		{
			System.out.println(me.getKey()+" ");
			System.out.println(me.getValue());
		}
	}

}
