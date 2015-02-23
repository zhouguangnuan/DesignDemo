/**<p>项目名：</p>
 * <p>包名：	策略模式</p>
 * <p>文件名：Context.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午10:58:06</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 策略模式;

/**<p>名称：Context.java</p>
 * <p>描述：锦囊</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午10:58:06
 * @version 1.0.0
 */
public class Context
{
	//构造函数，你要使用那个妙计
	private IStrategy straegy;
	
	public Context(IStrategy strategy){
		this.straegy = strategy;
	}
	
	//使用计谋了，看我出招了
	public void operate(){
		this.straegy.operate();
	}
}
