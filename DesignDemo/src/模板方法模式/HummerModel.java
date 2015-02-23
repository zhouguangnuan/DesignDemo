/**<p>项目名：</p>
 * <p>包名：	模板方法模式</p>
 * <p>文件名：HummerModel.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月22日-上午12:33:14</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 模板方法模式;

/**<p>名称：HummerModel.java</p>
 * <p>描述：</p>
 * <pre>
 * 	     模板方法模式：在模板方法中按照一个的规则和顺序调用基本方法
 *    模板方法是通过汇总或排序基本方法而产生的结果集
 * 
 *    基本方法：子类必须实现的，而且方法的修改对应了不同的类
 *    具体方法：在抽象类中实现了的基本方法
 *    抽象方法：在抽象类中没有实现，在子类中实现了的方法；
 *    钩子方法：
 * </pre>
 * @author 周光暖
 * @date 2014年7月22日 上午12:33:14
 * @version 1.0.0
 */
public abstract class HummerModel
{
	/*
	* 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
	* 是要能够发动起来，那这个实现要在实现类里了
	*/
	protected abstract void start();
	
	//能发动，那还要能停下来，那才是真本事
	protected abstract void stop();
	
	//喇叭会出声音，是滴滴叫，还是哔哔叫
	protected abstract void alarm();
	
	//引擎会轰隆隆的响，不响那是假的
	protected abstract void engineBoom();
	
	//那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
	final public void run(){
		//先发动汽车
		this.start();
		//引擎开始轰鸣
		this.engineBoom();
		//喇嘛想让它响就响，不想让它响就不响
		if(this.isAlarm()){
			this.alarm();
		}
		//到达目的地就停车
		this.stop();
	}
	
	//钩子方法，默认喇叭是会响的
	protected boolean isAlarm(){
		return true;
	}
}
