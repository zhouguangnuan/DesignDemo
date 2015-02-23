/**<p>项目名：</p>
 * <p>包名：	策略模式</p>
 * <p>文件名：BlockEnemy.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午10:57:13</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 策略模式;

/**<p>名称：BlockEnemy.java</p>
 * <p>描述：策略</p>
 * <pre>
 *    孙夫人断后，挡住追兵
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午10:57:13
 * @version 1.0.0
 */
public class BlockEnemy implements IStrategy
{
	@Override
	public void operate()
	{
		System.out.println("孙夫人断后，挡住追兵");
	}
}
