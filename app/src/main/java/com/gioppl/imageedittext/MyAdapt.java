package com.gioppl.imageedittext;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by GIOPPL on 2017/8/10.
 */

public class MyAdapt extends RecyclerView.Adapter<MyAdapt.MyViewHolder>{
    private String[] mList;
    public MyAdapt(){
        mList=Images.imageUrls;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.simpleDraweeView1.setImageURI(mList[position]);
        holder.simpleDraweeView2.setImageURI(Images.image2[position]);
        holder.simpleDraweeView3.setImageURI(mList[position]);
        holder.simpleDraweeView4.setImageURI(Images.image2[position]);
    }

    @Override
    public int getItemCount() {
        return mList.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private SimpleDraweeView simpleDraweeView1;
        private SimpleDraweeView simpleDraweeView2;
        private SimpleDraweeView simpleDraweeView3;
        private SimpleDraweeView simpleDraweeView4;
        public MyViewHolder(View itemView) {
            super(itemView);
            simpleDraweeView1= (SimpleDraweeView) itemView.findViewById(R.id.im_1);
            simpleDraweeView2= (SimpleDraweeView) itemView.findViewById(R.id.im_2);
            simpleDraweeView3= (SimpleDraweeView) itemView.findViewById(R.id.im_3);
            simpleDraweeView4= (SimpleDraweeView) itemView.findViewById(R.id.im_4);
        }
    }
}
