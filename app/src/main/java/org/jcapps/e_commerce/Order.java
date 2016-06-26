package org.jcapps.e_commerce;

/**
 * Created by JC on 6/26/16.
 */
public class Order {
    public int mId;
    public int mCustId;
    public int mPastryId;
    public int mQuantity;
    public double mOrderTot;
    public double mTaxRate;
    public double mTotalAmt;
    public String mOrderDate;
    public boolean mIsOrderFilled;

    public Order(int id, int custId, int pastryId, int quantity, double orderTot, double taxRate, double totalAmt, String orderDate, boolean isOrderFilled) {
        mId = id;
        mCustId = custId;
        mPastryId = pastryId;
        mQuantity = quantity;
        mOrderTot = orderTot;
        mTaxRate = taxRate;
        mTotalAmt = totalAmt;
        mOrderDate = orderDate;
        mIsOrderFilled = isOrderFilled;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getCustId() {
        return mCustId;
    }

    public void setCustId(int custId) {
        mCustId = custId;
    }

    public int getPastryId() {
        return mPastryId;
    }

    public void setPastryId(int pastryId) {
        mPastryId = pastryId;
    }

    public int getQuantity() {
        return mQuantity;
    }

    public void setQuantity(int quantity) {
        mQuantity = quantity;
    }

    public double getOrderTot() {
        return mOrderTot;
    }

    public void setOrderTot(double orderTot) {
        mOrderTot = orderTot;
    }

    public double getTaxRate() {
        return mTaxRate;
    }

    public void setTaxRate(double taxRate) {
        mTaxRate = taxRate;
    }

    public double getTotalAmt() {
        return mTotalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        mTotalAmt = totalAmt;
    }

    public String getOrderDate() {
        return mOrderDate;
    }

    public void setOrderDate(String orderDate) {
        mOrderDate = orderDate;
    }

    public boolean isOrderFilled() {
        return mIsOrderFilled;
    }

    public void setOrderFilled(boolean orderFilled) {
        mIsOrderFilled = orderFilled;
    }
}
