package service;

import entities.History;
import entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Workerservice {
    public void creat(Scanner scanner,ArrayList<Worker> workers){

            System.out.println("Moi ban nhap ten : ");
            String name = scanner.nextLine();
            System.out.println("Moi ban nhap tuoi : ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Moi ban nhap luong : ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Moi ban nhap noi lam viec : ");
            String workPlace = scanner.nextLine();
            Worker worker = new Worker(name,age,salary,workPlace);
            workers.add(worker);

        System.out.println(workers);
    }
    public Worker findById(String id , ArrayList<Worker> workers){
        for (Worker worker: workers){
            if(worker.getId().equalsIgnoreCase(id));
            return worker;
        }
        return null;
    }
    public void modifySalary (Scanner scanner, ArrayList<Worker> workers, boolean check, ArrayList<History> histories){
        HistoryService historyService = new HistoryService();
        System.out.println("Moi ban nhap id cua cong nhan : ");
        String id = scanner.nextLine();
        Worker worker = findById(id,workers);
        if(worker==null){
            System.out.println("Khong tim thay cong nhan co id "+id);
        } else {
            System.out.println("Moi ban nhap so tien : ");
            double newSal = Double.parseDouble(scanner.nextLine());
            if(check) {
                worker.setSalary(worker.getSalary() + newSal);
                historyService.InsertHistory("UP",histories,worker);
            }
            else {
                worker.setSalary(worker.getSalary() - newSal);
                historyService.InsertHistory("Down", histories, worker);
            }
        }
    }

}






