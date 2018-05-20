package com.san.zhenti2016;
import java.util.Scanner;
/**
 * 赢球票
 * @description
 * @author zhangbiao
 * @time 2018-5-19 下午3:36:22
 */
public class Main11 {
	public static int n;  
    public static int num[];  
    public static void main(String[] args) {  
        Scanner in=new Scanner(System.in);  
        n=in.nextInt();  
        num=new int[n];  
        for(int i=0;i<n;i++){  
            num[i]=in.nextInt();  
        }  
        System.out.println(getResult());  
          
    }  
    public static int getResult(){  
        int max=0;  
        for(int i=0;i<n;i++){//从第i个卡片开始  
            int temp[]=new int[n];  
            for(int k=0;k<n;k++){  
                temp[k]=num[k];  
            }  
            int sum=0;  
            int count=1;  
            int start=i;  
            while(true){  
                boolean judge=true;  
                //判断数组中存在比count大的元素，若存在，则count能数到，否则count永远数不到比自己小的元素  
                for(int k=0;k<n;k++){  
                    if(temp[k]>=count){  
                        judge=false;  
                        break;  
                    }  
                }  
                if(judge) break;//count太大了，数组中不存在比count大的元素  
                int j=start%n;  
                if(temp[j]==count) {  
                    sum+=count;  
                    temp[j]=-1;//读到过了  
                    count=1;//重新从1开始读  
                }  
                else if(temp[j]!=-1){  
                	
                	count++;//读数增1  
                }  
                start++;//卡片增1  
            }
            max=Math.max(max, sum);  
        }  
        return max;  
    }  
}
