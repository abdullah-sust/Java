import java.util.*;

class PriorityQueueDemo{
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		System.out.println(pq.size());
		pq.add("A");
		pq.add("B");
		pq.add("D");
		pq.add("U");
		pq.add("L");
		pq.add("L");
		pq.add("A");
		pq.add("H");
		pq.add("M");
		System.out.println(pq);
		pq.remove("M");
		//System.out.println("PriorityQueue size: "+pq.size());
		//System.out.println("PriorityQueue contains Y? ",pq.contains("Y"));
		Iterator itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		System.out.println();
	}
}