/**<p>��Ŀ����</p>
 * <p>������	���󹤳�ģʽ</p>
 * <p>�ļ�����MaleHumanFactory.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��21��-����11:42:38</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ���󹤳�ģʽ;

/**<p>���ƣ�MaleHumanFactory.java</p>
 * <p>������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��21�� ����11:42:38
 * @version 1.0.0
 */
public class FemaleHumanFactory extends AbstractHumanFactory
{
	public Human createYellowHuman()
	{
		return super.createHuman(HumanEnum.YelloFemaleHuman);
	}

	public Human createWhiteHuman()
	{
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}

	public Human createBlackHuman()
	{
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}
}
