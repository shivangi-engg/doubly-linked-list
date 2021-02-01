package printpackage;
import java.util.*;
import java.lang.*;
public class Linked_list
{
	//defining head node to start with
	Node head;
	//now we will create a method insert to insert at the end of the linked list
	public void insert_end(int data)
	{
		//create a new node and assign it the value user wants to give
		Node node = new Node();
		node.data = data;
		//set next of node to be null because this will be the last node of the linked list
		node.next = null;
		//set previous to be null, if the node is empty previous will be null otherwiae we will assign 
		//node to it
		node.previous = null;
		//if the head is null then there will only be one node in the linked list which we created now
		if(head == null)
		{
			head = node;
		}
		else
		{
			//creating a node that will traverse through the linked list to find its end
			//and set this node to head to start traversing from the head node i.e starting
			Node n = head;
			//traverse till u find the end of the linked list
			while(n.next != null)
			{
				//when end not reached set current node as n.previous
				n.previous = n;
				//and n.next as node
				n = n.next;
			}
			//now we have found the end of the node so set n.next as node which we want to add 
			//and n as node.previous
			n.next = node;
			node.previous = n;
		}
	}
	//method to insert at the starting of linked list
	public void insert_start(int data)
	{
		//make a node and give the value as asked by the user
		Node node = new Node();
		//putting data in node, setting previous and next
		node.data = data;
		//previous will always be null in this case because we want to add node at the starting
		node.previous = null;
		//for now node's next will be null,we'll modify it if there are other nodes in the list
		node.next = null;
		//if head.next = null => there will only be one node in the list
		if(head.next == null )
		{
			head = node;
		}
		else
		{
			node.next = head;
			head = node;
		}
	}
	//method to insert at a particular index
	public void insert_at(int data, int position)
	{
		//make a new node to enter the value asked by user
		Node node = new Node();
		node.data = data;
		node.previous=null;
		node.next = null;
		if(head.next == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			for(int i=1; i<position; i++)
			{
				n.previous = n;
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			node.previous = n;
		}
	}
	//method to show the node of the linked list
	public void show()
	{
		//create a node to traverse through each node if the linked list so that we can print each node
		//set it equal to head to start with
		Node node = head;
		//travesrse till the end is null
		while(node.next != null)
		{
			System.out.print("-->");
			//to print the data in the current node
			System.out.print(node.data);
			//set current node value as node.previous
			node.previous = node;
			//give node the value of node.next
			node = node.next;
		}
		System.out.print("-->");
		System.out.print(node.data);
	}
}