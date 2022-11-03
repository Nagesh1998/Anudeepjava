import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		if(o1.getSid()>o2.getSid())
			return 1;
		else if(o1.getSid()<o2.getSid())
			 return -1;
		else
		          return 0;
	}

}
