package com.yogi.entities;

import com.yogi.entities.Game;

import javax.sql.DataSource;

/**
 * Created by danchara on 3/30/2017.
 */
public class BaseBallGame implements Game{

    private Foo foo;

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String getName() {
        return new String("BaseBall");
    }

        public BaseBallGame() {

        }
}
