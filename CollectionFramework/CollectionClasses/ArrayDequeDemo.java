import java.util.*;

class ArrayDequeDemo
{
	public static void main(String[] args) {
		ArrayDeque<String> adq = new ArrayDeque<String>();
		adq.push("E");
		adq.push("D");
		adq.push("C");
		adq.push("B");
		adq.push("A");
		System.out.println("\n\nArrayDeque size : "+ adq.size());
		System.out.println("\n\nArray Deque : "+ adq+"\n\nPopping the stack: ");
		Iterator itr = adq.iterator();
		System.out.println();
		while(itr.hasNext())
		{
			System.out.print(adq.pop()+" ");
		}
		/*
		while(adq.peek()!=null)
		{
			System.out.print(adq.pop()+" ");
		}
		*/
		System.out.println();
	}
}
