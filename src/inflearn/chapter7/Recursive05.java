package inflearn.chapter7;


public class Recursive05 {
    //깊이 우선 탐색
    Node root;
    public void Solution(Node root){
        if(root==null) return;
        else{
            //전위순회
            Solution(root.lt);
            //중위순회
            Solution(root.rt);
            //후위순회
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Recursive05 tree = new Recursive05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.Solution(tree.root);
    }
}
class Node{
    int data;
    Node lt,rt;
    public Node(int data){
        this.data= data;
        this.lt = this.rt = null;
    }
}