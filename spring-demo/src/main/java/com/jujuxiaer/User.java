package com.jujuxiaer;

/**
 * @author Jujuxiaer
 * @since 2023-04-01 09:51
 */
public class User {

	private String name;
	private Integer age;

	public User() {
	}

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Gets the value of name.
	 *
	 * @return the value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * <p>You can use getName() to get the value of name</p>
	 *
	 * @param name name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the value of age.
	 *
	 * @return the value of age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 * <p>You can use getAge() to get the value of age</p>
	 *
	 * @param age age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
