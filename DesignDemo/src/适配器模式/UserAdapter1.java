package ������ģʽ;

import java.util.Map;

/**
 * <p>���ƣ�OuterUserInfo.java</p>
 * <p>�������������ࣨ��������ģʽ��</p>
 *
 * @author �ܹ�ů
 * @date 2014��7��17�� ����5:22:33
 * @version 1.0.0
 */
public class UserAdapter1 extends OuterUser implements IUserInfo {

	private Map<String, String> baseInfo = super.getUserBaseInfo();
	private Map<String, String> homeInfo = super.getUserHomeInfo();
	private Map<String, String> officeInfo = super.getUserOfficeInfo();
	
	@Override
	public String getUserName() {
		String userName = this.baseInfo.get(Constant.UserBaseInfo.USER_NAME);
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = this.homeInfo.get(Constant.UserHomeInfo.HOME_ADDRESS);
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String mobileNumber = this.baseInfo.get(Constant.UserBaseInfo.MOBILE_NUBER);
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = this.officeInfo.get(Constant.UserOfficeInfo.JOB_POSITION);
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = this.homeInfo.get(Constant.UserHomeInfo.HOME_TEL_NUMBER);
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
