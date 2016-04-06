package org.itstep.pastukhov.retrofitrx_1811;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import org.itstep.pastukhov.retrofitrx_1811.Adapter.ListAdapter;
import org.itstep.pastukhov.retrofitrx_1811.Interface.GetData;
import org.itstep.pastukhov.retrofitrx_1811.Models.All_categories;
import org.itstep.pastukhov.retrofitrx_1811.Models.BaseAdapterModel;
import org.itstep.pastukhov.retrofitrx_1811.Models.Category;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<BaseAdapterModel> baseAdapterModels = new ArrayList<>();
    Context context;
    ListAdapter listAdapter;
    BaseAdapterModel baseAdapterModel;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        url = "http://ayuroma.pixy.pro";

        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(url).build();
        GetData getData = adapter.create(GetData.class);
        getData.getCategory(new Callback<Category>() {
            @Override
            public void success(Category category, Response response) {
                for (int i = 0; i < category.getAll_categories().length; i++){
                    baseAdapterModel = new BaseAdapterModel(category.getAll_categories()[i].getCategory_title());
                    baseAdapterModels.add(baseAdapterModel);
                }
//                Log.d("tag", category.getAll_categories()[1].getCategory_title());
                listAdapter = new ListAdapter(context, baseAdapterModels);

                lv = (ListView)findViewById(R.id.lv);
                lv.setAdapter(listAdapter);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("tag", error.getMessage());
            }
        });
    }

}
