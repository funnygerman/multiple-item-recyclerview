package com.funnygerman.multipleitemrecyclerview.viewholder;

import android.graphics.Color;
import android.view.View;

import com.funnygerman.multipleitemrecyclerview.R;
import com.funnygerman.multipleitemrecyclerview.viewmodel.ViewModelTypeC;

/**
 * ViewHolder for ViewModels of Type C
 */
public class ViewHolderTypeC extends AbstractViewHolder<ViewModelTypeC> {

    private final View coloredView;

    public ViewHolderTypeC(View itemView) {
        super(itemView);
        coloredView = itemView.findViewById(R.id.view_colored);
    }

    @Override
    public void bind(ViewModelTypeC item) {
        coloredView.setBackgroundColor(Color.parseColor(item.getColor()));
    }
}
