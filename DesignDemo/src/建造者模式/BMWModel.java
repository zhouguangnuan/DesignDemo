/**<p>��Ŀ����</p>
 * <p>������	������ģʽ</p>
 * <p>�ļ�����BMWModel.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����9:39:16</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ������ģʽ;

/**
 * <p>
 * ���ƣ�BMWModel.java
 * </p>
 * <p>
 * ������
 * </p>
 * 
 * <pre>
 * 
 * </pre>
 * 
 * @author �ܹ�ů
 * @date 2014��7��30�� ����9:39:16
 * @version 1.0.0
 */
public class BMWModel extends CarModel
{
	@Override
	protected void alarm()
	{
		System.out.println("����������������������ӵ�...");
	}

	@Override
	protected void engineBoom()
	{
		System.out.println("���������������������...");
	}

	@Override
	protected void start()
	{
		System.out.println("������������������ӵ�...");
	}
	
	protected void stop()
	{
		System.out.println("����Ӧ������ͣ��...");
	}
}
