package test.demo.src;
import java.util.*;
public class binary_tree {

    class Solution {
        ArrayList<Integer> list = new ArrayList<>();

        // 第一要素：明确你这个函数想要干什么
        // 函数功能：进行先序遍历二叉树
        public List<Integer> preorderTraversal(TreeNode root) {
            // 第二要素：寻找递归结束条件
            if (root == null)
                return;
            // 第三要素：找出函数的等价关系式
            list.add(root.val);// 中
            if (root.left != null)// 左
                preorderTraversal(root.left);

            if (root.right != null)// 右
                preorderTraversal(root.right);

            return list;
        }
    }

    class qianxv {
        private List<Integer> list = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            preorder(root);
            return list;
        }
        public void preorder (TreeNode root){
            if (root == null)
                return;
            list.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
       
    }
}
