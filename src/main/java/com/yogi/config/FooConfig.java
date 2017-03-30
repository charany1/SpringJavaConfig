package com.yogi.config;

import com.yogi.entities.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by danchara on 3/30/2017.
 */

@Configuration
public class FooConfig {

    @Bean
    public Foo foo1(){
        Foo foo = new Foo();
        foo.setName("foo");
        return foo;
    }

    @Bean
    public Foo foo2(){
        Foo foo = new Foo();
        foo.setName("Foo");
        return foo;
    }
}
