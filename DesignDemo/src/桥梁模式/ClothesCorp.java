/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����ClothesCorp.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����10:14:40</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**
 * <p>
 * ���ƣ�ClothesCorp.java
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
 * @date 2014��7��30�� ����10:14:40
 * @version 1.0.0
 */
public class ClothesCorp extends Corp
{
	
	/**������
	 * <pre></pre>
	 * @param product
	 */
	public ClothesCorp(Product product)
	{
		super(product);
	}

	// ��װ��˾�����ľ����·���
	protected void produce()
	{
		System.out.println("��װ��˾�����·�...");
	}

	// ��װ��˾���װ����ֻ����װ�������·���ģ��
	protected void sell()
	{
		System.out.println("��װ��˾�����·�...");
	}

	// ��װ��˾������������ô˵Ҳ��׬Ǯ��ҵҲ
	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("��װ��˾׬СǮ...");
	}
	
	
}
