package com.funnygerman.multipleitemrecyclerview.viewmodel;

/**
 * ViewModel of Type A
 */
public class ViewModelTypeA implements BaseViewModel {

    private final String item;
    private final String itemDescription;

    public ViewModelTypeA(String item, String itemDescription) {
        this.item = item;
        this.itemDescription = itemDescription;
    }

    @Override
    public Type getType() {
        return Type.TYPE_A;
    }

    public String getItem() {
        return item;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}
