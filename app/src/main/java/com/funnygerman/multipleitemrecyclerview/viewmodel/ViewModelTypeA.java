package com.funnygerman.multipleitemrecyclerview.viewmodel;

/**
 * Please add a proper description here.
 *
 * @author funnygerman
 * @version 1.0
 * @since 1.0
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
