package com.funnygerman.multipleitemrecyclerview.viewmodel;

/**
 * ViewModel of Type B
 */
public class ViewModelTypeB implements BaseViewModel {

    private final String element1;
    private final String element2;
    private final String element3;

    public ViewModelTypeB(String element1, String element2, String element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    @Override
    public Type getType() {
        return Type.TYPE_B;
    }

    public String getElement1() {
        return element1;
    }

    public String getElement2() {
        return element2;
    }

    public String getElement3() {
        return element3;
    }
}
