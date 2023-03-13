package org.example;

public interface FirstInterface {
    default void tostring()
    {
        System.out.println("Hello");
    };
    void equals();
    void HashCode();
}

