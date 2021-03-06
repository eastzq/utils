/**  
 * @Title: Tree.java
 * @Package com.zq.utils.jdk
 * @Description 
 * @author zq
 * @date 2021年3月25日 下午7:01:54
 * @Copyright 
 */

package com.zq.utils.algorithm.base;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description
 * @author zq
 * @date 2021年3月25日 下午7:01:54
 * @see
 * @since 2021年3月25日 下午7:01:54
 * 
 *        二叉树Binarytree 满二叉树Fullbinarytree 完全二叉树Completebinarytree
 *        二叉排序树Binarysorttree 二叉搜索树Binarysearchtree
 *        前序遍历Preordertraversal 中序遍历Inordertraversal
 *        后序遍历Postordertraversal 哈夫曼树Huffmantree 深度优先索引Depth-FirstSearch
 *        广度优先索引Breath-FirstSearch
 */

public class BfsAndDfs {

    public static void main(String[] args) {
        BfsAndDfs bd = new BfsAndDfs();
        bd.dfs(new File("D:\\data"));
        bd.dfs(new File("D:\\data"));
    }

    /**
     * 使用LinkedList 实现栈数据结构stack 遍历文件树。深度优先算法
     * 
     * @Description
     * @return void
     * @author zq
     * @date 2021年3月28日 下午9:33:00
     * @see
     */
    public void dfs(File dir) {
        LinkedList<File> stack = new LinkedList<>();
        stack.push(dir);
        while (!stack.isEmpty()) {
            File f = stack.pop();
            System.out.println(f.getName());
            if (f.isDirectory()) {
                File[] fs = f.listFiles();
                if(fs==null) {
                    continue;
                }
                for (File i : fs) {
                    stack.push(i);
                }
            }
        }
    }

    /**
     * 使用LinkedList 实现栈数据结构queue 遍历文件树。广度优先算法
     * 
     * @Description
     * @return void
     * @author zq
     * @date 2021年3月28日 下午9:33:00
     * @see
     */
    public void bfs(File dir) {
        LinkedList<File> queue = new LinkedList<>();
        queue.add(dir);
        while (!queue.isEmpty()) {
            File f = queue.removeLast();
            System.out.println(f.getName());
            if (f.isDirectory()) {
                File[] fs = f.listFiles();
                if(fs==null) {
                    continue;
                }
                for (File i : fs) {
                    queue.addFirst(i);
                }
            }
        }
    }
}
