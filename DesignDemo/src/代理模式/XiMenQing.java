/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����XiMenQing.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:13:46</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

import static org.junit.Assert.*;

import org.junit.Test;

/**<p>���ƣ�XiMenQing.java</p>
 * <p>������������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:13:46
 * @version 1.0.0
 */
public class XiMenQing
{
	public static void main(String[] args)
	{
		//�����Žг���
		WangPo wangPo = new WangPo();
		//Ȼ���������˵����Ҫ���˽���happy��Ȼ�����žͰ����������춪���ӵ��ǳ�Ϸ:
		wangPo.makeEyesWithMan(); //����û����Ȼ������ʱ����������ʵ����ˬ�����˽���
		wangPo.happyWithMan(); 
	}
	
	@Test
	public void testName() throws Exception
	{
		//�ı�һ����ʷ�����ϱ������카�ߣ�
		JiaShi jiaShi = new JiaShi();
		WangPo wangPo = new WangPo(jiaShi); //��������Ϊ���ϵĴ�����
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
	}
}
