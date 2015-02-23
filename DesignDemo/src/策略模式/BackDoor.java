/**<p>项目名：</p>
 * <p>包名：	策略模式</p>
 * <p>文件名：BackDoor.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午10:54:37</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 策略模式;

/**<p>名称：BackDoor.java</p>
 * <p>描述：策略</p>
 * <pre>
 *    找乔国老帮忙，使孙权不能杀刘备
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午10:54:37
 * @version 1.0.0
 */
public class BackDoor implements IStrategy
{
	public void operate()
	{
		System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
	}
}
