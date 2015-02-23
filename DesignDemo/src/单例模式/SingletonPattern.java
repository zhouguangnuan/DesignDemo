/**<p>项目名：</p>
 * <p>包名：	单例模式</p>
 * <p>文件名：SingletonPattern.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午11:25:01</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 单例模式;

/**<p>名称：SingletonPattern.java</p>
 * <p>描述：通用安全的单例模式</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午11:25:01
 * @version 1.0.0
 */
public class SingletonPattern
{
	private static final SingletonPattern singletonPattern= new SingletonPattern();
	
	//限制住不能直接产生一个实例
	private SingletonPattern(){
	}
	
	public synchronized static SingletonPattern getInstance(){
		return singletonPattern;
	}
}
