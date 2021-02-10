package com.potato;

/**
 * @author Potato Yao
 */

public class Elevator
{
	int id;  // 电梯名
	int floor;  // 所在层数

	final int FLOOR_MIN = -2;  //  最低层数
	final int FLOOR_MAX = 1000;  // 最高层数

	final int SPEED = 2;  // 电梯运行速度，单位m/s

	/**
	 *
	 * @param id 电梯名
	 * @param floor 所在层数
	 */
	public Elevator(int id, int floor)
	{
		this.id = id;
		this.floor = floor;
	}

	/**
	 * 要将电梯转移到某层
	 * @param endFloor 要转到的楼层
	 */
	public void moveTo(int endFloor)
	{
		if (endFloor >= FLOOR_MIN && endFloor <= FLOOR_MAX)
		{
			this.floor = endFloor;
		}
	}

	/**
	 * 要将电梯升起或下降几层
	 * @param forFloor 层数，如果为正则向上，为负则向下
	 */
	public void moveFor(int forFloor)
	{

	}
}
