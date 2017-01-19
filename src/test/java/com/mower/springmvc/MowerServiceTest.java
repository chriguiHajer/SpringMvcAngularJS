package com.mower.springmvc;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.mower.springmvc.model.Mower;
import com.mower.springmvc.service.MowerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "TestContext.xml")
@TestExecutionListeners(DependencyInjectionTestExecutionListener.class)
public class MowerServiceTest {

	@Autowired
	private MowerService mowerService;

	@Test
	public void testGetMowersFromInput() throws Exception {
		// Act
		List<Mower> resultat = mowerService.getMowers();

		// Assert
		assertEquals(2, resultat.size());
	}

	@Test(expected = NullPointerException.class)
	@Ignore
	public void testGetMowersFromInputNull() throws Exception {
		// Act
		List<Mower> resultat = mowerService.getMowers();

		// Assert
		assertEquals(2, resultat.size());
	}
}
