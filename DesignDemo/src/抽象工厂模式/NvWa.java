/**<p>项目名：</p>
 * <p>包名：	抽象工厂模式</p>
 * <p>文件名：NvWa.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月21日-下午11:47:47</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 抽象工厂模式;

/**<p>名称：NvWa.java</p>
 * <p>描述：</p>
 * <pre>
 *    女娲建立起了两条生产线，分别是：男性生产线、女性生产线
 * </pre>
 * @author 周光暖
 * @date 2014年7月21日 下午11:47:47
 * @version 1.0.0
 */
public class NvWa
{
	public static void main(String[] args) {
		//第一条生产线，男性生产线
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		
		//第二条生产线，女性生产线
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		
		//生产线建立完毕，开始生产人了:
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		maleYellowHuman.cry();
		maleYellowHuman.laugh();
		femaleYellowHuman.sex();
		
		femaleYellowHuman.cry();
		femaleYellowHuman.laugh();
		femaleYellowHuman.sex();
		/*
		* .....
		* 后面你可以续了
		*/
	}
}
