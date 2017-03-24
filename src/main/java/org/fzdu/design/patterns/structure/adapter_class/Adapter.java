package org.fzdu.design.patterns.structure.adapter_class;

/**
 * 当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类
 * 继承原类，实现新的接口即可
 * @author Administrator
 *
 */
public class Adapter extends Source implements Targetable {

	public void method2() {
		System.out.println("this is the targetable method");
	}

}
