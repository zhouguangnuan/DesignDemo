/**<p>项目名：</p>
 * <p>包名：	模板方法模式</p>
 * <p>文件名：HummerH1Mode.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月22日-上午12:33:53</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 模板方法模式;

/**<p>名称：HummerH1Mode.java</p>
 * <p>描述：</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月22日 上午12:33:53
 * @version 1.0.0
 */
public class HummerH1Model extends HummerModel
{
	protected void start()
	{
		System.out.println("悍马H1发动...");
	}

	protected void stop()
	{
		System.out.println("悍马H1停车...");
	}

	protected void alarm()
	{
		System.out.println("悍马H1鸣笛...");
	}

	protected void engineBoom()
	{
		System.out.println("悍马H1引擎声音是这样在...");
	}
	
	protected boolean isAlarm() {
		return false;
	}
}
