package com.annotations.group.core;

import com.annotations.group.customannotations.Test;

public class TestValidator {

	
	@Test(isEnabled = false)
	public void testEnabledAnnotation() {
		 if (true) {
				throw new RuntimeException("This test always failed");
			}
	}
}
