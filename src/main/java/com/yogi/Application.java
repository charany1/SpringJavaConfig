package com.yogi;

import com.yogi.config.AppConfig;
import com.yogi.entities.BaseBallGame;
import com.yogi.entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by danchara on 3/30/2017.
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Game game = context.getBean("baseBallGame", Game.class);
//        System.out.println(game.getName());

        for (String beanName: context.getBeanDefinitionNames()
             ) {
            System.out.println(beanName);
        }
    }
}
