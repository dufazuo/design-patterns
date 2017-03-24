package org.fzdu.design.patterns.structure.adapter_interface;

public class Test {

	public static void main(String[] args) {
		Sourceable source1 = new SourceableSub1();
		Sourceable source2 = new SourceableSub2();
		
		source1.method1();
		source1.method2();
		
		source2.method1();
		source2.method2();
	}

}
