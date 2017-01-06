package com.example.kelly.cloudmedia.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

import com.example.kelly.cloudmedia.R;
import com.example.kelly.cloudmedia.base.baseadapter.BaseRecyclerViewAdapter;
import com.example.kelly.cloudmedia.base.baseadapter.BaseRecyclerViewHolder;
import com.example.kelly.cloudmedia.bean.moviechild.PersonBean;
import com.example.kelly.cloudmedia.databinding.ItemMovieDetailPersonBinding;
import com.example.kelly.cloudmedia.utils.PerfectClickListener;
import com.example.kelly.cloudmedia.view.webview.WebViewActivity;

/**
 * Created by jingbin on 2016/12/10.
 */

public class MovieDetailAdapter extends BaseRecyclerViewAdapter<PersonBean> {
    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(parent, R.layout.item_movie_detail_person);
    }

    private class ViewHolder extends BaseRecyclerViewHolder<PersonBean, ItemMovieDetailPersonBinding> {

        ViewHolder(ViewGroup parent, int layout) {
            super(parent, layout);
        }

        @Override
        public void onBindViewHolder(final PersonBean bean, int position) {
            binding.setPersonBean(bean);
            binding.llItem.setOnClickListener(new PerfectClickListener() {
                @Override
                protected void onNoDoubleClick(View v) {
                    if (bean != null && !TextUtils.isEmpty(bean.getAlt())) {
                        WebViewActivity.loadUrl(v.getContext(), bean.getAlt(), bean.getName());
                    }
                }
            });
        }
    }
}
