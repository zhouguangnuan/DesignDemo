/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����ShanZhaiCorp.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����10:33:08</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**
 * <p>
 * ���ƣ�ShanZhaiCorp.java
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
 * @date 2014��7��30�� ����10:33:08
 * @version 1.0.0
 */
public class ShanZhaiCorp extends Corp
{
	// ��ʲô��Ʒ����֪�����ȱ����õĲ�֪��
	public ShanZhaiCorp(Product product)
	{
		super(product);
	}

	// ��׬Ǯ
	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("��׬Ǯѽ...");
	}
}