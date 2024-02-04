import java.io.*;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Записываем заголовок
            writer.println(String.join("; ", header));

            // Записываем данные
            for (int[] row : data) {
                String rowData = Arrays.stream(row)
                        .mapToObj(String::valueOf)
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                        .toString();

                writer.println(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Читаем заголовок
            String headerLine = reader.readLine();
            if (headerLine != null) {
                header = headerLine.split("; ");
            }

            // Читаем данные
            String line;
            int rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split("; ");
                if (data == null) {
                    data = new int[1][values.length];
                } else {
                    data = Arrays.copyOf(data, data.length + 1);
                }

                for (int i = 0; i < values.length; i++) {
                    data[rowCount][i] = Integer.parseInt(values[i]);
                }

                rowCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        // Вывод данных в консоль (для проверки)
        System.out.println("Header: " + Arrays.toString(header));
        for (int[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        AppData appData = new AppData(header, data);

        // Сохранение данных в файл
        appData.save("data.csv");

        // Загрузка данных из файла
        AppData loadedData = new AppData(null, null);
        loadedData.load("data.csv");

        // Вывод данных из загруженного файла в консоль
        loadedData.printData();
    }
}
