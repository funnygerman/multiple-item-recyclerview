
package com.funnygerman.multipleitemrecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.funnygerman.multipleitemrecyclerview.viewholder.AbstractViewHolder;
import com.funnygerman.multipleitemrecyclerview.viewholder.ViewHolderFactory;
import com.funnygerman.multipleitemrecyclerview.viewmodel.BaseViewModel;

import java.util.List;

/**
 * {@link RecyclerViewAdapter} to display {@link BaseViewModel} items
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<AbstractViewHolder<? extends BaseViewModel>> {

    private final List<BaseViewModel> items;
    private ClickListener clickListener;

    /**
     * Click listener (if needed)
     */
    public interface ClickListener {

        /**
         * Notify the listener about a click on an item of Type A
         */
        void onItemTypeAClicked();

        /**
         * Notify the listener about a click on an item of Type B
         */
        void onItemTypeBClicked();
    }

    public RecyclerViewAdapter(List<BaseViewModel> items) {
        this.items = items;
    }

    @Override
    public AbstractViewHolder<? extends BaseViewModel> onCreateViewHolder(ViewGroup parent, int viewType) {
        return ViewHolderFactory.create(parent, viewType, clickListener);
    }

    @Override
    public void onBindViewHolder(AbstractViewHolder holder, int position) {
        // noinspection unchecked
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType().ordinal();
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
