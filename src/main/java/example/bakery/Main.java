public class Main {
    public static void main(String[] args) {
        BakeryCore core = new BakeryCore(
                new InMemoryProductRepository(),
                new InMemoryIngredientRepository(),
                new InMemoryRecipeRepository(),
                new InMemoryOrderRepository(),
                new InMemoryProductionBatchRepository()
        );
        new ConsoleUI(core).start();
    }
}