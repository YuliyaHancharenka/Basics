package hakerrank.daysOfCode30.Day23_BSTLevel_OrderTraversal;

import java.util.*;

public class Main {
    static void levelOrder(Node root) {
        //Write your code here

        Queue q = new LinkedList();
        int levelNodes = 0;

        if (root != null) {
            q.add(root);
            while (!q.isEmpty()) {
                levelNodes = q.size();
                while (levelNodes > 0) {
                    Node n = (Node) q.remove();
                    System.out.print(n.data + " ");
                    if (n.left != null) q.add(n.left);
                    if (n.right != null) q.add(n.right);
                    levelNodes--;
                }
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
