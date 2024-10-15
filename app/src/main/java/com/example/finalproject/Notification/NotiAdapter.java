package com.example.finalproject.Notification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;

import java.util.ArrayList;

public class NotiAdapter extends RecyclerView.Adapter<NotiAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Noti> notiList;

    public NotiAdapter(Context context, int item_notification, ArrayList<Noti> notiList)
    {
        this.context = context;
        this.notiList = notiList;
    }

    public ArrayList<Noti> getNotiList(){return notiList;}

    public void setNotiList(ArrayList<Noti> notilist){this.notiList = notilist;}

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView title2;
        private TextView body;
        private TextView body2;

        public ViewHolder (@NonNull View view)
        {
            super(view);
            title2 = (TextView) view.findViewById(R.id.tvTieude2);
            body2 = (TextView) view.findViewById(R.id.tvNoidung2);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int type)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_notification,parent,false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        Noti noti = notiList.get(position);
        holder.title2.setText(noti.getTittle());
        holder.body2.setText(noti.getBody());
    }

    @Override
    public int getItemCount()
    {
        return notiList.size();
    }
}
