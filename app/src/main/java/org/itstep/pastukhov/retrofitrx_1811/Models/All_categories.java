package org.itstep.pastukhov.retrofitrx_1811.Models;

/**
 * Created by student on 18.11.2015.
 */
public class All_categories {

    private String category_title;

    private Sub_categories[] sub_categories;

    private String category_id;

    public String getCategory_title ()
    {
        return category_title;
    }

    public void setCategory_title (String category_title)
    {
        this.category_title = category_title;
    }

    public Sub_categories[] getSub_categories ()
    {
        return sub_categories;
    }

    public void setSub_categories (Sub_categories[] sub_categories)
    {
        this.sub_categories = sub_categories;
    }

    public String getCategory_id ()
    {
        return category_id;
    }

    public void setCategory_id (String category_id)
    {
        this.category_id = category_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [category_title = "+category_title+", sub_categories = "+sub_categories+", category_id = "+category_id+"]";
    }
}
