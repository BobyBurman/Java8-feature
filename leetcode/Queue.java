package leetcode;

import java.util.ArrayList;

public class Queue {
	
	static ArrayList<Integer> list=new ArrayList<Integer>();
	
	public static void enqueue(int i){
		list.add(i);
	}
	
	
	public static int dequeue(){
		int l=list.size();
		int i=0;
		if(l==0 && list.isEmpty()) {
			return -1;
		//queue	
	/*	}else {
			int r=l>=0?list.remove(i):-1;
			i++;
			return r;
		}*/
		
		//stack 
	}else {
		int r=list.remove(l-1);
		l--;
		return r;
	}
		
	}
	
	public static void main(String[] args) {
		
		enqueue(2);
		enqueue(4);
		enqueue(6);
		enqueue(8);
		System.out.println(list);
		
		
		System.out.println(dequeue());
		
		System.out.println(dequeue());
		
        System.out.println(dequeue());
		
		System.out.println(dequeue());
		
		System.out.println(list);
		
		
        System.out.println(dequeue());
		
		System.out.println(list);
		
	}

}

