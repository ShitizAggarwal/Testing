package hw;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class shopping;
	
	@SuppressWarnings("unused")
	private static final Object[] paramsforshop () {
		return $(
//				Parameters are: (1,2,3,4,5,6,,8,9,10)
//								1=member, 2=primeStatus, 3=cart, 4=rate
//				Test case 1
				$(true,		true,	5000,	0.950),
//				Test case 2
				$(false,	true,	5000,	0.975),
//				Test case 3
				$(true,		false,	5000,	0.925),
//				Test case 4
				$(false,	false,	5000,	0.965),
//				Test case 5
				$(true,		true,	4999,	0.900),
//				Test case 6
				$(true,		false,	4999,	0.950),
//				Test case 7
				$(false,	true,	4999,	0.955),
//				Test case 8
				$(false,	false,	4999,	0.985),
//				Test case 9
				$(true,		true,	0,	0.900),
//				Test case 10
				$(true,		true,	10000,	0.950)
		);
	}

	@Before
	public void setUp () {
		shopping = new Problem1Class();
	}
	
	@Test
	@Parameters(method="paramsforshop")
	public void test(boolean member, boolean primeStatus, double cart, double rate) 
	{
		
		shopping.calcRate(member, primeStatus, cart);
		assertEquals(rate, shopping.calcRate(member, primeStatus, cart), 0.001);
	}

}