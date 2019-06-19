public class PersonModel {
	private String firstName = null;
	private EarthModel emmodel = null;
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

	public EarthModel getEarthModel() {
		return emmodel;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setEarthModel(EarthModel emmodel) {
		this.emmodel = emmodel;
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
