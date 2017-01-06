package com.example.kelly.cloudmedia.adapter;

import android.view.ViewGroup;

import com.example.kelly.cloudmedia.R;
import com.example.kelly.cloudmedia.base.baseadapter.BaseRecyclerViewAdapter;
import com.example.kelly.cloudmedia.base.baseadapter.BaseRecyclerViewHolder;
import com.example.kelly.cloudmedia.databinding.ItemListBinding;

/**
 * Created by jingbin on 2016/11/30.
 */

public class Adapter extends BaseRecyclerViewAdapter<String> {
    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(parent, R.layout.item_list);
    }

    class ViewHolder extends BaseRecyclerViewHolder<String, ItemListBinding> {

        public ViewHolder(ViewGroup parent, int layoutId) {
            super(parent, layoutId);
        }

        @Override
        public void onBindViewHolder(String object, int position) {
            binding.tvText.setText("测试:  " + object);
        }
    }
}
