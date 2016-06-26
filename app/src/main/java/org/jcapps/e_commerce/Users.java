package org.jcapps.e_commerce;

/**
 * Created by JC on 6/26/16.
 */
public class Users {
    public int mId;
    public String mName;
    public String mEmail;
    public int mCCNumber;
    public String mCCExpDate;
    public int mCCSecCode;

    public Users(int id, String name, String email, int CCNumber, String CCExpDate, int CCSecCode) {
        mId = id;
        mName = name;
        mEmail = email;
        mCCNumber = CCNumber;
        mCCExpDate = CCExpDate;
        mCCSecCode = CCSecCode;
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

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public int getCCNumber() {
        return mCCNumber;
    }

    public void setCCNumber(int CCNumber) {
        mCCNumber = CCNumber;
    }

    public String getCCExpDate() {
        return mCCExpDate;
    }

    public void setCCExpDate(String CCExpDate) {
        mCCExpDate = CCExpDate;
    }

    public int getCCSecCode() {
        return mCCSecCode;
    }

    public void setCCSecCode(int CCSecCode) {
        mCCSecCode = CCSecCode;
    }
}
