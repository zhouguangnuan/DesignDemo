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
public class IPodCorp extends Corp
{
	
	/**������
	 * <pre></pre>
	 * @param product
	 */
	public IPodCorp(Product product)
	{
		super(product);
		// TODO Auto-generated constructor stub
	}

	// �ҿ�ʼ����iPod��
	protected void produce()
	{
		System.out.println("������iPod...");
	}

	// ɽկ��iPod�ܳ���������ѽ
	protected void sell()
	{
		System.out.println("iPod����...");
	}

	// ��׬Ǯ
	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("��׬Ǯѽ...");
	}
}
