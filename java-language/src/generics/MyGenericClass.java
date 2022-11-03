package generics;

public class MyGenericClass<T> {

    MyGenericClass() {
        genericObject = null;
    }

    public void setGenericObject(T genericObject) {
        this.genericObject = genericObject;
    }

    public T getGenericObject() {
        return genericObject;
    }

    private T genericObject;
}
