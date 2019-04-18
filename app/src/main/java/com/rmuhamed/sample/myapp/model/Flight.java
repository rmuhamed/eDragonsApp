package com.rmuhamed.sample.myapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flight {
    @SerializedName("inbound")
    @Expose
    private Bound inbound;
    @SerializedName("outbound")
    @Expose
    private Bound outbound;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("currency")
    @Expose
    private String currency;

    public Bound getInbound() {
        return inbound;
    }

    public void setInbound(Bound inbound) {
        this.inbound = inbound;
    }

    public Bound getOutbound() {
        return outbound;
    }

    public void setOutbound(Bound outbound) {
        this.outbound = outbound;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}