package view;

import entities.History;
import entities.Worker;
import service.HistoryService;
import service.Workerservice;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void diplayMenuHome(Scanner scanner, ArrayList<Worker> workers, ArrayList<History> histories){
        while (true){
            System.out.println("=========== Worker Management =============");
            System.out.println("1 : Add Woker ");
            System.out.println("2 : Up Salary ");
            System.out.println("3 : Down Salary ");
            System.out.println("4 : Display Information Salary ");
            System.out.println("Please choose : ");
            Workerservice workerservice = new Workerservice();

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    workerservice.creat(scanner,workers);
                    break;
                case 2:
                    workerservice.modifySalary(scanner,workers,true,histories);

                    break;
                case 3:
                    workerservice.modifySalary(scanner,workers,false,histories);
                    break;
                case 4 :
                    System.out.println(histories);
                    break;
                case 5 :
                    break;

            }
            System.out.println("Do you want to continue(Y/N) : ");
            String select = scanner.nextLine();
            if(select.equalsIgnoreCase("N"))
                break;

        }


    }
}
