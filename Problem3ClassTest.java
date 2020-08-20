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
public class Problem3ClassTest {

	private Problem3Class light;
	
	@Before
	public void setUp () {
		light = new Problem3Class();
	}
	
	@Test
	@FileParameters("src/hw/Problem3.csv")	
	public void test(int testcaseNumber, double distance, int count, 
			boolean greenLight, boolean yellowLight, boolean redLight, 
			boolean buzzer, boolean brakes, int count2, String bpNumber) {		
		light.setCount(count);
		light.setYellowLight(yellowLight);
		light.setGreenLight(greenLight);
		light.setRedLight(redLight);
		light.setBrakes(brakes);
		light.setBuzzer(buzzer);
		light.setWarnings(distance);
		assertEquals(greenLight,light.isGreenLight());
		assertEquals(yellowLight,light.isYellowLight());
		assertEquals(redLight,light.isRedLight());
		assertEquals(buzzer,light.isBuzzer());
		assertEquals(brakes,light.isBrakes());
		assertEquals(count2,light.getCount());
	}
}