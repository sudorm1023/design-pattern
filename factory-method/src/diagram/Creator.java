package diagram;

public abstract class Creator {
    public abstract <T extends Product> T FactoryMethod(Class<T> c);
}
