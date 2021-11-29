package package1;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberPosition {

	private int findNumAtK(int n,int k) {
		ArrayList<Integer> olist = new ArrayList<>();
		ArrayList<Integer> elist = new ArrayList<>();
		olist.add(1);
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				elist.add(i);
			}
			else
			{
				olist.add(i);
			}
		}
		olist.addAll(elist);
		System.out.println(olist);
		int result = olist.get(k-1);
		return result;
	}

	@Test
	public void testCase1()
	{
		Assert.assertEquals(findNumAtK(7, 4), 7);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findNumAtK(5, 3), 5);
	}
}
