package com.funnygerman.multipleitemrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.funnygerman.multipleitemrecyclerview.adapter.RecyclerViewAdapter;
import com.funnygerman.multipleitemrecyclerview.viewmodel.BaseViewModel;
import com.funnygerman.multipleitemrecyclerview.viewmodel.ViewModelTypeA;
import com.funnygerman.multipleitemrecyclerview.viewmodel.ViewModelTypeB;
import com.funnygerman.multipleitemrecyclerview.viewmodel.ViewModelTypeC;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<BaseViewModel> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();
        RecyclerView multipleItemRecyclerView = findViewById(R.id.multiple_item_recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        multipleItemRecyclerView.setLayoutManager(layoutManager);
        multipleItemRecyclerView.setAdapter(new RecyclerViewAdapter(items));
    }

    private void initItems() {
        items.add(new ViewModelTypeC("red"));
        items.add(new ViewModelTypeA("item1", "It's item 1"));
        items.add(new ViewModelTypeA("item2", "It's item 2"));
        items.add(new ViewModelTypeC("blue"));
        items.add(new ViewModelTypeA("item3", "It's item 3"));
        items.add(new ViewModelTypeA("item4", "It's item 4"));
        items.add(new ViewModelTypeC("green"));
        items.add(new ViewModelTypeB("element1", "element2", "element3"));
        items.add(new ViewModelTypeC("red"));
    }
}
