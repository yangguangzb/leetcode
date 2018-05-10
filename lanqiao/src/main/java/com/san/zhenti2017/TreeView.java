package com.san.zhenti2017;


public class TreeView {
	public static void main(String[] args) {
		MyTree tree = new MyTree();
		tree.add("root", "dog");
		tree.add("root", "cat");
		tree.add("root", "duck");
		tree.add("dog", "AAdog");
		tree.add("dog", "BBdog");
		tree.add("dog", "CCdog");
		tree.add("AAdog", "AAdog01");
		tree.add("AAdog", "AAdog02");
		tree.add("cat", "XXcat");
		tree.add("cat", "YYcat");
		tree.add("XXcat","XXcat-oo");
		tree.add("XXcat","XXcat-qq");
		tree.add("XXcat-qq", "XXcat-qq-hahah");
		tree.add("duck", "TTduck");
		tree.add("TTduck", "TTduck-001");
		tree.add("TTduck", "TTduck-002");
		tree.add("TTduck", "TTduck-003");
		tree.add("YYcat","YYcat.hello");
		tree.add("YYcat","YYcat.yes");
		tree.add("YYcat","YYcat.me");		
		tree.dfs("root");
	}
}
