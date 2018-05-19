import junit.framework.TestCase;

public class AdditionTest extends TestCase{

	Addition add=new Addition();

	public AdditionTest(String name) {
		super(name);
	}

	public void testSumOfTwoPositiveNumbers() {
		assertEquals(700.00,add.addition(300,400));
		System.out.println("testSumOfTwoPositiveNumbers: "+add.addition(300,400));
	}
	public void testSumOfTwoNegativeNumbers() {
		assertEquals(-700.00,add.addition(-400,-300));
		System.out.println("testSumOfTwoNegativeNumbers: "+add.addition(-400,-300));
	}
	public void testSumOfTwoOnePositiveAndNegativeNumbers() {
		assertEquals(-100.00,add.addition(-400,300));
		System.out.println("testSumOfTwoOnePositiveAndNegativeNumbers: "+add.addition(-400,300));
	}
	public void testSumOfTwoOneBigPositiveAndNegativeNumbers() {
		assertEquals(100.00,add.addition(400,-300));
		System.out.println("testSumOfTwoOneBigPositiveAndNegativeNumbers: "+add.addition(400,-300));
	}
	public void testSumOfTwoOneFloatAndIntegerNumbers() {
		assertEquals(700.50,add.addition(400.50,300));
		System.out.println("testSumOfTwoOneFloatAndIntegerNumbers: "+add.addition(400.50,300));
	}
	public void testSumOfTwoFloatNumbers() {
		assertEquals(700.00,add.addition(400.50,299.50));
		System.out.println("testSumOfTwoFloatNumbers: "+add.addition(400.50,299.50));
	}
}