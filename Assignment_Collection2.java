package program.jav.test;
import java.util.*;
import java.util.TreeSet;

public class Assignment_Collection2 {
    public static void main(String[] args){
	TreeSet< String> tset=new TreeSet<String>();
	tset.add("JAVA");
	tset.add("C");
	tset.add("C++");
	tset.add("R");
	tset.add("PYTHON");
	tset.add("PASCAL");
	
	System.out.println("TREE SET :"+tset);
	tset.remove("C++");
	tset.remove("R");
	System.out.println("TREE SET :"+tset);
	tset.add("Ruby");
	tset.add("Perl");
	tset.add("C#");
	System.out.println("TREE SET :"+tset);
   System.out.println(tset.contains("JAVA"));
   
   tset.clear();
   System.out.println(tset);
}

}

	

