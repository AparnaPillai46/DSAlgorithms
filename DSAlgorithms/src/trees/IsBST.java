package trees;

public class IsBST {

    static class Node {
        int val;
        Node left;
        Node right;
        public Node(int value) {
            this.val = value;
        }
    }
    
    
    public static boolean isBST(Node node, int min, int max){
    	
    if(node.val<min || node.val>max){
    	return false;
    }
    	return ((isBST(node.left,min,node.val))&&(isBST(node.right,node.val,max)));
    	
    }
	
}
