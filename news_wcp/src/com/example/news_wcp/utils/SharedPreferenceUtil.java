package com.example.news_wcp.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceUtil {

	private static SharedPreferences sp;
	
	public static void putString(Context context, String key, String text){
		if(sp == null){
			sp = context.getSharedPreferences("CONFIG", Context.MODE_PRIVATE);
		}
		
		sp.edit().putString(key, text).commit();
	}
	
	public static void putBoolean(Context context, String key, boolean b){
		if(sp == null){
			sp = context.getSharedPreferences("CONFIG", Context.MODE_PRIVATE);
		}
		sp.edit().putBoolean(key, b).commit();
	}
	
	public static String getString(Context context, String key){
		
		if(sp == null){
			sp = context.getSharedPreferences("CONFIG", Context.MODE_PRIVATE);
		}
		return sp.getString(key, null);
		
	}
	
	public static Boolean getBoolean(Context context, String key, boolean defValue){
		
		if(sp == null){
			sp = context.getSharedPreferences("CONFIG", Context.MODE_PRIVATE);
		}
		return sp.getBoolean(key, defValue);
		
	}
	
}
