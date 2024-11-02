package factory;

public class FactoryA extends Factory {

    @Override
    public Product makeProduct() {
        return new ProductA();
    }
}
