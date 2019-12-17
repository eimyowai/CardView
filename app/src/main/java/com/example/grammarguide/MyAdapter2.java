//package com.example.article;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class MyAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {
//
//
//    Context context;
//    ArrayList<Art> arts;
//
//
//    public MyAdapter(Context c,ArrayList<Art> A)
//    {
//        context=c;
//        arts=A;
//
//    }
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.menu_item,parent,false));
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//
//        holder.q.setText(arts.get(position).getQuestion());
//        holder.r1.setText(arts.get(position).getRadio1());
//        holder.r2.setText(arts.get(position).getRadio2());
//        holder.r3.setText(arts.get(position).getRadio3());
//        holder.r4.setText(arts.get(position).getRadio4());
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    @Override
//    public void onClick(View view) {
//
//    }
//
//    class MyViewHolder extends RecyclerView.ViewHolder
//    {
//
//        TextView q,r1,r2,r3,r4;
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            q=(TextView)itemView.findViewById(R.id.q);
//            r1=(TextView)itemView.findViewById(R.id.r1);
//            r2=(TextView)itemView.findViewById(R.id.r2);
//            r3=(TextView)itemView.findViewById(R.id.r3);
//            r4=(TextView)itemView.findViewById(R.id.r4);
//
//
//        }
//    }
//}
package com.example.grammarguide;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//public class MyAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {
//
//  public   TextView q;
//    public   TextView r1;
//    public   TextView r2;
//    public   TextView r3;
//    public   TextView r4;
//    private ItemClickListener itemClickListener;
//
//    public MyAdapter(@NonNull View itemView) {
//        super(itemView);
//           q=(TextView)itemView.findViewById(R.id.q);
//           r1=(TextView)itemView.findViewById(R.id.r1);
//           r2=(TextView)itemView.findViewById(R.id.r2);
//           r3=(TextView)itemView.findViewById(R.id.r3);
//           r4=(TextView)itemView.findViewById(R.id.r4);
//
//
//        itemView.setOnClickListener(this);
//    }
//
//    public void setItemClickListener(ItemClickListener itemClickListener) {
//        this.itemClickListener = itemClickListener;
//    }
//
//    @Override
//    public void onClick(View view) {
//
//        itemClickListener.onClick(view,getAdapterPosition(),false);
//


public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ArtViewHolder> {

    public static int answer_count=0;
    private Context mCtx;
    private List<Art> artistList;

    public static  int TOTAL_TIME = 1*60*1000;

    public static CountDownTimer countDownTimer;

    public MyAdapter2(Context mCtx, List<Art> artistList) {
        this.mCtx = mCtx;
        this.artistList = artistList;
    }

    @NonNull
    @Override
    public ArtViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.menu_item2, parent, false);
        return new ArtViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtViewHolder holder, int position) {
        Art art = artistList.get(position);
        holder.q.setText(art.getQuestion());
        holder.r1.setText(art.getRadio1());
        holder.r2.setText(art.getRadio2());

    }

    @Override
    public int getItemCount() {
        return artistList.size();
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
    }

    class ArtViewHolder extends RecyclerView.ViewHolder {

        TextView q, r1, r2;

        public ArtViewHolder(@NonNull View itemView) {
            super(itemView);

            q = itemView.findViewById(R.id.q);
            r1 = itemView.findViewById(R.id.r1);
            r2= itemView.findViewById(R.id.r2);

        }
    }
}
