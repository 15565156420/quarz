package com.redis.test;

import redis.clients.jedis.Jedis;

public class Redistest {
	public static void main(String[] args) {
		String url="10.0.127.137";
		int port=6379;
		Jedis jedis=new Jedis(url, port);
		jedis.auth("1234");
		
		System.out.println("新增"+jedis.set("dog", "狗"));
		System.out.println("新增"+jedis.get("dog"));
		
	}

}
