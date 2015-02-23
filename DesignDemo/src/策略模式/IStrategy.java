/**<p>项目名：</p>
 * <p>包名：	策略模式</p>
 * <p>文件名：IStrategy.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午10:53:07</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 策略模式;

/**<p>名称：IStrategy.java</p>
 * <p>描述：策略接口，这是诸葛亮老人家给赵云的三个锦囊妙计的接口</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午10:53:07
 * @version 1.0.0
 */
public interface IStrategy
{
	//每个锦囊妙计都是一个可执行的算法
	public void operate();
}
