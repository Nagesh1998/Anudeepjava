import java.util.HashSet;

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<Student> hset=new HashSet<>();
		Student s1=new Student(101, "Prashant", "9307515220");
		Student s2=new Student(102,"Sagar","8530895620");
		Student s3=new Student(103,"Golu","8830501654");
		Student s4=new Student(104,"Pradip","9011202277");
		Student s5=new Student(105,"Gaurav","9856235478");
		hset.add(s1);
		hset.add(s3);
		hset.add(s5);
		hset.add(s4);
		hset.add(s2);
		for (Student student : hset) {
			if (student.getSid()>103) {
				System.out.println(student);
			}
		}  
  }
}