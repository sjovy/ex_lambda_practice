package se.sjovy.model;

@FunctionalInterface
public interface Conditional {
    boolean test(Product p);
}
