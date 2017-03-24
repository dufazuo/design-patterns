package org.fzdu.design.patterns.structure.adapter_object;

/**
 * 当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例
 * 在Wrapper类的方法中，调用实例的方法就行
 * @author Administrator
 *
 */
public class Wrapper implements Targetable {

	private Source source;
	
	public Wrapper(Source source){
		super();
		this.source = source;
	}
	
	public void method2() {
		System.out.println("this is the targetable method");
	}


	public void method1() {
		source.method1();
	}

}
