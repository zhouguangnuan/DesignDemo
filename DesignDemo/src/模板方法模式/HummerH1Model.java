/**<p>��Ŀ����</p>
 * <p>������	ģ�巽��ģʽ</p>
 * <p>�ļ�����HummerH1Mode.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��22��-����12:33:53</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ģ�巽��ģʽ;

/**<p>���ƣ�HummerH1Mode.java</p>
 * <p>������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��22�� ����12:33:53
 * @version 1.0.0
 */
public class HummerH1Model extends HummerModel
{
	protected void start()
	{
		System.out.println("����H1����...");
	}

	protected void stop()
	{
		System.out.println("����H1ͣ��...");
	}

	protected void alarm()
	{
		System.out.println("����H1����...");
	}

	protected void engineBoom()
	{
		System.out.println("����H1����������������...");
	}
	
	protected boolean isAlarm() {
		return false;
	}
}
