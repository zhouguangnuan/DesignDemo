/**<p>��Ŀ����</p>
 * <p>������	���󹤳�ģʽ</p>
 * <p>�ļ�����NvWa.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��21��-����11:47:47</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ���󹤳�ģʽ;

/**<p>���ƣ�NvWa.java</p>
 * <p>������</p>
 * <pre>
 *    Ů洽����������������ߣ��ֱ��ǣ����������ߡ�Ů��������
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��21�� ����11:47:47
 * @version 1.0.0
 */
public class NvWa
{
	public static void main(String[] args) {
		//��һ�������ߣ�����������
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		
		//�ڶ��������ߣ�Ů��������
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		
		//�����߽�����ϣ���ʼ��������:
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		maleYellowHuman.cry();
		maleYellowHuman.laugh();
		femaleYellowHuman.sex();
		
		femaleYellowHuman.cry();
		femaleYellowHuman.laugh();
		femaleYellowHuman.sex();
		/*
		* .....
		* �������������
		*/
	}
}
