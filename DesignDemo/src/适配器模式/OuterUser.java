package 适配器模式;
import java.util.HashMap;
import java.util.Map;

import sun.net.www.protocol.ftp.Handler;
import 适配器模式.Constant;
import 适配器模式.IOuterUser;


public class OuterUser implements IOuterUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put(Constant.UserBaseInfo.USER_NAME, "员工姓名：周光暖-外部");
		baseInfoMap.put(Constant.UserBaseInfo.MOBILE_NUBER, "员工手机号码：15669108193-外部");
		return baseInfoMap;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put(Constant.UserOfficeInfo.JOB_POSITION, "员工岗位：技术总监-外部");
		baseInfoMap.put(Constant.UserOfficeInfo.OFFICE_TEL_NUMBER, "员工办公室电话：110-外部");
		return baseInfoMap;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put(Constant.UserHomeInfo.HOME_ADDRESS, "员工家庭住址：宁波-外部");
		baseInfoMap.put(Constant.UserHomeInfo.HOME_TEL_NUMBER, "员工家庭电话：64382136-外部");
		return baseInfoMap;
	}

}
