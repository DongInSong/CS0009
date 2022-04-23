import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import rectPackage.areaSort;
import rectPackage.makeRect;
import rectPackage.rect;

public class asgmt_6_1 {
    public static void main(String[] args) {
        rect rect = new rect();
        List<rect> rectList = new ArrayList<rect>();
        makeRect make = new makeRect(rect, rectList);

        Collections.sort(rectList, new areaSort());

        for (int i = 0; i < rectList.size(); i++) {
            rectList.get(i).getArea();
            rectList.get(i).getPosition();
            System.out.println("직사각형 " + (i + 1) + "번");
            rectList.get(i).show();
        }

        int overlaped_Area = 0;
        for (int i = 0; i < rectList.size(); i++) {
            for (int j = 0; j < rectList.size(); j++) {
                overlaped_Area = rectList.get(i).captured(rectList.get(i), rectList.get(j));
                if (i != j && overlaped_Area != 0) {
                    System.out.println("----------");
                    System.out.println("직사각형 " + (i + 1) + "번의 면적: " + rectList.get(i).getArea());
                    System.out.println("직사각형 " + (j + 1) + "번의 면적: " + rectList.get(j).getArea());
                    System.out.println("겹치는 면적: " + overlaped_Area);
                }
            }
            if (i == rectList.size() - 1) {
                System.out.println("----------");
            }
        }

    }
}