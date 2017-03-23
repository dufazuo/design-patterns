package org.fzdu.design.patterns.create.singleton;

/**
 * 将synchronized关键字加载了内部，也就是说当调用的时候是不需要加锁的，只有在instance为null时
 * 并创建对象的时候才加锁，性能有一定的提升。但是，这样的情况，还是有问题的：在java指令中创建对象和赋值操作
 * 是分开进行的，也就是说JVM有可能为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去
 * 初始化这个Singleton实例。
 * @author Administrator
 *
 */
public class InnerClassSingleton {
	
	
	
	/**
	 * 私有构造方法，防止被实例化
	 */
	private InnerClassSingleton(){
		
	}
	
	/**
	 * 此处使用一个内部类来维护单例
	 * @author Administrator
	 *
	 */
	private static class SingletonFactory {
		private static InnerClassSingleton instance = new InnerClassSingleton();
	}
	
	/**
	 * 获取实例
	 * @return
	 */
	public static InnerClassSingleton getInstance(){
		return SingletonFactory.instance;
	}
	
	
	/**
	 * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	 * @return
	 */
	public Object readResolve(){
		return SingletonFactory.instance;
	}
}
