package app.data;

import app.entity.Product;
import app.utils.Constants;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    // Используйте модификатор доступа private для поля list
    private List<Product> list = new DataRepository().getData();

    // В методе search нужно указать тип параметра и его имя
    public int search(String search) {
        // Необходимо правильно преобразовать строку в число
        double priceSearch = Double.parseDouble(search);
        for (int i = 0; i < list.size(); i++) {
            // Используйте метод equals для сравнения чисел с плавающей точкой
            if (list.get(i).getPrice() == priceSearch)
                return i;
        }
        return -1;
    }

    public String formOutput() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);
        for (Product product : list)
            // Добавьте пропущенные параметры в метод String.format
            sb.append(String.format("%d. %s%n",
                    count.getAndIncrement(),
                    product.toString()));
        return "Initial data:\n" + sb;
    }

    public String formOutput(String search, int index) {
        // Правильно преобразуйте строку в число
        double priceSearch = Double.parseDouble(search);
        if (index == -1)
            return "No data.\n";
        else
            // Укажите, что должно быть вместо пропущенных параметров
            return String.format("Product: %s, price is %s %.2f%n",
                    list.get(index).getName(), Constants.CURRENCY,
                    list.get(index).getPrice());
    }
}
