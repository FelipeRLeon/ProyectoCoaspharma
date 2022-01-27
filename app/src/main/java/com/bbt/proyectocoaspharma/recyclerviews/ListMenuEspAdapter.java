package com.bbt.proyectocoaspharma.recyclerviews;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bbt.proyectocoaspharma.R;

import java.util.List;

public class ListMenuEspAdapter extends RecyclerView.Adapter<ListMenuEspAdapter.ViewHolder>
        implements View.OnClickListener{

    private List<ListMenuEsp> mData;
    private LayoutInflater mInflater;
    private Context context;
    private View.OnClickListener listener;

    public ListMenuEspAdapter(List<ListMenuEsp> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public ListMenuEspAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_menu_esp, null);

        view.setOnClickListener(this);

        return new ListMenuEspAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ListMenuEspAdapter.ViewHolder holder, int position) {
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListMenuEsp> items) {mData = items;}

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImage;
        TextView name_esp;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.icomImageMenuEsp);
            name_esp = itemView.findViewById(R.id.nameTextMenuEsp);
        }

        void bindData(final ListMenuEsp item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name_esp.setText(item.getName_esp());
        }
    }
}
