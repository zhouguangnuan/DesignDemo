/**<p>项目名：</p>
 * <p>包名：	策略模式</p>
 * <p>文件名：GivenGreenLight.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午10:56:09</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 策略模式;

/**<p>名称：GivenGreenLight.java</p>
 * <p>描述：策略</p>
 * <pre>
 *    求吴国太开个绿灯
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午10:56:09
 * @version 1.0.0
 */
public class GivenGreenLight implements IStrategy
{
	public void operate()
	{
		System.out.println("求吴国太开个绿灯,放行！");
	}
}
