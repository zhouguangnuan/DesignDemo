package ������ģʽ;
import java.util.HashMap;
import java.util.Map;

import sun.net.www.protocol.ftp.Handler;
import ������ģʽ.Constant;
import ������ģʽ.IOuterUser;


public class OuterUser implements IOuterUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put(Constant.UserBaseInfo.USER_NAME, "Ա���������ܹ�ů-�ⲿ");
		baseInfoMap.put(Constant.UserBaseInfo.MOBILE_NUBER, "Ա���ֻ����룺15669108193-�ⲿ");
		return baseInfoMap;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put(Constant.UserOfficeInfo.JOB_POSITION, "Ա����λ�������ܼ�-�ⲿ");
		baseInfoMap.put(Constant.UserOfficeInfo.OFFICE_TEL_NUMBER, "Ա���칫�ҵ绰��110-�ⲿ");
		return baseInfoMap;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put(Constant.UserHomeInfo.HOME_ADDRESS, "Ա����ͥסַ������-�ⲿ");
		baseInfoMap.put(Constant.UserHomeInfo.HOME_TEL_NUMBER, "Ա����ͥ�绰��64382136-�ⲿ");
		return baseInfoMap;
	}

}
