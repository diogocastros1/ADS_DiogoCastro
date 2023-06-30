package builder.pizza;

import org.junit.jupiter.api.Test;

public class PizzaBuilderTest {
	@Test
	void deveConstruirPizzaValida() {
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();
		
		assertNotNull(pizza);
	}
}
