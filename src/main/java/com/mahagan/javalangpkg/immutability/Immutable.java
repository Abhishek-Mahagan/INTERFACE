package com.mahagan.javalangpkg.immutability;

public class Immutable {
    private int i;

    Immutable(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "i=" + i +
                '}';
    }

    public Immutable modifier(int i) {
        if (this.i == i) {
            return this;
        } else {
            return (new Immutable(i));
        }
    }
}
