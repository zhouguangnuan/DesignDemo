/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����Client.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��30��-����10:15:42</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

import org.junit.Test;

/**<p>���ƣ�Client.java</p>
 * <p>������</p>
 * <pre>
 *         
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��30�� ����10:15:42
 * @version 1.0.0
 */
public class Client
{
	@Test
	public void test1() throws Exception
	{
//		System.out.println("-------���ز���˾������������е�-------");
//		//���ҵ��ҵĹ�˾
//		HouseCorp houseCorp =new HouseCorp(null);
//		//������ô��Ǯ
//		houseCorp.makeMoney();
//		System.out.println("\n");
//		System.out.println("-------��װ��˾���������е�-------");
//		ClothesCorp clothesCorp = new ClothesCorp();
//		clothesCorp.makeMoney();
	}
	
	@Test
	public void test2() throws Exception
	{
//		System.out.println("-------���ز���˾������������е�-------");
//		//���ҵ��ҵĹ�˾
//		HouseCorp houseCorp =new HouseCorp();
//		//������ô��Ǯ
//		houseCorp.makeMoney();
//		System.out.println("\n");
//		System.out.println("-------ɽկ��˾���������е�-------");
//		IPodCorp iPodCorp = new IPodCorp();
//		iPodCorp.makeMoney();
	}
	
	@Test
	public void test3() throws Exception
	{
		House house = new House();
		System.out.println("-------���ز���˾������������е�-------");
		//���ҵ��ҵĹ�˾
		HouseCorp houseCorp =new HouseCorp(house);
		//������ô��Ǯ
		houseCorp.makeMoney();
		System.out.println("\n");
		//ɽկ��˾�����Ĳ�Ʒ�ܶ࣬������ֻҪָ����Ʒ�ͳ���
		System.out.println("-------ɽկ��˾���������е�-------");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		shanZhaiCorp.makeMoney();
	}
}
