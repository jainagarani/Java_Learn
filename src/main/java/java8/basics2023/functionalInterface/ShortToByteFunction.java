package java8.basics2023.functionalInterface;

@FunctionalInterface
public interface ShortToByteFunction {

    byte applyAsByte(short value);
}
