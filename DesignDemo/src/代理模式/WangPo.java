/**<p>��Ŀ����</p>
 * <p>������	����ģʽ</p>
 * <p>�ļ�����WangPo.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��20��-����11:12:04</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ����ģʽ;

/**<p>���ƣ�WangPo.java</p>
 * <p>����������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��20�� ����11:12:04
 * @version 1.0.0
 */
public class WangPo
{
	private KindWomen kindWomen;
	
	public WangPo(){ //Ĭ�ϵĻ������˽����Ĵ���
		this.kindWomen = new PanJinLian();
	}
	
	//��������KindWomen���κ�һ��Ů�˵Ĵ���ֻҪ������һ����
	public WangPo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}
	
	public void happyWithMan() {
		this.kindWomen.happyWithMan(); //�Լ����ˣ��ɲ��ˣ�����������Ĵ���
	}
	
	public void makeEyesWithMan() {
		this.kindWomen.makeEyesWithMan(); //������ô�������ˣ�˭���������ۣ���
	}
}
