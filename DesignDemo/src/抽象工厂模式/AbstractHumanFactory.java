/**<p>��Ŀ����</p>
 * <p>������	���󹤳�ģʽ</p>
 * <p>�ļ�����AbstractHumanFactory.java</p>
 * <p>�汾��Ϣ��</p>
 * <p>���ڣ�2014��7��21��-����11:39:15</p>
 * Copyright (c) 2014singno��˾-��Ȩ����
 */
package ���󹤳�ģʽ;

/**<p>���ƣ�AbstractHumanFactory.java</p>
 * <p>������</p>
 * <pre>
 *    
 * </pre>
 * @author �ܹ�ů
 * @date 2014��7��21�� ����11:39:15
 * @version 1.0.0
 */
public abstract class AbstractHumanFactory implements HumanFactory
{
	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		//������ݽ�������һ��Enum�о����һ��Element�Ļ����򲻴���
		if (!humanEnum.getValue().equals("")) {
			try {
				//ֱ�Ӳ���һ��ʵ��
				human = (Human)
				Class.forName(humanEnum.getValue()).newInstance();
			} 
			catch (Exception e) {
				//��Ϊʹ����enum��������쳣�����������ˣ��������enum�����⣻
				e.printStackTrace();
			}
		}
		return human;
	}
}
