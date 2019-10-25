package com.dicoding.toptenapp.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.toptenapp.R;

import java.util.List;

public class ListTopTenAdapter extends RecyclerView.Adapter<ListTopTenAdapter.ListViewHolder> {

    private List<ProLang> mData;
    private OnItemClickCallback onItemClickCallback;

    public ListTopTenAdapter(List<ProLang> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_list_top, parent, false);
        ListViewHolder viewHolder = new ListViewHolder(view);

        return viewHolder;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        String prolangPosition = String.valueOf(position+1);
        holder.tvprolangPosition.setText(prolangPosition);

        int imgChange;
        switch (mData.get(position).getChangeImg()){
            case "up":
                imgChange = R.drawable.arrow_up;
                break;
            case "down":
                imgChange = R.drawable.arrow_down;
                break;
            case "stay":
                imgChange = R.drawable.strip;
                break;
            default:
                imgChange = R.drawable.strip;
        }
        Glide.with(holder.itemView.getContext())
                .load(imgChange)
                .into(holder.ivprolangChange);

        holder.tvprolangName.setText(mData.get(position).getName());
        holder.tvprolangRating.setText(mData.get(position).getRating());
        holder.ll_listProlang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(mData.get(holder.getAdapterPosition()));
            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvprolangPosition, tvprolangName, tvprolangRating;
        ImageView ivprolangChange;
        LinearLayout ll_listProlang;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            tvprolangPosition = itemView.findViewById(R.id.tv_prolang_position);
            tvprolangName = itemView.findViewById(R.id.tv_prolang_name);
            tvprolangRating = itemView.findViewById(R.id.tv_prolang_rating);
            ivprolangChange = itemView.findViewById(R.id.iv_prolang_change);
            ll_listProlang = itemView.findViewById(R.id.ll_list_prolang);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(ProLang data);
    }
}
