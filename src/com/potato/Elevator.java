package com.potato;

/**
 * @author Potato Yao
 */

public class Elevator
{
	static int id = 0;  // 电梯名
	int floor;  // 所在层数

	static final int FLOOR_MIN = -2;  //  最低层数
	static final int FLOOR_MAX = 1000;  // 最高层数

	final int SPEED = 2;  // 电梯运行速度，单位m/s

	/**
	 *
	 * @param id 电梯名
	 * @param floor 所在层数
	 */
	public Elevator(int id, int floor)
	{
		this.floor = floor;
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

	public int getId()
	{
		return id;
	}

	public int getFloor()
	{
		return floor;
	}

	/**
	 * 要将电梯转移到某层
	 * @param endFloor 要转到的楼层
	 */
	public void moveTo(int endFloor)
	{
		try
		{
			setFloor(endFloor);
		} catch (FloorNumberException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * 要将电梯升起或下降几层
	 * @param forFloor 层数，如果为正则向上，为负则向下
	 */
	public void moveFor(int forFloor)
	{
		int beforeFloor = this.floor;
		int afterFloor = beforeFloor + forFloor;
		moveTo(afterFloor);
	}

	/**
	 * 比较方便的上移一层
	 */
	public void up()
	{
		try
		{
			setFloor(floor + 1);
		} catch (FloorNumberException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * 比较方便的下移一层
	 */
	public void down()
	{
		try
		{
			setFloor(floor - 1);
		} catch (FloorNumberException e)
		{
			e.printStackTrace();
		}
	}

	public String massagePrinter()
	{
		return "No." + getId() + " elevator is on the floor " + getFloor();
	}
}
