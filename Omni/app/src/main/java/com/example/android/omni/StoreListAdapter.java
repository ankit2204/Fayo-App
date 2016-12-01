package com.example.android.omni;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static android.media.CamcorderProfile.get;
import static com.example.android.omni.StoreListActivity.LOG_TAG;

/**
 * Created by vamsi on 19-11-2016.
 */


public class StoreListAdapter extends RecyclerView.Adapter<StoreListViewHolder> {

    private List<StoreListModel> store = new ArrayList<>();
    private int itemResource;
    private Context context;

    public void setStore(List<StoreListModel> store) {
        this.store = store;
    }

    public StoreListAdapter(Context context, int itemResource, List<StoreListModel> store) {

        this.store = store;
        this.itemResource = itemResource;
        this.context = context;
    }

    @Override
    public StoreListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.store_list_laout, parent, false);

        return new StoreListViewHolder(this.context, view);
    }

    @Override
    public void onBindViewHolder(StoreListViewHolder holder, int position) {
        StoreListModel stores = this.store.get(position);
        holder.bindStoreData(stores);
    }

    @Override
    public int getItemCount() {

        Log.e(LOG_TAG, "stores size"+ store.size());
        return this.store.size();
    }
}



