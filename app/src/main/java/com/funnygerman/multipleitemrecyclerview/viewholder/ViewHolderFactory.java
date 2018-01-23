package com.funnygerman.multipleitemrecyclerview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.funnygerman.multipleitemrecyclerview.R;
import com.funnygerman.multipleitemrecyclerview.viewmodel.BaseViewModel;

/**
 * ViewHolder factory to create proper ViewHolder for every {@link BaseViewModel}'s type
 */
public class ViewHolderFactory {

    public static AbstractViewHolder<? extends BaseViewModel> create(ViewGroup parent, int itemViewTypeAsInt) {
        BaseViewModel.Type itemViewType = BaseViewModel.Type.fromInt(itemViewTypeAsInt);
        View itemView;

        switch (itemViewType) {
            case TYPE_A:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_a, parent, false);
                return new ViewHolderTypeA(itemView);
            case TYPE_B:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_b, parent, false);
                return new ViewHolderTypeB(itemView);
            case TYPE_C:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_c, parent, false);
                return new ViewHolderTypeC(itemView);
            default:
                throw new IllegalArgumentException("Unknown item view type: " + itemViewType.name());
        }

    }

}
