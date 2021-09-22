package com.trailblazer.data;
import lombok.Data;

public class QueryLimit {

    private int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}