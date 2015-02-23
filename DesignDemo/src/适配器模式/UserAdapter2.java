package 适配器模式;

import java.util.Map;

/**
 * <p>名称：OuterUserInfo.java</p>
 * <p>描述：适配器类（对象适配器模式）</p>
 *
 * @author 周光暖
 * @date 2014年7月17日 下午5:22:33
 * @version 1.0.0
 */
public class UserAdapter2 implements IUserInfo {

	private Map<String, String> baseInfo;
	private Map<String, String> homeInfo;
	private Map<String, String> officeInfo;

	public UserAdapter2()
	{
		OuterUser outerUser = new OuterUser();
		baseInfo = outerUser.getUserBaseInfo();    
		homeInfo = outerUser.getUserHomeInfo();    
		officeInfo = outerUser.getUserOfficeInfo();
	}
	
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
