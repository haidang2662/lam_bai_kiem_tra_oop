package service;

import entities.History;
import entities.Worker;

import java.util.ArrayList;

public class HistoryService {
    public void InsertHistory(String status, ArrayList<History> histories, Worker worker){
        History history = new History(worker ,status);
        history.setStatus(status);
        histories.add(history);
    }
}
