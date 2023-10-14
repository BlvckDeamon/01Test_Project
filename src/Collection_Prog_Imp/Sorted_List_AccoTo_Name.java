package Collection_Prog_Imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Lab
{
	int labId;
	
	Lab(int labId)
	{
		this.labId = labId; 
	}
	
	public int getLabId()
	{
		return labId;
	}
	
	public String toString()
	{
		return "Lab =["+labId+"]";
	}
}
public class Sorted_List_AccoTo_Name {

	public static void main(String[] args) {
		
		Lab l1 = new Lab(20);
		Lab l2 = new Lab(10);
		Lab l3 = new Lab(40);
		
		List l = new ArrayList<Lab>();
		l.add(l1);
		l.add(l2);
		l.add(l3);
		
		System.out.println(l);
	
		List k = l.stream().sorted(Comparator.comparing(Lab::getLabId)).toList();
		System.out.println(k);
	}

}
