/**<p>��Ŀ����</p>
 * <p>������	���󹤳�ģʽ</p>
 * <p>�ļ�����AbstractYellowHuman.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��21��-����11:28:58</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ���󹤳�ģʽ;

/**<p>���ƣ�AbstractYellowHuman.java</p>
 * <p>������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��21�� ����11:28:58
 * @version 1.0.0
 */
public abstract class AbstractWhiteHuman implements Human
{

	public void laugh()
	{
		System.out.println("��ɫ���ֻ��Ц���Ҹ�ѽ��");
	}

	public void cry()
	{
		System.out.println("��ɫ���ֻ��");
	}

	public void talk()
	{
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ֽ�");
	}
}
