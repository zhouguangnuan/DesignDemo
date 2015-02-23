/**<p>项目名：</p>
 * <p>包名：	工厂方法模式</p>
 * <p>文件名：YellowHuman.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午11:40:47</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 工厂方法模式;

/**<p>名称：YellowHuman.java</p>
 * <p>描述：黄种人</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午11:40:47
 * @version 1.0.0
 */
public class YellowHuman implements Human
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
