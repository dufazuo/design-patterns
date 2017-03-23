package org.fzdu.design.patterns.create.singleton;

/**
 * 将synchronized关键字加载了内部，也就是说当调用的时候是不需要加锁的，只有在instance为null时
 * 并创建对象的时候才加锁，性能有一定的提升。但是，这样的情况，还是有问题的：在java指令中创建对象和赋值操作
 * 是分开进行的，也就是说JVM有可能为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去
 * 初始化这个Singleton实例。
 * @author Administrator
 *
 */
public class ThreadSafetySingleton {
	
	/**
	 * 持有私有静态实例，防止被引用，此处复制为null，目的是实现延迟加载
	 */
	private static ThreadSafetySingleton instance = null;
	
	/**
	 * 私有构造方法，防止被实例化
	 */
	private ThreadSafetySingleton(){
		
	}
	
	/**
	 * 静态工程方法，创建实例
	 * @return
	 */
	public static ThreadSafetySingleton getInstance(){
		if(null == instance){
			synchronized(instance){
				if(null == instance){
					instance = new ThreadSafetySingleton();
				}
			}
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
