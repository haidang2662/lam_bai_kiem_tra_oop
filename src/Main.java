import entities.History;
import entities.Worker;
import service.Workerservice;
import view.Menu;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<History> histories = new ArrayList<>();
        Menu menu = new Menu();
        menu.diplayMenuHome(scanner,workers,histories);

    }
}