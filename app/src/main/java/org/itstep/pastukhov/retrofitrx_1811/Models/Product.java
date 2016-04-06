package org.itstep.pastukhov.retrofitrx_1811.Models;

/**
 * Created by student on 18.11.2015.
 */
public class Product {

    private String id;

    private String price;

    private String desc;

    private String count;

    private String is_public;

    private String img;

    private String[] categories;

    private String pagetitle;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public String getIs_public ()
    {
        return is_public;
    }

    public void setIs_public (String is_public)
    {
        this.is_public = is_public;
    }

    public String getImg ()
    {
        return img;
    }

    public void setImg (String img)
    {
        this.img = img;
    }

    public String[] getCategories ()
    {
        return categories;
    }

    public void setCategories (String[] categories)
    {
        this.categories = categories;
    }

    public String getPagetitle ()
    {
        return pagetitle;
    }

    public void setPagetitle (String pagetitle)
    {
        this.pagetitle = pagetitle;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", price = "+price+", desc = "+desc+", count = "+count+", is_public = "+is_public+", img = "+img+", categories = "+categories+", pagetitle = "+pagetitle+"]";
    }
}
