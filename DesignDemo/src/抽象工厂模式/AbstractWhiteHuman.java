/**<p>项目名：</p>
 * <p>包名：	抽象工厂模式</p>
 * <p>文件名：AbstractYellowHuman.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月21日-下午11:28:58</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 抽象工厂模式;

/**<p>名称：AbstractYellowHuman.java</p>
 * <p>描述：</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月21日 下午11:28:58
 * @version 1.0.0
 */
public abstract class AbstractWhiteHuman implements Human
{

	public void laugh()
	{
		System.out.println("黄色人种会大笑，幸福呀！");
	}

	public void cry()
	{
		System.out.println("黄色人种会哭");
	}

	public void talk()
	{
		System.out.println("黄色人种会说话，一般说的都是双字节");
	}
}
