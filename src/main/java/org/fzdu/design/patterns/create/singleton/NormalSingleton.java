package org.fzdu.design.patterns.create.singleton;

/**
 * 这个类可以满足基本要求，但是，像这样毫无现成安全保护的类，如果我们把他放入多线程
 * 环境下，肯定就会出现问题了
 * @author Administrator
 *
 */
public class NormalSingleton {
	
	/**
	 * 持有私有静态实例，防止被引用，此处复制为null，目的是实现延迟加载
	 */
	private static NormalSingleton instance = null;
	
	/**
	 * 私有构造方法，防止被实例化
	 */
	private NormalSingleton(){
		
	}
	
	/**
	 * 静态工程方法，创建实例
	 * @return
	 */
	public static NormalSingleton getInstance(){
		if(null == instance){
			instance = new NormalSingleton();
		}
		return instance;
	}
	
	
	/**
	 * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	 * @return
	 */
	public Object readResolve(){
		return instance;
	}
}
