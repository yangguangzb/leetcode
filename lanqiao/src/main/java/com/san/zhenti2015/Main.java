package com.san.zhenti2015;
/**
 * 显示二叉树
 * @description
 * @author zhangbiao
 * @time 2018-5-24 上午11:09:10
 */
public class Main {
	public static void main(String[] args) {
		BiTree tree = new BiTree(500);
		tree.add(new BiTree(200));
		tree.add(new BiTree(509));
		tree.add(new BiTree(100));
		tree.add(new BiTree(250));
		tree.add(new BiTree(507));
		tree.add(new BiTree(600));
		tree.add(new BiTree(650));
		tree.add(new BiTree(450));
		tree.add(new BiTree(510));
		tree.add(new BiTree(440));
		tree.add(new BiTree(220));		
		tree.show();
	}
}
