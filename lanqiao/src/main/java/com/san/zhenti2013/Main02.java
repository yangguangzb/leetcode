package com.san.zhenti2013;
/**
 * 猜灯谜
 * @description
 * @author zhangbiao
 * @time 2018-5-11 下午5:44:44
 */
public class Main02 {
	//答案：897
	public static void main(String[] args) {
		for(int a=1;a<=9;a++){//请
			for(int b=0;b<=9;b++){//猜
				for(int c=0;c<=9;c++){//谜
					if(f(a, b, c)){
						return ;
					}
				}
			}
		}
	}
	//判断是否符合条件
	public static boolean f(int a,int b,int c){
		int num=a*100+b*10+c;
		int sum=num*num;
		String str=sum+"";
		char[] ch = str.toCharArray();
		if(ch.length==6){
			if(ch[1]==ch[4]&&ch[0]-'0'==a&&ch[5]-'0'==b){
				System.out.println(num);
				return true;
			}
		}
		return false;
	}
}
