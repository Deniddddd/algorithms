package app.ui;

import java.util.Scanner;

public class UIOperator {

    public String getSearchValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input price to search in format x.xx: ");
        return scanner.nextLine();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
