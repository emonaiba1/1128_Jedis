package com.atguigu.test;

import redis.clients.jedis.Jedis;

public class TestJedis {
  public void test() {
	  Jedis jedis = new Jedis("192.168.0.143", 6379, 20000);
	  String ping = jedis.ping();
	  System.out.println(ping);
	   
  }
}
