package com.redis.test;

import redis.clients.jedis.Jedis;

public class Redis_test2 {
	public static void main(String[] args) {
		
		
	}
	private static String url="10.0.127.137";
	private static int port=6739;
	private static String pass="1234";
	private static void stringRedis() {
		Jedis jedis=new Jedis(url,port);
		jedis.auth(pass);
		
		jedis.set("student", "{'id':'1','name':'Å·Ñô'}");
		String json=jedis.get("student");
		jedis.append("stu2", "ctt");
		
		jedis.mset("");
		
		jedis.close();
	}
	
	

}
