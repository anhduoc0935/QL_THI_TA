package com.example.tienganh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

public class ThiAdapter extends BaseAdapter {
private Context context;
private int layout;
    private List<Cacthi> cacthiList;

    public ThiAdapter(Context context, int layout, List<Cacthi> cacthiList) {
        this.context = context;
        this.layout = layout;
        this.cacthiList = cacthiList;
    }


    @Override
    public int getCount() {
        return cacthiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(layout,null);
        TextView txtten=(TextView)view.findViewById(R.id.textviewten);
        TextView txttenTA=(TextView)view.findViewById(R.id.textviewtenTA);
        TextView txtcongthuc=(TextView)view.findViewById(R.id.textviewcongthuc);
        TextView txtnhanbiet=(TextView)view.findViewById(R.id.textviewnhanbiet);
        TextView txtcachdung=(TextView)view.findViewById(R.id.textviewcachdung);
        return view;
    }
}
