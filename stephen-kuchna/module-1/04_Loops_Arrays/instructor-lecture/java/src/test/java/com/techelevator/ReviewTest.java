package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReviewTest {

	@Test
	public void testCanScheduleMeeting() {
		assertEquals(false, Review.canScheduleMeeting(true, false));
	}

	@Test
	public void testCanAnyoneHelp() {
		assertEquals(true, Review.canAnyoneHelp(false,  true,  true,  false));
	}

	@Test
	public void testSelectCreditCard() {
		assertEquals(false, Review.selectCreditCard(true,  false,  true));
		assertEquals(true, Review.selectCreditCard(true,  false,  false));
		assertEquals(false, Review.selectCreditCard(true,  true,  true));
		assertEquals(true, Review.selectCreditCard(false,  true,  false));
	}

	@Test
	public void testGetBuffetPrice() {
		assertEquals(9.95, Review.getBuffetPrice(65), 0.005);
	}

}
