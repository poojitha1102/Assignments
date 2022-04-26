package program.jav.test;

import java.util.List;
import java.util.ArrayList;
public class DequeProgram {
	private List<Integer> deque=new ArrayList<Integer>();
	public void insertFront(int item){
		System.out.println("adding at front:"+item);
		deque.add(0,item);
		System.out.println(deque);
	}
	public void insertRear(int item){
		System.out.println("adding at rear:"+item);
		deque.add(0,item);
		System.out.println(deque);
	}
	public void removeFront(){
		if(deque.isEmpty()){
			System.out.println("deque underflow!1 unable to remove");
			return;
		}
		int rem=deque.remove(0);
		System.out.println("removed from rear"+rem);
		System.out.println(deque);
	}
	public void removeRear(){
		if(deque.isEmpty()){
			System.out.println("deque underflow!1 unable to remove");
			return;
		}
		int rem=deque.remove(deque.size()-1);
		System.out.println("removed from rear"+rem);
		System.out.println(deque);
	}
	public int peakFront(){
		int item=deque.get(0);
		System.out.println("element at first"+item);
		return item;
	}
	public int peakRear(){
		int item=deque.get(deque.size()-1);
		System.out.println("element at rear"+item);
		return item;
	}
	public static void main(String a[]){
		DequeProgram deq=new DequeProgram();
		deq.insertFront(34);
		deq.insertFront(22);
		deq.removeRear();
		deq.insertFront(99);
		deq.insertRear(45);
		deq.removeFront();
		deq.insertFront(21);
		deq.insertFront(98);
		deq.insertRear(5);
		deq.insertFront(55);
		deq.insertFront(44);
		deq.removeRear();
		deq.insertRear(76);
		deq.insertRear(52);
		}
	

}
