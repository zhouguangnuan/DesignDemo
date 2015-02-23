/**<p>项目名：</p>
 * <p>包名：	桥梁模式</p>
 * <p>文件名：Client.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午10:15:42</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 桥梁模式;

import org.junit.Test;

/**<p>名称：Client.java</p>
 * <p>描述：</p>
 * <pre>
 *         
 * </pre>
 * @author 周光暖
 * @date 2014年7月30日 下午10:15:42
 * @version 1.0.0
 */
public class Client
{
	@Test
	public void test1() throws Exception
	{
//		System.out.println("-------房地产公司是这个样子运行的-------");
//		//先找到我的公司
//		HouseCorp houseCorp =new HouseCorp(null);
//		//看我怎么挣钱
//		houseCorp.makeMoney();
//		System.out.println("\n");
//		System.out.println("-------服装公司是这样运行的-------");
//		ClothesCorp clothesCorp = new ClothesCorp();
//		clothesCorp.makeMoney();
	}
	
	@Test
	public void test2() throws Exception
	{
//		System.out.println("-------房地产公司是这个样子运行的-------");
//		//先找到我的公司
//		HouseCorp houseCorp =new HouseCorp();
//		//看我怎么挣钱
//		houseCorp.makeMoney();
//		System.out.println("\n");
//		System.out.println("-------山寨公司是这样运行的-------");
//		IPodCorp iPodCorp = new IPodCorp();
//		iPodCorp.makeMoney();
	}
	
	@Test
	public void test3() throws Exception
	{
		House house = new House();
		System.out.println("-------房地产公司是这个样子运行的-------");
		//先找到我的公司
		HouseCorp houseCorp =new HouseCorp(house);
		//看我怎么挣钱
		houseCorp.makeMoney();
		System.out.println("\n");
		//山寨公司生产的产品很多，不过我只要指定产品就成了
		System.out.println("-------山寨公司是这样运行的-------");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		shanZhaiCorp.makeMoney();
	}
}
