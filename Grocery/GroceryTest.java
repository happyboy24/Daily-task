import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GroceryAppTest {

	@Test
	public void testThatGroceryAppHasNoItems() {
	

	GroceryApp groceryapp = new GroceryApp();

	
	int result = grocery.totalNumberOfitems();
	
	
	assertEquals(result, 0);
	}

	@Test
	public void testThatOneItemIsAddedToTheGroceryAppAndTheTotalNumberOfItemsIsOne() {

	
	GroceryApp groceryapp = new GroceryApp();

	
	String response =grocery.addItem("Blue band");

	
	assertEquals(response, "Item added successfully");

}
	//@Test
	//public void testThatBookIsAddedToTheLibraryAndTheTotalNumberOfBooksIsOne() {

	//Arrange
	//Library library = new Library();

	// Act 
	//library.addBook("independence by sarah ladipo");
	//int result = library.totalNumberOfBooks();

	// Assert
	//assertEquals(result, 1);


}

}