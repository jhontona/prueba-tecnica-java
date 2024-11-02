import factory.Factory;
import factory.FactoryA;
import factory.FactoryB;
import factory.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Implementar Singleton");
        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();
        System.out.println();

        System.out.println("Implementar Factory");
        Factory fabricaA = new FactoryA();
        Product productoA = fabricaA.makeProduct();
        productoA.showType();

        Factory fabricaB = new FactoryB();
        Product productoB = fabricaB.makeProduct();
        productoB.showType();
        System.out.println();

        int[] array = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};
        SelectionSort.sortNumbers(array);
    }
}