package com.funnygerman.multipleitemrecyclerview.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.funnygerman.multipleitemrecyclerview.viewmodel.BaseViewModel;

/**
 * Please add a proper description here.
 *
 * @author funnygerman
 * @version 1.0
 * @since 1.0
 */

public abstract class AbstractViewHolder<T extends BaseViewModel> extends RecyclerView.ViewHolder {

    public AbstractViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T item);

    public void onViewRecycled() {
        // nothing to do, but the method can be overridden if needed
    }

}
