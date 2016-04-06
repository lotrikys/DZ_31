package org.itstep.pastukhov.retrofitrx_1811.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.itstep.pastukhov.retrofitrx_1811.Models.BaseAdapterModel;
import org.itstep.pastukhov.retrofitrx_1811.R;

import java.util.ArrayList;

/**
 * Created by student on 18.11.2015.
 */
public class ListAdapter extends BaseAdapter{

    ArrayList<BaseAdapterModel> name;
    Context context;
    LayoutInflater inflater;
    TextView category;

    public ListAdapter(Context context, ArrayList<BaseAdapterModel> name) {
        this.context = context;
        this.name = name;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int position) {
        return name.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null){
            view = inflater.inflate(R.layout.category, parent, false);
        }

        BaseAdapterModel c = getWeatherModel(position);

        category = (TextView)view.findViewById(R.id.category);
        category.setText(c.name);

        return view;
    }

    BaseAdapterModel getWeatherModel(int i){
        return ((BaseAdapterModel)getItem(i));
    }
}
