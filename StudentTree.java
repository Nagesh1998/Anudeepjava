import java.util.TreeSet;

public class StudentTree {

	public static void main(String[] args) throws Exception{
		TreeSet<Student> set=new TreeSet<>();

		StudentList.fillArrayList();
		set.addAll(StudentList.list1);
		set.addAll(StudentList.list2);
		System.out.println("Number of element in the set : "+set.size());

		System.out.println("\nFirst element in the set : \n"+set.pollFirst());
		System.out.println("\nLast element in the set : \n"+set.pollLast());
	}

}