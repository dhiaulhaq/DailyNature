package com.example.dailynature.Adapter;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailynature.Activity.DetailHewanActivity;
import com.example.dailynature.Model.Hewan;
import com.example.dailynature.R;

import java.util.List;

public class HewanAdapter extends RecyclerView.Adapter<HewanAdapter.MyViewHolder> {
    private Context mContext ;
    private List<Hewan> mData ;


    public HewanAdapter(Context mContext, List<Hewan> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_home,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.tvDescription.setText(mData.get(position).getDescription());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
//        holder.btnSound.setBackgroundResource(mData.get(position).getSound());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, DetailHewanActivity.class);

                // passing data to the book activity
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
//                intent.putExtra("Sound",mData.get(position).getSound());
                // start the activity
                mContext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title, tvDescription;
        ImageView img_book_thumbnail;
        CardView cardView ;
//        Button btnSound;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_book_title = itemView.findViewById(R.id.tv_title);
            tvDescription = itemView.findViewById(R.id.tv_description);
            img_book_thumbnail = itemView.findViewById(R.id.iv_cardview);
            cardView = itemView.findViewById(R.id.cv_hewan);
//            btnSound = itemView.findViewById(R.id.btn_Sound);


        }
    }


}

