/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����Corp.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����10:11:49</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**
 * <p>
 * ���ƣ�Corp.java
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
 * @date 2014��7��30�� ����10:11:49
 * @version 1.0.0
 */
public abstract class Corp
{
//	/*
//	 * �ǹ�˾��Ӧ���������ѣ��¹���ʲô�����˾��������ҵ��˾ ��ÿ����˾�������Ķ�������һ����������ʵ���������
//	 */
//	protected abstract void produce();
//
//	/*
//	 * �в�Ʒ�ˣ��ǿ϶�Ҫ����ѽ���������㹫˾��ô����
//	 */
//	protected abstract void sell();
//
//	// ��˾�Ǹ�ʲô�ģ�׬Ǯ��ѽ����׬Ǯɵ�ӲŸ�
//	public void makeMoney()
//	{
//		// ÿ����˾����һ����������
//		this.produce();
//		// Ȼ������
//		this.sell();
//	}

	// ����һ����Ʒ���󣬳�����ˣ���֪��������ʲô��Ʒ
	private Product product;

	// ���캯���������ඨ�崫�ݾ���Ĳ�Ʒ����
	public Corp(Product product)
	{
		this.product = product;
	}

	// ��˾�Ǹ�ʲô�ģ�׬Ǯ��ѽ����׬Ǯɵ�ӲŸ�
	public void makeMoney()
	{
		// ÿ����˾����һ����������
		this.product.beProducted();
		// Ȼ������
		this.product.beSelled();
	}
}
