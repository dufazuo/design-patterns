package org.fzdu.design.patterns.create.prototype;

public class Test {

	public static void main(String[] args) {
		Prototype pro = new Prototype();
		pro.setName("test");
		Prototype pro2 = (Prototype) pro.clone();
		System.out.println(pro.getName());
		System.out.println(pro2.getName());
	}

}
