package org.itstep.pastukhov.retrofitrx_1811.Interface;

import org.itstep.pastukhov.retrofitrx_1811.Models.Category;
import org.itstep.pastukhov.retrofitrx_1811.Models.Product;


import retrofit.Callback;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by student on 18.11.2015.
 */
public interface GetData {

    @POST("/index.php?route=api/categories")
    void getCategory(Callback<Category> cb);

    @POST("/index.php?route=api/product/get_product_by_id")
    void getProduct(@Query("id") String id, Callback<Product> cb);
}
