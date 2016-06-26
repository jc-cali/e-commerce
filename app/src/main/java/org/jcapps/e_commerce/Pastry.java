package org.jcapps.e_commerce;

/**
 * Created by JC on 6/26/16.
 */
public class Pastry {
    public int mId;
    public String mName;
    public String mDesc;
    public int mCalories;
    public boolean mIsGlutenFree;
    public double mPrice;
    public String mCategory;
    public boolean mIsAvailable;

    public Pastry(int id, String name, String desc, int calories, boolean isGlutenFree, double price, String category, boolean isAvailable) {
        mId = id;
        mName = name;
        mDesc = desc;
        mCalories = calories;
        mIsGlutenFree = isGlutenFree;
        mPrice = price;
        mCategory = category;
        mIsAvailable = isAvailable;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDesc() {
        return mDesc;
    }

    public void setDesc(String desc) {
        mDesc = desc;
    }

    public int getCalories() {
        return mCalories;
    }

    public void setCalories(int calories) {
        mCalories = calories;
    }

    public boolean isGlutenFree() {
        return mIsGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        mIsGlutenFree = glutenFree;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public boolean isAvailable() {
        return mIsAvailable;
    }

    public void setAvailable(boolean available) {
        mIsAvailable = available;
    }
}
