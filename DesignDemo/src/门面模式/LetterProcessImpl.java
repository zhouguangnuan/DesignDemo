/**<p>项目名：</p>
 * <p>包名：	门面模式</p>
 * <p>文件名：LetterProcessImpl.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月22日-上午12:12:59</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 门面模式;

/**<p>名称：LetterProcessImpl.java</p>
 * <p>描述：写信的具体实现</p>
 * <pre>
 *    
 * </pre>
 * @author 周光暖
 * @date 2014年7月22日 上午12:12:59
 * @version 1.0.0
 */
public class LetterProcessImpl implements LetterProcess
{

	public void writeContext(String context)
	{
		System.out.println("填写信的内容...." + context);
	}

	public void fillEnvelope(String address)
	{
		System.out.println("填写收件人地址及姓名...." + address);
	}

	public void letterInotoEnvelope()
	{
		System.out.println("把信放到信封中....");
	}

	public void sendLetter()
	{
		System.out.println("邮递信件...");
	}

}
