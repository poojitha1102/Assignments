package program.jav.test;
import java.util.*;

public class Assignment_Collection {
	public static void main(String[] args) {
		LinkedHashSet ls1=new LinkedHashSet();
		ls1.add(1);
		ls1.add(2);
		ls1.add(2.4);
		ls1.add(23.5);
		ls1.add('d');
		ls1.add(true);
		
		System.out.println("LINKED HASH SET of generic type"+ls1);
		LinkedHashSet<Integer> ls2=new LinkedHashSet<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter elements");
		for(int i=0;i<8;i++)
		{
			int a=scan.nextInt();
			ls2.add(a);
		}
		System.out.println("LINKED HASH SET of Integer type"+ls2);

	}

}


