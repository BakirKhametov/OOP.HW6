package org.example;

import org.example.hw6.user.Worker;
import org.example.hw6.controller.WorkerController;
import org.example.hw6.view.WorkerView;

public class Main {
    public static void main(String[] args) {

        Worker model  = extractingWorkerFromDatabase();
        WorkerView view = new WorkerView();
        WorkerController controller = new WorkerController(model, view);
        controller.updateView();
        controller.setWorkerName("Alexandr");
        controller.updateView();
    }

    private static Worker extractingWorkerFromDatabase(){
        Worker worker = new Worker();
        worker.setName("Dmitry");
        worker.setId(722);
        return worker;
    }
}