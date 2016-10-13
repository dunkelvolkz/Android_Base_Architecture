package com.androidarchitecture.basemvp.network.model;

import com.androidarchitecture.basemvp.domain.MainEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by junior on 27/08/16.
 */
public class MainResponse {
    private String status;
    private Result result;


    static class Result {
        List<MainEntity> problems;
    }

    public String getStatus() {
        return status;
    }

    public List<MainEntity> getProblems() {
        return result.problems;
    }
}
