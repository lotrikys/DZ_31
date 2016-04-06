package org.itstep.pastukhov.retrofitrx_1811.Models;

/**
 * Created by student on 18.11.2015.
 */
public class Category {

    private All_categories[] all_categories;

    public All_categories[] getAll_categories ()
    {
        return all_categories;
    }

    public void setAll_categories (All_categories[] all_categories)
    {
        this.all_categories = all_categories;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [all_categories = "+all_categories+"]";
    }

}
