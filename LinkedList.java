package com.bridgelabz.review;

public class LinkedList 
{
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next =  node;
		}
		
	}
	
	public void show()
	{
		System.out.println("Linked list elements =>");
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	
	public int search(int element)
	{
	    if (head == null) {
	        return -1;
	    }
	    int index = 0;
	    Node temp = head;

	    
	    while (temp != null) {

	        if (temp.data == element) {
	            return index;
	        }  
	        index++;
	        temp = temp.next;
	    }
	    return -1;
	}
	
	}
