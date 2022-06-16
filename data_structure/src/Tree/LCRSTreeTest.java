package Tree;

public class LCRSTreeTest
{
    public static void main(String[] args)
    {
        LCRSNode<Character> Root = new LCRSNode<>('A');
        LCRSNode<Character> B = new LCRSNode<>('B');
        LCRSNode<Character> C = new LCRSNode<>('C');
        LCRSNode<Character> D = new LCRSNode<>('D');
        LCRSNode<Character> E = new LCRSNode<>('E');
        LCRSNode<Character> F = new LCRSNode<>('F');
        LCRSNode<Character> G = new LCRSNode<>('G');
        LCRSNode<Character> H = new LCRSNode<>('H');
        LCRSNode<Character> I = new LCRSNode<>('I');
        LCRSNode<Character> J = new LCRSNode<>('J');
        LCRSNode<Character> K = new LCRSNode<>('K');

        LCRSTree<Character> tree = new LCRSTree<>();
        tree.addChildNode(Root,B);
        tree.addChildNode(B,C);
        tree.addChildNode(B,D);
        tree.addChildNode(D,E);
        tree.addChildNode(D,F);
        tree.addChildNode(Root,G);
        tree.addChildNode(G,H);

        tree.addChildNode(Root,I);
        tree.addChildNode(I,J);
        tree.addChildNode(J,K);

        tree.printTree(Root, 0);
        tree.printNodesAtLevel(Root, 2);
    }
}
