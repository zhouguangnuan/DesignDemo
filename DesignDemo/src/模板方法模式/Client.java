/**<p>��Ŀ����</p>
 * <p>������	ģ�巽��ģʽ</p>
 * <p>�ļ�����Client.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��22��-����12:38:57</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ģ�巽��ģʽ;

import static org.junit.Assert.*;

import org.junit.Test;

/**<p>���ƣ�Client.java</p>
 * <p>������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��22�� ����12:38:57
 * @version 1.0.0
 */
public class Client
{
	public static void main(String[] args)
	{
		//�ͻ�����H1�ͺţ���ȥ������
		HummerModel h1 = new HummerH1Model();
		h1.run(); //�����������ˣ�
//		//�ͻ���H2�ͺţ���ȥ��ˣ��
//		HummerModel h2 = new HummerH2Model();
//		h2.run();
	}
	
	@Test
	public void testName() throws Exception
	{
		//�ͻ�����H1�ͺţ���ȥ������
		HummerH2Model h2 = new HummerH2Model();
		h2.setAlarm(true);
		h2.run(); //�����������ˣ�
	}
}
