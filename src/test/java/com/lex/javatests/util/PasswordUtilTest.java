package com.lex.javatests.util;

import org.junit.jupiter.api.Test;

import static com.lex.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {
	@Test
	public void weak_when_has_less_than_8_letters() {
		assertEquals(WEAK, PasswordUtil.assessPassword("123aa!"));
	}

	@Test
	public void weak_when_has_only_letters() {
		assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghjk"));
	}

	@Test
	public void medium_when_has_letters_and_numbers() {
		assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde12345"));
	}

	@Test
	public void strong_when_has_letters_numbers_and_symbols() {
		assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));
	}
}