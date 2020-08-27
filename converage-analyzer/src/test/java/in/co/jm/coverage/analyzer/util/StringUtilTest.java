package in.co.jm.coverage.analyzer.util;

import org.junit.Test;

public class StringUtilTest {

	
	@Test
	public void testIsEmpty() {
		StringUtil.isEmpty("sfsdf");
	}
	
	@Test
	public void testIsNotEmpty() {
		StringUtil.isNotEmpty("sfsdf");
	}
}
