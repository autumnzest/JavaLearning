public class PersonModel {
	private String firstName = null;
	private String lastName = null;
	private int age = 0;
	private String sex = null;

	public PersonModel() {
	}

	public PersonModel(String name, int age, String sex) {
		this.firstName = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
