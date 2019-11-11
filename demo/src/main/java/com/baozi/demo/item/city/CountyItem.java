package com.baozi.demo.item.city;

import android.support.annotation.NonNull;

import com.baozi.demo.R;
import com.baozi.treerecyclerview.factory.ItemHelperFactory;
import com.baozi.treerecyclerview.base.ViewHolder;
import com.baozi.treerecyclerview.item.TreeItem;
import com.baozi.treerecyclerview.item.TreeItemGroup;

import java.util.List;

/**
 */
public class CountyItem extends TreeItemGroup<ProvinceBean.CityBean> {

    @Override
    public List<TreeItem> initChild(ProvinceBean.CityBean data) {
        return ItemHelperFactory.createItems(data.areas,  this);
    }


    @Override
    public int getLayoutId() {
        return R.layout.item_two;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder) {
        holder.setText(R.id.tv_content, data.cityName);
    }
}