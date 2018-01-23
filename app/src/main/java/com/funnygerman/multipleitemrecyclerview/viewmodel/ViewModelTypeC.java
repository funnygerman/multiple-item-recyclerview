package com.funnygerman.multipleitemrecyclerview.viewmodel;

/**
 * Please add a proper description here.
 *
 * @author funnygerman
 * @version 1.0
 * @since 1.0
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
