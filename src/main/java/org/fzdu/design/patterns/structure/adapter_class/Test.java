package org.fzdu.design.patterns.structure.adapter_class;

public class Test {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}

}
