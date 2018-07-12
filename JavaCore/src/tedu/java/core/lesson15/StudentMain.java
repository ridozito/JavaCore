package tedu.java.core.lesson15;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Student s = new Student(1, "Nguyen Duc Anh", "Ha Noi", 7.4f);
		studentList.add(s);
		Student s2 = new Student(2, "Pham Hoang Ton", "Hai Duong", 8.0f);
		studentList.add(s2);
		Student s3 = findStudent(2, studentList);
		showInfor(s3);
	}

	private static void showInfor(Student s) {
		if(s == null) {
			System.out.println("Khong tim thay sinh vien");
		}else {
			System.out.println(s.getMaSv() + "-" + s.getName() + "-" + s.getAddress() + "-" + s.getDiemTb());
		}
		
	}

	private static Student findStudent(int maSv, List<Student> studentList) {
		for (Student s : studentList) {
			if(s.getMaSv() == maSv) {
				return s;
			}
		}
		return null;
	}
}
