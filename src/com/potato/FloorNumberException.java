package com.potato;

/**
 * @author Potato Yao
 */

public class FloorNumberException extends Exception
{
	/**
	 * 楼层高度错误，可能是太高也可能是太低
	 * @param massage 错误报告
	 */
	FloorNumberException(String massage)
	{
		super(massage);
	}

	/**
	 * 无参方法
	 */
	FloorNumberException() {}
}
