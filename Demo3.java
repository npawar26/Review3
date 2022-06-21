package com.bridgelabz.review;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first element to insert in linkedlist");
		int a=sc.nextInt();
		list.insert(a);

		System.out.println("Enter second element to insert in linkedlist");
		int b=sc.nextInt();
		list.insert(b);

		System.out.println("Enter third element to insert in linkedlist");
		int c=sc.nextInt();
		list.insert(c);


		list.show();

		System.out.println("Enter element to search in linkedlist");
		int d=sc.nextInt();

		int ans = list.search(d);
		if (ans == d) {
			System.out.println(
					"Element not found in the Linked List");
		}
		else
			System.out.println(
					"Element found in the Linked List at "
							+ ans);
	}

}

