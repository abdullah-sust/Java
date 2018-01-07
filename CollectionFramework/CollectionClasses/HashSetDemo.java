import java.util.*;

class HashSetDemo
{
	//Does not guarantee the order of its elements. If you want to do like that you can use TreeSet 
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("T");
		hs.add("A");
		hs.add("S");
		hs.add("M");
		hs.add("I");
		hs.add("N");
		hs.remove("Z");
		System.out.println("\n\nHashSet contains A? :"+ hs.contains("A"));
		System.out.println("\n\nHashSet Size: "+ hs.size());
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}
}