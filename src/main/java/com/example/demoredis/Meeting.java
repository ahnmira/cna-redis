package com.example.demoredis;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@RedisHash("Meetings")
public class Meeting {
	@Id
	private String id;
	private String title;
	private Date startAt;
}
