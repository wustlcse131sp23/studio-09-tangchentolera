package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int AttemptedCredit;
	private int PassingCredit;
	private int credit;
	private double TotalGradeQualityPoints;
	private String ClassStanding;
	private boolean isEligibleForPhiBetaKappa;
	private double BearBucksBalance;
	private double cashOutAmount;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.ClassStanding="First Year";
		this.AttemptedCredit = 0;
		this.PassingCredit = 0;
		this.TotalGradeQualityPoints=0.0;
		this.isEligibleForPhiBetaKappa=false;
		this.BearBucksBalance=0.0;
		this.ClassStanding=ClassStanding;
		this.cashOutAmount=0.0;
		
	}
	}

	public String getFullName() {
		return firstName+" "+lastName;
	}

	public int getId() {
		 return id;
	}

	public void depositBearBucks(double amount) {
		BearBucksBalance +=amount;
	}

	public double getBearBucksBalance() {
		return BearBucksBalance;
	}
}
