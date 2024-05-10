package com.example.asl_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asl_project.Model.AslModel;

import java.util.ArrayList;
import java.util.List;

public class ASL_RecyclerView_Adapter extends RecyclerView.Adapter<ASL_RecyclerView_Adapter.MyViewHolder> {
    Context context;
    ArrayList<AslModel> aslModelArrayList;

    public ASL_RecyclerView_Adapter(Context context, ArrayList<AslModel> aslModelArrayList1) {
        this.context = context;
        this.aslModelArrayList = aslModelArrayList1;
    }

    @NonNull
    @Override
    public ASL_RecyclerView_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.asl_card_view,parent,false);
        return new ASL_RecyclerView_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ASL_RecyclerView_Adapter.MyViewHolder holder, int position) {
        holder.aslSign.setImageResource(aslModelArrayList.get(position).getAslImage());
        holder.aslText.setText(aslModelArrayList.get(position).getAslAlphabet());
    }

    @Override
    public int getItemCount() {
        return aslModelArrayList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView aslSign;
            TextView aslText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            aslSign = itemView.findViewById(R.id.asl_img);
            aslText = itemView.findViewById(R.id.asl_text_img);

        }
    }
    public void setFilteredList(ArrayList<AslModel> filteredList){
        this.aslModelArrayList = filteredList;
        notifyDataSetChanged();
    }

    public void returnOrigialList(ArrayList<AslModel> filteredList){
        this.aslModelArrayList = filteredList;
        notifyDataSetChanged();
    }
}
