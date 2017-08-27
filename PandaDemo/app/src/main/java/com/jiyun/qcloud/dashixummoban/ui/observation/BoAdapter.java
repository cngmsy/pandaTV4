package com.jiyun.qcloud.dashixummoban.ui.observation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.entity.Bobao.Bolist;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public class BoAdapter extends RecyclerView.Adapter<BoAdapter.ViewHolder>{
    List<Bolist.ListBean> bolist;
    Context context;
    public BoAdapter(List<Bolist.ListBean> bolist, Context context) {
        this.bolist = bolist;
        this.context = context;
    }

    @Override
    public BoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_bobao,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BoAdapter.ViewHolder holder, int position) {
          Bolist.ListBean list = bolist.get(position);
          holder.botitle.setText(list.getTitle());
        holder.botime.setText(list.getFocus_date()+"");
        Glide.with(context).load(list.getPicurl()).into(holder.boimage);
    }

    @Override
    public int getItemCount() {
        return bolist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView boimage;
        TextView botitle,botime;
        public ViewHolder(View itemView) {
            super(itemView);
            boimage = itemView.findViewById(R.id.bobao_image);
            botitle = itemView.findViewById(R.id.bobao_title);
            botime = itemView.findViewById(R.id.bobao_context);

        }
    }
}
