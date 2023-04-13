package studio9;

import assignment7.Student;

import java.util.HashMap;
import java.util.Map;

public class UniversityDatabase {
	private final Map<String, Student> university;
	
public UniversityDatabase() {
	this.university = new HashMap<>();
}
	

	public void addStudent(String accountName, Student student) {
		university.put(accountName, student);
	}

	public int getStudentCount() {

		return university.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		if(university.get(accountName)==null) {
			return null;
		};
		else {
			
			return university.get(accountName);
		}
	}

	public double getTotalBearBucks() {
		// TODO
		return 0.0;
	}
}
