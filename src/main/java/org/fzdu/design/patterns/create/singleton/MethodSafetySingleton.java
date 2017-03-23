package org.fzdu.design.patterns.create.singleton;

/**
 * synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降
 * 因为每次调用getInstance()方法，都要对对象上锁，事实上，只有在第一次
 * 创建对象的时候需要上锁，之后就不需要了
 * @author Administrator
 *
 */
public class MethodSafetySingleton {
	
	/**
	 * 持有私有静态实例，防止被引用，此处复制为null，目的是实现延迟加载
	 */
	private static MethodSafetySingleton instance = null;
	
	/**
	 * 私有构造方法，防止被实例化
	 */
	private MethodSafetySingleton(){
		
	}
	
	/**
	 * 静态工程方法，创建实例
	 * @return
	 */
	public static synchronized MethodSafetySingleton getInstance(){
		if(null == instance){
			instance = new MethodSafetySingleton();
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
