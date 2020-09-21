package trees;

import java.util.Scanner;



public class BinarySearchTreee {
	
	static Node root;
	static Scanner sc = new Scanner(System.in);

	
	
	
	class Node{
		int data;
		Node llink;
		Node rlink;
	}
	
	

	public static void main(String[] args) {
			int input;
			BinarySearchTreee tree=new BinarySearchTreee();
			while(true) {
				System.out.println("press 1 create node ");
				System.out.println("press 2 create node ");
				System.out.println("enetr anythong to stop");
				input = sc.nextInt();
				switch (input) {
				case 1:tree.createnode();
					
					break;
				case 2:tree.inorder(root);
				break;
				
				case 3:tree.preorder(root);
				break;
					
				case 4:tree.postorder(root);
				break;


				default:
					return;
				}
			}
	}
public void preorder(Node root) {
		
		if(root!=null) {
			System.out.println("data :"+root.data);
			preorder(root.llink);
			preorder(root.rlink);
		}
	}
public void postorder(Node root) {
	
	if(root!=null) {
		
		postorder(root.llink);
		postorder(root.rlink);
		System.out.println("data :"+root.data);
	}
	
}

	public void inorder(Node root) {
		
		if(root!=null) {
			inorder(root.llink);
			System.out.println("data :"+root.data);
			inorder(root.rlink);
		}
		
	}



	public void createnode() {
		Node node=new Node();
		node.llink=null;
		node.rlink=null;
		System.out.println("enter ele to store");
		node.data=sc.nextInt();
		if(root==null){
			root=node;
		}
		else {
			
			Node temp2=root;
			Node temp1=null;
			while(temp2!=null) {
				if(node.data<temp2.data) {
				temp1=temp2;
				temp2=temp2.llink;
				}
				else {
					temp1=temp2;
					temp2=temp2.rlink;
				}
			}
			if(node.data<temp1.data) {
				temp1.llink=node;
			}
			else {
				
				temp1.rlink=node;
			}
		}
	}
}
	