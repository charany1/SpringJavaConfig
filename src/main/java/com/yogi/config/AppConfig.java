package com.yogi.config;


import com.yogi.entities.BaseBallGame;
import com.yogi.entities.Foo;
import com.yogi.entities.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * Created by danchara on 3/30/2017.
 */

@Configuration
@Import({InfrastructureConfig.class,FooConfig.class})
public class AppConfig {

    /**
     *
     */

    /**
     *
     * @return a bean BaseBallGame
     * <p>Name in context.getBean("baseBallGame",BaseBallGame.class) i.e. name of function</p>
     */
    @Bean
    public BaseBallGame baseBallGame(DataSource dataSource,Foo foo){

        BaseBallGame baseBallGame = new BaseBallGame();
        baseBallGame.setDataSource(dataSource);
        baseBallGame.setFoo(foo);

        System.out.println(baseBallGame.getFoo().getName());
        return baseBallGame;
    }


}
