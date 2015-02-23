/**<p>项目名：</p>
 * <p>包名：	桥梁模式</p>
 * <p>文件名：Corp.java</p>
 * <p>版本信息：</p>
 * <p>日期：2014年7月30日-下午10:11:49</p>
 * Copyright (c) 2014singno公司-版权所有
 */
package 桥梁模式;

/**
 * <p>
 * 名称：Corp.java
 * </p>
 * <p>
 * 描述：
 * </p>
 * 
 * <pre>
 * 
 * </pre>
 * 
 * @author 周光暖
 * @date 2014年7月30日 下午10:11:49
 * @version 1.0.0
 */
public abstract class Corp
{
//	/*
//	 * 是公司就应该有生产把，甭管是什么软件公司还是制造业公司 那每个公司的生产的东西都不一样，所以由实现类来完成
//	 */
//	protected abstract void produce();
//
//	/*
//	 * 有产品了，那肯定要销售呀，不销售你公司怎么生存
//	 */
//	protected abstract void sell();
//
//	// 公司是干什么的？赚钱的呀，不赚钱傻子才干
//	public void makeMoney()
//	{
//		// 每个公司都是一样，先生产
//		this.produce();
//		// 然后销售
//		this.sell();
//	}

	// 定义一个产品对象，抽象的了，不知道具体是什么产品
	private Product product;

	// 构造函数，由子类定义传递具体的产品进来
	public Corp(Product product)
	{
		this.product = product;
	}

	// 公司是干什么的？赚钱的呀，不赚钱傻子才干
	public void makeMoney()
	{
		// 每个公司都是一样，先生产
		this.product.beProducted();
		// 然后销售
		this.product.beSelled();
	}
}
