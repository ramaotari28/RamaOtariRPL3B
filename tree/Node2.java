import java.util.LinkedList;
import java.util.Queue;

public class Node2 {
    int data;
    Node2 left;
    Node2 right;

    // Konstruktor untuk membuat simpul baru dengan nilai tertentu
    public Node2(int data) {
        this.data = data;

        class BinaryTreeStructure {
            Node2 root;

            // Konstruktor untuk membuat pohon biner baru
            public BinaryTreeStructure() {
                root = null;
            }

            // Metode utama
            public static void main(String[] args) {
                BinaryTreeStructure tree = new BinaryTreeStructure();

                // Membentuk pohon dengan menambahkan simpul
                tree.root = new Node2(50);
                tree.root.left = new Node2(30);
                tree.root.right = new Node2(70);
                tree.root.left.left = new Node2(10);
                tree.root.left.right = new Node2(35);
                tree.root.right.left = new Node2(65);
                tree.root.right.right = new Node2(80);

                // Cetak struktur pohon seperti struktur folder
                System.out.println("Struktur Pohon:");
                printTreeStructure(tree.root, "", true);

                System.out.println("\nPreorder Traversal:");
                tree.preorderTraversal(tree.root);

                System.out.println("\nInorder Traversal:");
                tree.inorderTraversal(tree.root);

                System.out.println("\nPostorder Traversal:");
                tree.postorderTraversal(tree.root);

                System.out.println("\nLevel Order Traversal:");
                tree.LevelOrder(tree.root);
            }

            // Metode untuk mencetak struktur pohon seperti struktur folder
            public static void printTreeStructure(Node2 node, String prefix, boolean isTail) {
                if (node != null) {
                    System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);
                    if (node.left != null || node.right != null) {
                        printTreeStructure(node.left, prefix + (isTail ? "    " : "│   "), false);
                        printTreeStructure(node.right, prefix + (isTail ? "    " : "│   "), true);
                    }
                }
            }

            // Metode untuk penelusuran preorder
            public void preorderTraversal(Node2 node) {
                if (node != null) {
                    System.out.print(node.data + " ");
                    preorderTraversal(node.left);
                    preorderTraversal(node.right);
                }
            }

            // Metode untuk penelusuran inorder
            public void inorderTraversal(Node2 node) {
                if (node != null) {
                    inorderTraversal(node.left);
                    System.out.print(node.data + " ");
                    inorderTraversal(node.right);
                }
            }

            // Metode untuk penelusuran postorder
            public void postorderTraversal(Node2 node) {
                if (node != null) {
                    postorderTraversal(node.left);
                    postorderTraversal(node.right);
                    System.out.print(node.data + " ");
                }
            }

            // Metode untuk penelusuran level order menggunakan Queue
            public static void LevelOrder(Node2 root) {
                Queue<Node2> queue = new LinkedList<>();
                queue.add(root);

                while (!queue.isEmpty()) {
                    Node2 current = queue.poll();
                    System.out.print(current.data + " ");

                    if (current.left != null) {
                        queue.add(current.left);

                    }
                }
            }
        }
    }
}