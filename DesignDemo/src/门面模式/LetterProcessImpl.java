/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����LetterProcessImpl.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��22��-����12:12:59</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�LetterProcessImpl.java</p>
 * <p>������д�ŵľ���ʵ��</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��22�� ����12:12:59
 * @version 1.0.0
 */
public class LetterProcessImpl implements LetterProcess
{

	public void writeContext(String context)
	{
		System.out.println("��д�ŵ�����...." + context);
	}

	public void fillEnvelope(String address)
	{
		System.out.println("��д�ռ��˵�ַ������...." + address);
	}

	public void letterInotoEnvelope()
	{
		System.out.println("���ŷŵ��ŷ���....");
	}

	public void sendLetter()
	{
		System.out.println("�ʵ��ż�...");
	}

}
