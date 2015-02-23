/**<p>项目名：</p>
 * <p>包名：	模板方法模式</p>
 * <p>文件名：Client.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月22日-上午12:38:57</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 模板方法模式;

import static org.junit.Assert.*;

import org.junit.Test;

/**<p>名称：Client.java</p>
 * <p>描述：</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月22日 上午12:38:57
 * @version 1.0.0
 */
public class Client
{
	public static void main(String[] args)
	{
		//客户开着H1型号，出去遛弯了
		HummerModel h1 = new HummerH1Model();
		h1.run(); //汽车跑起来了；
//		//客户开H2型号，出去玩耍了
//		HummerModel h2 = new HummerH2Model();
//		h2.run();
	}
	
	@Test
	public void testName() throws Exception
	{
		//客户开着H1型号，出去遛弯了
		HummerH2Model h2 = new HummerH2Model();
		h2.setAlarm(true);
		h2.run(); //汽车跑起来了；
	}
}
