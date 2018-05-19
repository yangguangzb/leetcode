package com.san.zhenti2017;

import java.util.Scanner;

/**
 * 小计算器
 * @description
 * @author zhangbiao
 * @time 2018-5-16 下午4:11:40
 */
public class Main11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	//指令的条数
		int jinzhi=10;		//当前进制：默认是十进制
		int x=0;			//结果
		//运算符，默认设置为加法运算
		//相当于0加一个数
		String yunSuan="ADD";
		sc.nextLine();	//使用nextLine，输入是以回车结束，遇到空格等不会结束
		for(int i=0;i<n;i++){
			String string=sc.nextLine();
			if(string.indexOf("CLEAR")!=-1){
				//清空当前字符，结果变为0
				x=0;
			}else if(string.indexOf("NUM")!=-1){
				//运算处理
				string=string.split(" ")[1];
				if(yunSuan.indexOf("ADD")!=-1){
					//Integer.parseInt(s, radix)：其他进制到十进制
					x=x+Integer.parseInt(string,jinzhi);
					
				}else if(yunSuan.indexOf("SUB")!=-1){
					x=x-Integer.parseInt(string, jinzhi);
					
				}else if(yunSuan.indexOf("MUL")!=-1){
					x=x*Integer.parseInt(string, jinzhi);
					
				}else if(yunSuan.indexOf("DIV")!=-1){
					x=x/Integer.parseInt(string, jinzhi);
					
				}else if(yunSuan.indexOf("MOD")!=-1){
					x=x%Integer.parseInt(string, jinzhi);
					
				}
			}else if(string.indexOf("ADD")!=-1){
				//加法
				yunSuan="ADD";
				
			}else if(string.indexOf("SUB")!=-1){
				//减法
				yunSuan="SUB";
				
			}else if(string.indexOf("MUL")!=-1){
				//乘法
				yunSuan="MUL";
				
			}else if(string.indexOf("DIV")!=-1){
				//除法
				yunSuan="DIV";
				
			}else if(string.indexOf("MOD")!=-1){
				//取余
				yunSuan="MOD";
				
			}else if(string.indexOf("CHANGE")!=-1){
				//进制转换
				string =string.split(" ")[1];
				jinzhi=Integer.parseInt(string);
				
			}else if(string.indexOf("EQUAL")!=-1){
				//输出指令
				//Integer.toString(x, jinzhi)：十进制到其他进制
				System.out.println(Integer.toString(x, jinzhi));
		
			}else if(string.indexOf("CLEAR")!=-1){
				//清空指令
				x=0;
				yunSuan="ADD";
			}
		}
	}
}
