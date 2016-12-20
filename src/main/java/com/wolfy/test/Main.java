package com.wolfy.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.github.hengyunabc.zabbix.api.DefaultZabbixApi;
import io.github.hengyunabc.zabbix.api.Request;
import io.github.hengyunabc.zabbix.api.RequestBuilder;
import io.github.hengyunabc.zabbix.api.ZabbixApi;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static String url = "http://172.25.200.55/zabbix/api_jsonrpc.php";

    public static void main(String[] args) {
//        getHostId("172.25.201.69");
//        getHostId("172.24.147.187");
//        getInterfaceIds("10908");
//        getInterfaceIds("10890");
//        createItem();
//        getItems("10908");
//        getTriggers();
//        createPortTrigger("172.25.201.69", "443");//29910
//        System.out.println(equals(null, null));
        StringBuilder sb = new StringBuilder();
        sb.append("test test test");
        sb.insert(0, "1111");
        System.out.println(sb);
    }


    private static void getInterfaceIds(String hostid) {
        ZabbixApi zabbixApi = login();

//        JSONObject jo = new JSONObject();
//        jo.put("output", "extend");
//        jo.put("hostids", hostid);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("output", "extend");
        params.put("hostids", hostid);
        Request request = RequestBuilder.newBuilder().method("hostinterface.get").build();
        request.setParams(params);
        System.out.println(JSON.toJSONString(request));
        JSONObject response = zabbixApi.call(request);
        System.out.println(response);
    }

    private static void getHostId(String host) {
        ZabbixApi zabbixApi = login();

        JSONObject jo = new JSONObject();

        jo.put("host", new String[]{host});
        Request request = RequestBuilder.newBuilder().method("host.get").paramEntry("filter", jo).build();
        JSONObject response = zabbixApi.call(request);
        System.out.println(response);
        String hostid = response.getJSONArray("result").getJSONObject(0).getString("hostid");
        System.out.println(hostid);
    }

    private static void createPortTrigger(String host, String port) {
        ZabbixApi zabbixApi = login();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("description", "trigger test");
        params.put("expression", "{"+host+":net.tcp.listen["+port+"].last(0)}=0");
        Request request = RequestBuilder.newBuilder().method("trigger.create").build();
        request.setParams(params);
        System.out.println(request);
        JSONObject response = zabbixApi.call(request);
        System.out.println(response);
    }

    private static void createItem() {
        ZabbixApi zabbixApi = login();
//        JSONObject jo = new JSONObject();
//        jo.put("name", "test 443");
//        jo.put("key_", "net.tcp.listen[443]");
//        jo.put("hostid", "10908");
//        jo.put("type", 0);
//        jo.put("value_type", 3);
//        jo.put("interfaceid", "522");
//        jo.put("delay", 10);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", "test 443");
        params.put("key_", "net.tcp.listen[443]");
        params.put("hostid", "10908");
        params.put("type", 0);
        params.put("value_type", 3);
        params.put("interfaceid", "630");
        params.put("delay", 10);
        Request request = RequestBuilder.newBuilder().method("item.create").build();
        request.setParams(params);
        request.setId(1);
        System.out.println(JSON.toJSONString(request));
        JSONObject response = zabbixApi.call(request);
        System.out.println(response);

    }

    private static void getItems(String hostid) {
        ZabbixApi zabbixApi = login();
        Request request = RequestBuilder.newBuilder().method("item.get").build();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("output", "extend");
        params.put("hostids", hostid);
        request.setParams(params);
        System.out.println(JSON.toJSONString(request));
        JSONObject response = zabbixApi.call(request);
        System.out.println(response);
    }

    private static void getTriggers() {
        ZabbixApi zabbixApi = login();
        Request request = RequestBuilder.newBuilder().method("trigger.get").build();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("output", "extend");
        params.put("selectFunctions", "extend");
        request.setParams(params);
        request.setId(1);
        System.out.println(JSON.toJSONString(request));
        JSONObject response = zabbixApi.call(request);
        String result = response.getString("result");
        JSONArray ja = JSON.parseArray(result);
        System.out.println("=================================================================================================");
        for (int i = 0; i < 100; i++) {
            JSONObject jo = (JSONObject) ja.get(i);
            Trigger trigger = jo.toJavaObject(Trigger.class);
            System.out.println("序号："+i+"; Trigger："+trigger);
        }
        System.out.println("=================================================================================================");
    }

    private static ZabbixApi login() {
        ZabbixApi zabbixApi = new DefaultZabbixApi(url);
        zabbixApi.init();
        boolean login = zabbixApi.login("deploy", "uled.123");
        System.out.println("login:" + login);
        return zabbixApi;
    }


    public static boolean equals(String str1, String str2) {
        return ((str1 == null) ? false : (str2 == null) ? true : str1
                .equals(str2));
    }

}
