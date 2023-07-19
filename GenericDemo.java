class GenericClass<T> {
  private T obj;

  public void add(T obj) {
    this.obj = obj;
  }

  public T get() {
    return obj;
  }
}

public class GenericDemo {
  public static void main(String[] args) {
    GenericClass<String> stringClass = new GenericClass<>();
    stringClass.add("Hello, world!");
    System.out.println(stringClass.get());

    GenericClass<Integer> integerClass = new GenericClass<>();
    integerClass.add(100);
    System.out.println(integerClass.get());
  }
}
