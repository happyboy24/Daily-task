import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BreakfastTwoTest {  
	@Test
	public void testThatTheFlowerCollectedHasToBeEvenPetals() {
		BreakfastTwo breakfasttwo = new BreakfastTwo();
		int result = breakfasttwo.totalNumberOfEvenPetals();
		assertEquals(result, 8);

}


}