package com.funnygerman.multipleitemrecyclerview.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Abstract ViewHolder to extend all other ViewHolders from
 */

public abstract class AbstractViewHolder<BaseViewModel> extends RecyclerView.ViewHolder {

    public AbstractViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(BaseViewModel item);

    public void onViewRecycled() {
        // nothing to do, but the method can be overridden if needed
    }
}
