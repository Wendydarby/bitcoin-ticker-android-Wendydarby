package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinTickerSymbolModel {
    private String mAsk;
    private String mLast_price;

    public String getLast_price() {
        return mLast_price;
    }



    public static BitcoinTickerSymbolModel fromJson(JSONObject jsonObject) {
        BitcoinTickerSymbolModel bcdata = new BitcoinTickerSymbolModel();
        try {
            bcdata.mAsk = jsonObject.getString("ask");
            bcdata.mLast_price = jsonObject.getString("last");
            Log.d("Bitcoin", "Ask price is " + bcdata.mAsk + " and last price is " + bcdata.mLast_price);
            return bcdata;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

}
