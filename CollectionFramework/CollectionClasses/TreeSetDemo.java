import java.util.*;

class TreeSetDemo
{
	//TreeSet all time sorted the elements
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("A");
		ts.add("D");
		ts.add("C");
		ts.add("E");
		ts.add("B");
		ts.add("G");
		ts.add("G");
		ts.add("F");
		ts.add("Z");
		System.out.println("\n\nHastSet contains Z? : "+ ts.contains("Z"));
		ts.remove("Z");
		System.out.println("\n\nHastSet Size : "+ ts.size());
		System.out.println("SubSet of A to E: "+ts.subSet("A","E"));
		//Inclusice C but exclusive E
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}
}
