package TemplateMethod;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println();
    }

    @Override
    protected void addCondiments() {
        System.out.println();
    }
}
