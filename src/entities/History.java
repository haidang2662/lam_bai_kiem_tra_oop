package entities;

import java.time.LocalDateTime;

public class History {
    private static int autoId;
    private int id;
    private Worker worker;
    private String status;
    private LocalDateTime localDateTime;

    public History(Worker worker, String status) {
        this.id = ++autoId;
        this.worker = worker;
        this.status = status;
        this.localDateTime = LocalDateTime.now();
    }

    public History() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", worker=" + worker +
                ", status='" + status + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
