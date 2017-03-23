package org.fzdu.design.patterns.create.builder;

public interface PersonBuilder {

	public void buildHead();
	
	public void buildBody();
	
	public void buildFoot();
	
	public Person buildPerson();
}
