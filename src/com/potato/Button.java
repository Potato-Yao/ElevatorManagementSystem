package com.potato;

import static com.potato.Elevator.FLOOR_MAX;
import static com.potato.Elevator.FLOOR_MIN;

/**
 * @author Potato Yao
 */

public class Button
{
	public boolean isLight = false;  // 指示灯是否发亮，即是否被按下
	int floor;  // TODO 按钮所在楼层数，我觉得这玩意单独写一个类比较好

	/**
	 *
	 * @param isLight 指示灯是否发亮，即是否被按下
	 * @param floor 该按键所在的楼层数
	 */
	public Button(boolean isLight, int floor)
	{
		this.isLight = isLight;
		this.floor = floor;
	}

	public void setLight(boolean isLight)
	{
		this.isLight = isLight;
	}

	public void setFloor(int floor) throws FloorNumberException
	{
		if (floor >= FLOOR_MIN && floor <= FLOOR_MAX)
		{
			this.floor = floor;
		}
		else
		{
			System.out.println("这啥楼层呦");
			throw new FloorNumberException("楼层高度错误");
		}
	}

	public boolean getLight()
	{
		return isLight;
	}

	public int getFloor()
	{
		return floor;
	}
}
