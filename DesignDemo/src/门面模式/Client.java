/**<p>项目名：</p>
 * <p>包名：	门面模式</p>
 * <p>文件名：Client.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月22日-上午12:14:13</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 门面模式;

import org.junit.Test;

/**<p>名称：Client.java</p>
 * <p>描述：我开始给朋友写信了</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月22日 上午12:14:13
 * @version 1.0.0
 */
public class Client
{
	public static void main(String[] args)
	{
		//创建一个处理信件的过程
		LetterProcess letterProcess = new LetterProcessImpl();
		//开始写信
		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to....");
		//开始写信封
		letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
		//把信放到信封里，并封装好
		letterProcess.letterInotoEnvelope();
		//跑到邮局把信塞到邮箱，投递
		letterProcess.sendLetter();
	}
	
	@Test
	public void test() {
		//你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
		String address = "Happy Road No. 666,God Province,Heaven"; //定义一个地址
		String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
		ModenPostOffice.sendLetter(context, address);
	}
}
