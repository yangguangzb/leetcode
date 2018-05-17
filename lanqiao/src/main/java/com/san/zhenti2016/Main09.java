package com.san.zhenti2016;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * 凑平方数
 * @description
 * @author zhangbiao
 * @time 2018-5-17 下午5:18:15
 */
public class Main09 {
	//存储所有的平方数
	static ArrayList<BigInteger> digitList;
	//标记平方数是否被访问
	static boolean[] select;
	//存储符合条件的平方数的组合
	static Set<Set<String>> result=new HashSet<Set<String>>();
	
	/**
	 * 判断当前字符是否含有相同的数字
	 * @param digitList
	 * @return
	 */
	public static boolean checkDup(String digitList){
		int len=digitList.length();
		Set<Character> ch=new HashSet<Character>();
		for(int i=0;i<len;i++){
			ch.add(digitList.charAt(i));
		}
		if(ch.size()==len){
			return true;
		}else{
			return false;
		}
	}
	
	
	/**
	 * dfs找出符合条件的分组，并将分组保存到result中
	 * @param len 表示分组中剩余的可添加字符串的长度
	 * @param figure 添加新字符串后的分组是否有重复的字符
	 * @param figureset 保存遍历到当前字符串分组的集合
	 */
	public static void dfs(int len,String figure,Set<String> figureset){
		if(len<0){
			//添加最后一个字符后，分组字符的长度大于了10，不符合条件
			return ;
		}
		if(len==0){
			//符合条件
			result.add(figureset);
			return ;
		}
		for(int i=0;i<select.length;i++){
			//没有被访问
			if(select[i]==false){
				select[i]=true;
				String temp=digitList.get(i).toString();
				//因为最先所有的平方数最先都是从小到大生成的，后面的数肯定比当前的数  
                //当前要长，因此后面的数就不用看了
				if(len<temp.length()){
					select[i]=false;
					break;
				}
				//检查加入的新平方数是否重复
				if(checkDup(figure+temp)){
					HashSet<String> tempSet=new HashSet<String>();
					tempSet.addAll(figureset);
					tempSet.add(temp);
					//dfs
					dfs(len-temp.length(), figure+temp, tempSet);
				}
				select[i]=false;
			}
		}
	}
	
	public static void main(String[] args) {
		int i=0;
		digitList=new ArrayList<BigInteger>();
		//由小到大生成平方数
		while(true){
			BigInteger temp=BigInteger.valueOf(i++).pow(2);
			if(temp.toString().length()<=10){
				if(checkDup(temp.toString())){
					digitList.add(temp);
					System.out.println(temp);
				}
			}else{
				break;
			}
		}
		select=new boolean[digitList.size()];
		dfs(10, "",new HashSet<String>());
		System.out.println(result.size());
	}
	
}
