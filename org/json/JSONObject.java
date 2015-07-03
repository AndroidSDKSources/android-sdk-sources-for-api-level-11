/*    */ package org.json;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class JSONObject
/*    */ {
/* 49 */   public static final Object NULL = null;
/*    */ 
/*    */   public JSONObject()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public JSONObject(Map copyFrom) { throw new RuntimeException("Stub!"); } 
/*  6 */   public JSONObject(JSONTokener readFrom) throws JSONException { throw new RuntimeException("Stub!"); } 
/*  7 */   public JSONObject(String json) throws JSONException { throw new RuntimeException("Stub!"); } 
/*  8 */   public JSONObject(JSONObject copyFrom, String[] names) throws JSONException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int length() { throw new RuntimeException("Stub!"); } 
/* 10 */   public JSONObject put(String name, boolean value) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 11 */   public JSONObject put(String name, double value) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 12 */   public JSONObject put(String name, int value) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 13 */   public JSONObject put(String name, long value) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 14 */   public JSONObject put(String name, Object value) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 15 */   public JSONObject putOpt(String name, Object value) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 16 */   public JSONObject accumulate(String name, Object value) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 17 */   public Object remove(String name) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isNull(String name) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean has(String name) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Object get(String name) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 21 */   public Object opt(String name) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean getBoolean(String name) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean optBoolean(String name) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean optBoolean(String name, boolean fallback) { throw new RuntimeException("Stub!"); } 
/* 25 */   public double getDouble(String name) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 26 */   public double optDouble(String name) { throw new RuntimeException("Stub!"); } 
/* 27 */   public double optDouble(String name, double fallback) { throw new RuntimeException("Stub!"); } 
/* 28 */   public int getInt(String name) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 29 */   public int optInt(String name) { throw new RuntimeException("Stub!"); } 
/* 30 */   public int optInt(String name, int fallback) { throw new RuntimeException("Stub!"); } 
/* 31 */   public long getLong(String name) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 32 */   public long optLong(String name) { throw new RuntimeException("Stub!"); } 
/* 33 */   public long optLong(String name, long fallback) { throw new RuntimeException("Stub!"); } 
/* 34 */   public String getString(String name) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 35 */   public String optString(String name) { throw new RuntimeException("Stub!"); } 
/* 36 */   public String optString(String name, String fallback) { throw new RuntimeException("Stub!"); } 
/* 37 */   public JSONArray getJSONArray(String name) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 38 */   public JSONArray optJSONArray(String name) { throw new RuntimeException("Stub!"); } 
/* 39 */   public JSONObject getJSONObject(String name) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 40 */   public JSONObject optJSONObject(String name) { throw new RuntimeException("Stub!"); } 
/* 41 */   public JSONArray toJSONArray(JSONArray names) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 42 */   public Iterator keys() { throw new RuntimeException("Stub!"); } 
/* 43 */   public JSONArray names() { throw new RuntimeException("Stub!"); } 
/* 44 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 45 */   public String toString(int indentSpaces) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 46 */   public static String numberToString(Number number) throws JSONException { throw new RuntimeException("Stub!"); } 
/* 47 */   public static String quote(String data) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.json.JSONObject
 * JD-Core Version:    0.6.0
 */