public class StudentData 
{

	private int studentId;
	private String firstName;
	private String lastName;
	private String major;
	private long phone;
	private float gpa;
	private Date birthDate;
	
	public StudentData() 
	{
		super();
	}

	public StudentData(int studentId, String firstName, String lastName,
			String major, long phone, float gpa, Date birthDate) 
	{
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.phone = phone;
		this.gpa = gpa;
		this.birthDate = birthDate;
	}

	public int getStudentId() 
	{
		return studentId;
	}

	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getMajor() 
	{
		return major;
	}

	public void setMajor(String major) 
	{
		this.major = major;
	}

	public long getPhone() 
	{
		return phone;
	}

	public void setPhone(long phone) 
	{
		this.phone = phone;
	}

	public float getGpa() 
	{
		return gpa;
	}

	public void setGpa(float gpa) 
	{
		this.gpa = gpa;
	}

	public Date getBirthDate() 
	{
		return birthDate;
	}

	public void setBirthDate(Date birthDate) 
	{
		this.birthDate = birthDate;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", major=" + major + ", phone="
				+ phone + ", gpa=" + gpa + ", birthDate=" + birthDate + "]";
	}
	
	

}
