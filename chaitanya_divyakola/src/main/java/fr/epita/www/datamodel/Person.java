package fr.epita.www.datamodel;

public class Person implements Comparable<Person>{

	private String name;
	private String sex;
	private Integer age;
	private Integer height;
	private Integer weight;
	
	public Person(){
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	
	@Override
	public int compareTo(Person person) {
	 
	 return (this.weight - person.getWeight());
	}
}
