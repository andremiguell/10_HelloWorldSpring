
package com.redoutevant.springmotivation;
public class A {

    private B b;

    public A() {
        b = new B();
    }

    @Override
    public String toString() {
        return "A";
    }

    private static class B {

        public B() {
        }

        @Override
        public String toString() {
            return "B";
        }
    }
}