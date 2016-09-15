package com.androidarchitecture.basemvp.domain.model;

import java.io.Serializable;

/**
 * Created by junior on 27/08/16.
 */
public class MainModel implements Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
