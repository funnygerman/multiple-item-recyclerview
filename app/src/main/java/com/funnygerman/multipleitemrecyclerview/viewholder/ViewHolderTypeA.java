package com.funnygerman.multipleitemrecyclerview.viewholder;

import android.view.View;
import android.widget.TextView;

import com.funnygerman.multipleitemrecyclerview.R;
import com.funnygerman.multipleitemrecyclerview.viewmodel.ViewModelTypeA;

/**
 * ViewHolder for ViewModels of Type A
 */
public class ViewHolderTypeA extends AbstractViewHolder<ViewModelTypeA> {

    private final TextView itemTv;
    private final TextView itemDescriptionTv;

    public ViewHolderTypeA(View itemView) {
        super(itemView);
        itemTv = itemView.findViewById(R.id.tv_item);
        itemDescriptionTv = itemView.findViewById(R.id.tv_item_description);
    }

    @Override
    public void bind(ViewModelTypeA item) {
        itemTv.setText(item.getItem());
        itemDescriptionTv.setText(item.getItemDescription());
    }
}
