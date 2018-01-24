package com.funnygerman.multipleitemrecyclerview.viewholder;

import android.view.View;
import android.widget.TextView;

import com.funnygerman.multipleitemrecyclerview.R;
import com.funnygerman.multipleitemrecyclerview.adapter.RecyclerViewAdapter;
import com.funnygerman.multipleitemrecyclerview.viewmodel.ViewModelTypeB;

/**
 * ViewHolder for ViewModels of Type B
 */
public class ViewHolderTypeB extends AbstractViewHolder<ViewModelTypeB> {

    private final TextView tv_element_1;
    private final TextView tv_element_2;
    private final TextView tv_element_3;

    public ViewHolderTypeB(View itemView, RecyclerViewAdapter.ClickListener clickListener) {
        super(itemView);
        tv_element_1 = itemView.findViewById(R.id.tv_element_1);
        tv_element_2 = itemView.findViewById(R.id.tv_element_2);
        tv_element_3 = itemView.findViewById(R.id.tv_element_3);
    }

    @Override
    public void bind(ViewModelTypeB item) {
        tv_element_1.setText(item.getElement1());
        tv_element_2.setText(item.getElement2());
        tv_element_3.setText(item.getElement3());
    }
}
