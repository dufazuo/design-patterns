package org.fzdu.design.patterns.create.builder;

public class ManBuilder implements PersonBuilder {
	
	Person person;
	
	public ManBuilder(){
		person = new Man();
	}

	public void buildHead() {
		person.setHead("建造男人的头部");
	}

	public void buildBody() {
		person.setBody("建造男人的身体");
	}

	public void buildFoot() {
		person.setFoot("建造男人的脚");
	}

	public Person buildPerson() {
		return person;
	}

}
