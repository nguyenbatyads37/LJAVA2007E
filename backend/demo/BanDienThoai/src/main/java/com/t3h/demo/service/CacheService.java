package com.t3h.demo.service;

public interface CacheService<T> {

	public void loadCache();
	public T getCache();
}
