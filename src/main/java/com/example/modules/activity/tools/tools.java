package com.example.modules.activity.tools;

import net.sf.json.JSONObject;

public class tools{
    public <T> String toJson(T t)
    {
        JSONObject json = JSONObject.fromObject(t);
        return json.toString();
    }
}
