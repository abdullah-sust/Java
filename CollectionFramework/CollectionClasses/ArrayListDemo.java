import java.util.*;

public class ArrayListDemo
{
	public ArrayListDemo()
	{
		System.out.println("");
	}
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("Abdullah");
		al.add("Moqsad");
		al.add("Saddam");
		al.add("Rafi");
		al.remove("Abdullah");
		System.out.println("ArrayList size: "+ al.size());

		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		for(String name : al)
		{
			System.out.print(name+" ");
		}
		System.out.println();
	}
}
