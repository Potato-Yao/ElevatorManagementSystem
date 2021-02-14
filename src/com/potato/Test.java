package com.potato;

/**
 * @author Potato Yao
 */

public class Test
{
	public static void main(String[] args)
	{
		var e1 = new Elevator(Elevator.id++, 1);
		var e2 = new Elevator(Elevator.id++, 1);

		var b = new Button(false, 1);
	}
}
