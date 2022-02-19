package hangman.model;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
	
	@Test
	public void validateOriginalScore() {
		OriginalScore or = new OriginalScore();
		Assert.assertEquals(0, or.calculateScore(3, 10));
		Assert.assertEquals(100, or.calculateScore(5, 0));
		Assert.assertEquals(0, or.calculateScore(5, 11));
		Assert.assertEquals(40, or.calculateScore(3, 6));
	}
	
	@Test
	public void validateBonusScore() {
		BonusScore bo = new BonusScore();
		Assert.assertEquals(0, bo.calculateScore(4, 8));
		Assert.assertEquals(55, bo.calculateScore(6, 1));
		Assert.assertEquals(0, bo.calculateScore(5, 11));
	}
	
	@Test
	public void validatePowerScore() {
		BonusScore po = new BonusScore();
		Assert.assertEquals(0, po.calculateScore(0, 0));
		Assert.assertEquals(0, po.calculateScore(2, 4));
		Assert.assertEquals(500, po.calculateScore(5, 11));
		Assert.assertEquals(77, po.calculateScore(3, 6));
	}
}
