import java.util.*;

public class Node {
    int data;
    Node left;
    Node right;

    // Konstruktor untuk membuat objek Node dengan data tertentu
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        // Membuat objek-objek Node untuk membentuk pohon
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.right.left = new Node(9);
        root.right.left.left = new Node(10);

        // Cetak struktur pohon seperti yang Anda inginkan
        System.out.println("Struktur Pohon:");
        printTreeStructure(root, "");

        System.out.println("\nTraversal Inorder:");
        inorderTraversal(root);

        System.out.println("\nTraversal Preorder:");
        preorderTraversal(root);

        System.out.println("\nTraversal Postorder:");
        postorderTraversal(root);

        System.out.println("\nLevel Order Traversal:");
        printLevelOrder(root);
    }

    // Metode untuk mencetak struktur pohon dengan format khusus
    public static void printTreeStructure(Node node, String prefix) {
        if (node != null) {
            System.out.println(prefix + "└── " + node.data);

            if (node.left != null || node.right != null) {
                if (node.left != null && node.right != null) {
                    printTreeStructure(node.left, prefix + "    │");
                    printTreeStructure(node.right, prefix + "     ");
                } else if (node.left != null) {
                    printTreeStructure(node.left, prefix + "     ");
                } else if (node.right != null) {
                    printTreeStructure(node.right, prefix + "     ");
                }
            }
        }
    }

    // Metode untuk penelusuran inorder
    public static void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Metode untuk penelusuran preorder
    public static void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Metode untuk penelusuran postorder
    public static void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Metode untuk penelusuran level order menggunakan Queue
    public static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}
