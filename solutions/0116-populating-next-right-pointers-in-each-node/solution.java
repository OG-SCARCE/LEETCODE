/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
import java.util.*;
class Solution 
{
    public Node connect(Node root) 
    {
        Queue<Node> queue=new LinkedList<>();
        if(root==null)
          return root;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int n=queue.size();
            for(int i=0;i<n;i++)
            {
                Node current=queue.poll();
                if(current.left!=null)
                  queue.offer(current.left);
                if(current.right!=null)
                 queue.offer(current.right);
                if(i==n-1)
                  current.next=null;
                else
                  current.next=queue.peek();
            }
        }
        return root;
    }
}
