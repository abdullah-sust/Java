import java.util.*;

class LinkedListDemo
{
	public LinkedListDemo(){}

	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("C");
		ll.add("B");
		ll.add("D");
		ll.add("U");
		ll.add("L");
		ll.add("L");
		ll.add("A");
		ll.add("Z");
		ll.removeFirst();
		ll.removeLast();
		ll.addFirst("A");
		ll.addLast("H");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"");
		}
		System.out.println();
	}
}
