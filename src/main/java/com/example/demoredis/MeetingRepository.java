package com.example.demoredis;

import org.springframework.data.repository.CrudRepository;

public interface MeetingRepository extends CrudRepository<Meeting, String> {

}


// StringRedisTemplate
//MessageListenerAdaper