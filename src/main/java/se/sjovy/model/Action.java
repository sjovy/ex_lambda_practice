package se.sjovy.model;

@FunctionalInterface
public interface Action {
    void execute(Product p);
}
