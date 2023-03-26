package org.example.hw6.controller;

import org.example.hw6.user.Worker;
import org.example.hw6.view.WorkerView;

public class WorkerController {
    private Worker model;
    private WorkerView view;

    public WorkerController(Worker model, WorkerView view){
        this.model = model;
        this.view = view;
    }

    public void setWorkerName(String name){
        model.setName(name);
    }

    public String getWorkerName(){
        return model.getName();
    }

    public void setWorkerId(Integer id){
        model.setId(id);
    }

    public Integer getWorkerId(){
        return model.getId();
    }

    public void updateView(){
        view.WorkerInfo(model.getName(), model.getId());
    }
}
