package top.meethigher.jmeter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class App {

    private static final Logger log= LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        try {
            generateCSV();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void generateCSV() throws Exception {
        log.info("开始生成csv");
        int max = 1000;
        String comma = ",";
        FileOutputStream fos = new FileOutputStream("data.csv");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        fos.write((String.join(comma, list) + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
        try {
            for (int a = 1; a <= max; a++) {
                for (int b = 1; b <= max; b++) {
                    list.clear();
                    list.add(String.valueOf(a));
                    list.add(String.valueOf(b));
                    fos.write((String.join(comma, list) + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
                }
            }
        } finally {
            fos.close();

        }
        log.info("成功生成csv");
    }
}
