package com.philheenan.kotlinentities.remote;

/**
 * Created by phillip.heenan on 10/02/15.
 */
public interface ApiMapping<T> {

    public T modelFromMap();
}
