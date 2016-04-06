package org.itstep.pastukhov.retrofitrx_1811.Models;

/**
 * Created by student on 18.11.2015.
 */
public class Sub_categories {

    private String category_title;

    private String category_id;

    public String getCategory_title ()
    {
        return category_title;
    }

    public void setCategory_title (String category_title)
    {
        this.category_title = category_title;
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
        return "ClassPojo [category_title = "+category_title+", category_id = "+category_id+"]";
    }
}
