package rectPackage;

import java.util.Comparator;

public class areaSort implements Comparator<rect> {

    @Override
    public int compare(rect o1, rect o2) {
        int area1 = ((rect) o1).getArea();
        int area2 = ((rect) o2).getArea();

        if (area1 > area2) {
            return -1;
        } else if (area1 < area2) {
            return 1;
        } else
            return 0;
    }

}
