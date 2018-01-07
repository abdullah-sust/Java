import java.util.*;

class LinkedHashSetDemo{
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("T");
		lhs.add("A");
		lhs.add("S");
		lhs.add("M");
		lhs.add("I");
		lhs.add("N");
		lhs.remove("Z");
		System.out.println("\n\nLinkedHashSet contains A? :"+ lhs.contains("A"));
		System.out.println("\n\nLinkedHashSet Size: "+ lhs.size());
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}
}