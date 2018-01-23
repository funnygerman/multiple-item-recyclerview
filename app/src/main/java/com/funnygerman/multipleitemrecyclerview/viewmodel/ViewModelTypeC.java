package com.funnygerman.multipleitemrecyclerview.viewmodel;

/**
 * ViewModel of Type C
 */
public class ViewModelTypeC implements BaseViewModel {

    private final String color;

    public ViewModelTypeC(String color) {
        this.color = color;
    }

    @Override
    public Type getType() {
        return Type.TYPE_C;
    }

    public String getColor() {
        return color;
    }
}
