package com.google.sample.cloudvision;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by yash on 15/3/18.
 */

public class Address {
    public String OfficeName, Taluk, District, State;

    public Address(String officeName, String taluk, String district, String state) {
        OfficeName = officeName;
        Taluk = taluk;
        District = district;
        State = state;
    }

    public Address( String stringResponse) throws JSONException {

        JSONObject jsonResponse = new JSONObject(stringResponse);
        JSONArray jsonRecord = jsonResponse.getJSONArray("records");
        JSONObject resultRecord = jsonRecord.getJSONObject(0);

        OfficeName = resultRecord.getString("officename");
        Taluk = resultRecord.getString("taluk");
        District = resultRecord.getString("districtname");
        State = resultRecord.getString("statename");
    }
}
