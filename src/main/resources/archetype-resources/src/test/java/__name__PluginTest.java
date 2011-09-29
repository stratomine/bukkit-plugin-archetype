package ${package};

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ${name}PluginTest extends TestCase {
	
	public ${name}PluginTest(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		return new TestSuite(${name}PluginTest.class);
	}
	
	public void testPlugin() {
		assertTrue(true);
	}
	
}
