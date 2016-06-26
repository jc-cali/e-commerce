package org.jcapps.e_commerce;

/**
 * Created by JC on 6/26/16.
 */
public class Comments {
    public int mId;
    public int mUserId;
    public int mPastryId;
    public String mComment;
    public int mRating;

    public Comments(int id, int userId, int pastryId, String comment, int rating) {
        mId = id;
        mUserId = userId;
        mPastryId = pastryId;
        mComment = comment;
        mRating = rating;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getUserId() {
        return mUserId;
    }

    public void setUserId(int userId) {
        mUserId = userId;
    }

    public int getPastryId() {
        return mPastryId;
    }

    public void setPastryId(int pastryId) {
        mPastryId = pastryId;
    }

    public String getComment() {
        return mComment;
    }

    public void setComment(String comment) {
        mComment = comment;
    }

    public int getRating() {
        return mRating;
    }

    public void setRating(int rating) {
        mRating = rating;
    }
}
