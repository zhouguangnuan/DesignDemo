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
public class HummerH2Model extends HummerModel
{
	private boolean alarmFlag = true; //是否要响喇叭
		
	protected void start()
	{
		System.out.println("悍马H2发动...");
	}

	protected void stop()
	{
		System.out.println("悍马H2停车...");
	}

	protected void alarm()
	{
		System.out.println("悍马H2鸣笛...");
	}

	protected void engineBoom()
	{
		System.out.println("悍马H2引擎声音是这样在...");
	}
	
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	//要不要响喇叭，是有客户的来决定的
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}
}
