package com.san.zhenti2017;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTree {
	private Map<String, List<String>>  map_ch = new HashMap<String, List<String>>();
	private Map<String,String> map_pa = new HashMap<String,String>();
	
	public void add(String parent, String child)
	{
		map_pa.put(child, parent);
		
		List<String> lst = map_ch.get(parent);
		if(lst==null){
			lst = new ArrayList<String>();
			map_ch.put(parent, lst);
		}
		lst.add(child);
	}
	
	public String get_parent(String me){
		return map_pa.get(me);
	}
	
	public List<String> get_child(String me){
		return map_ch.get(me);
	}
	
	private String space(int n)
	{
		String s = "";
		for(int i=0; i<n; i++) s += ' ';
		return s;
	}
	
	private boolean last_child(String x){
		String pa = map_pa.get(x);
		if(pa==null) return true;
		
		List<String> lst = map_ch.get(pa);
		return lst.get(lst.size()-1).equals(x);
	}
	
	public void show(String x){
		
		String s = "+--" + x;
		
		String pa = x;
		while(true){
			pa = map_pa.get(pa);
			if(pa==null) break;
			s=(last_child(pa)?"":"|")+space(4)+s;	//填空
		}
		
		System.out.println(s);
	}
	
	public void dfs(String x){
		show(x);
		
		List<String> lst = map_ch.get(x);
		if(lst==null) return;
				
		for(String it: lst){
			dfs(it);
		}
	}
}
