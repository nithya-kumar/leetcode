package longestcommonprefix;

import static org.junit.Assert.*;
import longestcommonprefix.LongestCommonPrefix;

import org.junit.Test;

public class LongestCommonPrefixTest {

	@Test
	public void test1() {
		String[] strings = {"telecom", "telephone", "television"};
		assertEquals(LongestCommonPrefix.longestCommonPrefix(strings), "tele");
	}
	
	@Test
	public void test2() {
		String[] strings = {"twitter", "google", "paypal", "facebook"};
		assertEquals(LongestCommonPrefix.longestCommonPrefix(strings), "No common prefix");
	}
	
	@Test
	public void test3() {
		String[] strings = {"telecom"};
		assertEquals(LongestCommonPrefix.longestCommonPrefix(strings), "telecom");
	}
	
	@Test
	public void test4() {
		String[] strings = {};
		assertEquals(LongestCommonPrefix.longestCommonPrefix(strings), "Input is null");
	}
	
	@Test
	public void test5() {
		String[] strings = {"telecom", "telecommunication", "telecomics"};
		assertEquals(LongestCommonPrefix.longestCommonPrefix(strings), "telecom");
	}
	
	@Test
	public void test6() {
		String[] strings = {"apple", "asynchronous", "amateur"};
		assertEquals(LongestCommonPrefix.longestCommonPrefix(strings), "a");
	}
	
	@Test
	public void test7() {
		String[] strings = {"telecom", "telephone", ""};
		assertEquals(LongestCommonPrefix.longestCommonPrefix(strings), "No common prefix");
	}

}
