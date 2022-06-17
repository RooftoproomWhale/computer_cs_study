package Tree.BinaryTree;

public class BinaryTreeTest
{
    public static void main(String[] args) {
        SBTNode<Character> A = new SBTNode<>('A');
        SBTNode<Character> B = new SBTNode<>('B');
        SBTNode<Character> C = new SBTNode<>('C');
        SBTNode<Character> D = new SBTNode<>('D');
        SBTNode<Character> F = new SBTNode<>('F');
        SBTNode<Character> E = new SBTNode<>('E');
        SBTNode<Character> G = new SBTNode<>('G');

        A.setLeft(B);
        B.setLeft(C);
        B.setRight(D);

        A.setRight(E);
        E.setLeft(F);
        E.setRight(G);

        BinaryTree<Character> binaryTree = new BinaryTree<>();

        System.out.println("PreOrder ...");
        binaryTree.preOrderPrintTree(A);
        System.out.println();
        System.out.println();

        System.out.println("InOrder ...");
        binaryTree.inOrderPrintTree(A);
        System.out.println();
        System.out.println();

        System.out.println("PostOrder ...");
        binaryTree.postOrderPrintTree(A);
        System.out.println();
        System.out.println();
    }
}
