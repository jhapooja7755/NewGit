package pooja;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {

	@Test
	public void show() {
		String a="pooja";
		String b="pooja";
		Assert.assertEquals(a, b);
	}
		@Test(enabled=false)
		public void test() {
			int a=10;
			int b=0;
			System.out.println(a/b);
		
		
	}
	
}
