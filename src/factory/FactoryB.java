package factory;

public class FactoryB extends Factory {
    @Override
    public Product makeProduct() {
        return new ProductB();
    }
}
