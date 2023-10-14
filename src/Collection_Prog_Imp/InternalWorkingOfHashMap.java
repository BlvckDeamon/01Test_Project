package Collection_Prog_Imp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Student {
	private Integer id;
	private String name;

	public Student() {
		super();
		
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id%11);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
}

public class InternalWorkingOfHashMap {
	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<>();
		
		Student s1 = new Student(1, "Ashish");
		Student s2= new Student(1, "Adesh");
		Student s3= new Student(1, "Adesh");
		Student s4= new Student(1, "Adesh");
		Student s5= new Student(1, "Adesh");
		Student s6= new Student(1, "Adesh");
		Student s7= new Student(1, "Adesh");
		Student s8= new Student(1, "Adesh");
		Student s9= new Student(1, "Adesh");
		Student s10 = new Student(3, "Kiran");
		Student s11 = new Student(1, "Ashish");
		Student s12 = new Student(1, "Adesh");
		Student s13 = new Student(1, "Adesh");
		Student s14 = new Student(3, "Kiran");
		Student s15 = new Student(1, "Ashish");
		Student s16= new Student(1, "Adesh");
		Student s17= new Student(1, "Adesh");
		
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		map.put(4,s4);
		map.put(5,s5);
		map.put(6,s6);
		map.put(7,s7);
		map.put(8,s8);
		map.put(9,s9);
		map.put(10,s10);
		map.put(11,s11);
		map.put(12,s12);
		map.put(13,s13);
		map.put(14,s14);
		map.put(15,s15);
		map.put(16,s16);
		map.put(17,s17);
		
		Set s = map.entrySet();
		System.out.println(s);
		
		Iterator itr  = s.iterator(); 	     
		
		while(itr .hasNext())
		{
			Map.Entry<Integer, Student> m1 = (Map.Entry<Integer, Student>)itr.next();
			
			System.out.println(m1);
		}
		
		//System.out.println(map);
		
		

	}

}
