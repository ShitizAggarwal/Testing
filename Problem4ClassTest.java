package hw;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	private Problem4Class bonus;
	
	@Before
	public void setUp () {
		bonus = new Problem4Class();
	}
	
	@Test
	@FileParameters("src/hw/Problem4.csv")	
	public void test(int testcaseNumber, double cart, boolean firstTimeBuyer, 
			boolean goldStatus, int bonusPoints, double taxRate, double total, 
			boolean memberBonus, String bpNumber) {		
//		bonus.setTotal(total);
		bonus.setMemberBonus(memberBonus);
		bonus.determineMemberBonus(cart,firstTimeBuyer,goldStatus,bonusPoints,taxRate);
		assertEquals(total,bonus.getTotal(),0.01);
		assertEquals(memberBonus,bonus.isMemberBonus());
		
}
}