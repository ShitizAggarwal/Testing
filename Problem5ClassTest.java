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
public class Problem5ClassTest {

	private Problem5Class graph;
	
	@Before
	public void setUp () {
		graph = new Problem5Class();
	}
	
	@Test
	@FileParameters("src/hw/Problem5.csv")	
	public void test(int testcaseNumber, double x, double y, String bpNumber) {		
		graph.setY(y);
		graph.calcY(x);
		assertEquals(y,graph.getY(),0.001);
		
		
}
}