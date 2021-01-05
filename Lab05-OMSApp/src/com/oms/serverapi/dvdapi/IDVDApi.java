package com.oms.serverapi.dvdapi;

import com.oms.bean.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Map;

public interface IDVDApi {
    public ArrayList<DigitalVideoDisc> getDvds(Map<String, String> queryParams);
}
