/**<p>��Ŀ����</p>
 * <p>������	���󹤳�ģʽ</p>
 * <p>�ļ�����HumanEnum.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��21��-����11:36:15</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ���󹤳�ģʽ;

/**<p>���ƣ�HumanEnum.java</p>
 * <p>������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��21�� ����11:36:15
 * @version 1.0.0
 */
public enum HumanEnum
{
	//�����������������Ͷ��������
	YelloMaleHuman("���󹤳�ģʽ.YellowMaleHuman"),
	YelloFemaleHuman("���󹤳�ģʽ.YellowFemaleHuman"),
	WhiteFemaleHuman("���󹤳�ģʽ.WhiteFemaleHuman"),
	WhiteMaleHuman("���󹤳�ģʽ.WhiteMaleHuman"),
	BlackFemaleHuman("���󹤳�ģʽ.BlackFemaleHuman"),
	BlackMaleHuman("���󹤳�ģʽ.BlackMaleHuman");
	
	private String value = "";
	
	//���幹�캯����Ŀ����Data(value)���͵���ƥ��
	private HumanEnum(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	/*
	 * 
	* java enum���;�����ʹ�ã�������Ҫʹ�ö�̬���̳еȷ���
	* �Ͼ���Clas��ȫ���Դ���enum
	*/
}
