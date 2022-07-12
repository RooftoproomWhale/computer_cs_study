package Search.Binary;

import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void testBST()
    {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(new BSTNode<>(123));
        BSTNode<Integer> tree = binarySearchTree.getRoot();

        binarySearchTree.insertNode(tree,new BSTNode<>(22));
        binarySearchTree.insertNode(tree,new BSTNode<>(9918));
        binarySearchTree.insertNode(tree,new BSTNode<>(424));
        binarySearchTree.insertNode(tree,new BSTNode<>(17));
        binarySearchTree.insertNode(tree,new BSTNode<>(3));

        binarySearchTree.insertNode(tree,new BSTNode<>(98));
        binarySearchTree.insertNode(tree,new BSTNode<>(34));

        binarySearchTree.insertNode(tree,new BSTNode<>(760));
        binarySearchTree.insertNode(tree,new BSTNode<>(317));
        binarySearchTree.insertNode(tree,new BSTNode<>(1));

        binarySearchTree.inorderPrintTree(tree);
        System.out.println();

        System.out.println("Removing 98...");

        binarySearchTree.removeNode(tree, null, 98);

        binarySearchTree.inorderPrintTree(tree);
        System.out.println();

        System.out.println("Inserting 111...");

        binarySearchTree.insertNode(tree, new BSTNode<>(111));
        binarySearchTree.inorderPrintTree(tree);
        System.out.println();
    }
}