package com.san.zhenti2015;
/**
 * 胡同门牌号
 * @description
 * @author zhangbiao
 * @time 2018-5-11 下午2:52:40
 */
public class Main03 {
	public static void main(String[] args) {
		int x;//最小的门牌号
		int y;//小明家的门牌号（总住户数）
		int num=0;//总数
		for(x=2;x<100;x++){
			for(y=x;y<100;y++){
				//num=(x+x+y-1)*(y-1)/2-y;
				num=(2*x+y)*(y+1)-2*y;
				//System.out.println(num);
				if(num==2*100){
					System.out.println("y="+y);
				}
			}
		}
	}
}
