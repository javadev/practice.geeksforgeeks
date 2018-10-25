class Node
{
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class N1_BST_Search
{
    boolean search(Node root, int x)
    {
		if(null == root) {
			return false;
		}
		//Condition 1. we found the value
		if(root.data == x) {
			return true;
		} 
		//Condition 2. 
		//Value is less than node value. so go left sub tree
		else if(x < root.data)
			return search(root.left,x);
		//Condition 3. 
		//Value is greater than node value. so go right sub tree
		else 
			return search(root.right,x);
    }
}
