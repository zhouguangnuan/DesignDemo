/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����HouseCorp.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����10:12:58</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**
 * <p>
 * ���ƣ�HouseCorp.java
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
 * @date 2014��7��30�� ����10:12:58
 * @version 1.0.0
 */
public class HouseCorp extends Corp
{
	// ���ز���˾���ǸǷ���
	protected void produce()
	{
		System.out.println("���ز���˾�Ƿ���...");
	}

	// ���ز������ӣ��Լ�ס�ǿɲ�׬Ǯ
	protected void sell()
	{
		System.out.println("���ز���˾���۷���...");
	}

	// ���ز���˾��High�ˣ�׬Ǯ����������
	public void makeMoney()
	{
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}

	// ���崫��һ��House��Ʒ����
	public HouseCorp(House house)
	{
		super(house);
	}

}
