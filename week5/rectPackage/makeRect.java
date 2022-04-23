package rectPackage;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class makeRect {
    public makeRect(rect rect, List<rect> rectList) {
        try {
            File file = new File("week5/rectPackage/rectDB.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                String[] fields = record.split(" ");
                if (record.split(":") != null) {
                    fields[fields.length - 1] = fields[fields.length - 1].substring(0, fields[fields.length - 1].length() - 1); // : 지우기
                    int width = Integer.parseInt(fields[0]);
                    int length = Integer.parseInt(fields[1]);
                    int position_x = Integer.parseInt(fields[2]);
                    int position_y = Integer.parseInt(fields[3]);
                    rect = new rect(width, length, position_x, position_y);
                    rectList.add(rect);
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("no file");
        }
    }
}