package com.redoutevant.springmotivation;

public class A2 {

    private final B b;

    public A2() {
        C c = new C();
        b = new B(c);
    }

    @Override
    public String toString() {
        return "A2";
    }

    private static class B {

        private C c;

        public B(C c) {
            this.c = c;
        }

        @Override
        public String toString() {
            return "B";
        }
    }

    private static class C {

        @Override
        public String toString() {
            return "C";
        }
    }

    public static void main(String[] args) {
        A2 a2 = new A2();
        System.out.println(a2);
        System.out.println(a2.b);
        System.out.println(a2.b.c);
    }
}
