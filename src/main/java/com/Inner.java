package com;

public class Inner {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(10);
        OuterClass.InnerStaticClass innerStatic = new OuterClass.InnerStaticClass(20);
        System.out.println(inner.getInnerVariable());
        System.out.println(innerStatic.getInnerVariable());
    }
}

class OuterClass {
    private final int outerVariable = 8;

    public class InnerClass{

        private int innerVariable;

        public InnerClass(int var){
            this.innerVariable = var;
        }

        public int getInnerVariable() {
            return innerVariable;
        }
    }

    public static class InnerStaticClass{
        private int innerVariable;

        public InnerStaticClass(int var){
            this.innerVariable = var;
        }

        public int getInnerVariable() {
            return innerVariable;
        }
    }
}