package Collection_Prog_Imp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Stud 
{
	int RollNo;
	public int hashCode() {
		return RollNo;
	}
	Stud(int n) {
		RollNo = n;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String toString() {
		return "Stud [RollNo=" + RollNo + "]";
	}
}
public class ArrayList_Sorting_Objects {

	public static void main(String[] args) {

		Stud s1 = new Stud(20);
		Stud s2 = new Stud(10);
		Stud s3 = new Stud(30);

		ArrayList<Stud> l = new ArrayList<Stud>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
//		List<Stud> soretedList = l.stream().sorted(Comparator.comparing(Stud::getRollNo).reversed()).collect(Collectors.toList());
//		System.out.println(soretedList);
		
		List sorted = l.stream().sorted(Comparator.comparing(Stud::getRollNo)).toList(); 
		System.out.println(sorted);
	}

}
 
