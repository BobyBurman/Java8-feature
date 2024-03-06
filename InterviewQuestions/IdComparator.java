package InterviewQuestions;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getId()==o1.getId()) {
			return 0;
		}
		else if(o1.getId()>o1.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
