package TemplateMethod;

public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println();
    }

    @Override
    protected void addCondiments() {
        System.out.println();
    }
}