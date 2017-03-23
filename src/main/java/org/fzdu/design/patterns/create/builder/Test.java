package org.fzdu.design.patterns.create.builder;

public class Test {

	public static void main(String[] args) {
		PersonDirector director = new PersonDirector();
		Person person = director.constructPerson(new ManBuilder());
		System.out.println(person.getHead());
	}

}
