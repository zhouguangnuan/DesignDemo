/**<p>项目名：</p>
 * <p>包名：	策略模式</p>
 * <p>文件名：ZhaoYun.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月20日-下午11:00:25</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 策略模式;

/**<p>名称：ZhaoYun.java</p>
 * <p>描述：趙雲</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月20日 下午11:00:25
 * @version 1.0.0
 */
public class ZhaoYun
{
	public static void main(String[] args)
	{
		Context context;
		
		//刚刚到吴国的时候拆第一个
		System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
		context = new Context(new BackDoor()); //拿到妙计
		context.operate(); //拆开执行
		System.out.println("\n\n\n\n\n\n\n\n");
		//刘备乐不思蜀了，拆第二个了
		System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
		context = new Context(new GivenGreenLight());
		context.operate(); //执行了第二个锦囊了
		System.out.println("\n\n\n\n\n\n\n\n");
		//孙权的小兵追了，咋办？拆第三个
		System.out.println("-----------孙权的小兵追了，咋办？拆第三个-------------");
		context = new Context(new BlockEnemy());
		context.operate(); //孙夫人退兵
		System.out.println("\n\n\n\n\n\n\n\n");
		
		/*
		*问题来了：赵云实际不知道是那个策略呀，他只知道拆第一个锦囊，
		*而不知道是BackDoor这个妙计，咋办？ 似乎这个策略模式已经把计谋名称写出来了
		*
		* 错！BackDoor、GivenGreenLight、BlockEnemy只是一个代码，你写成first、second、
		third，没人会说你错!
		*
		* 策略模式的好处就是：体现了高内聚低耦合的特性呀，缺点嘛，这个那个，我回去再查查
		*/
	}
}
