package app;

import app.data.DataHandler;
import app.ui.UIOperator;

public class App {

    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        UIOperator operator = new UIOperator();
        String search = operator.getSearchValue();
        int index = handler.search(search);
        operator.getOutput(handler.formOutput());
        operator.getOutput(handler.formOutput(search, index));
    }
}
