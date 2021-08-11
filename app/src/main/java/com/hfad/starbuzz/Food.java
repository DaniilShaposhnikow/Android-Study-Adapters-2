package com.hfad.starbuzz;

public class Food
{
    private String name;
    private String description;
    private int imageResourceID;

    public static final Food [] foods =
            {
                    new Food("Vėdarai", "lithuanian with soul ", R.drawable.cepellin),
                    new Food("Cepelinai", "lithuanian with soul", R.drawable.vareniki),
            };
    private Food (String name, String description, int imageResourceID)
    {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }
    public String getDescription ()
    {
        return description;
    }
    public String getName()
    {
        return name;
    }
    public int getImageResourceID ()
    {
        return imageResourceID;
    }
    public String toString()
    {
        return this.name;
    }
}
