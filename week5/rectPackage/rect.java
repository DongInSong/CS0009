package rectPackage;

public class rect implements rectInterface {

    private int width;
    private int length;
    private int position_x;
    private int position_y;
    private int position_x2;
    private int position_y2;

    public rect(int width, int length, int position_x, int position_y) {
        this.width = width;
        this.length = length;
        this.position_x = position_x;
        this.position_y = position_y;
    }

    public rect(){}

    @Override
    public void getPosition() {
        position_x2 = position_x + width;
        position_y2 = position_y + length;
    }

    @Override
    public int getArea() {
        return width * length;
    }

    @Override
    public int captured(rect r1, rect r2) {
        if (r1.position_x2 < r2.position_x) {
            return 0;
        }

        if (r1.position_x > r2.position_x2) {
            return 0;
        }

        if (r1.position_y2 < r2.position_y) {
            return 0;
        }

        if (r1.position_y > r2.position_y2) {
            return 0;
        }

        int left_up_x = Math.max(r1.position_x, r2.position_x);
        int left_up_y = Math.min(r1.position_y, r2.position_y);
        int right_down_x = Math.min(r1.position_x2, r2.position_x2);
        int right_down_y = Math.max(r1.position_y2, r2.position_y2);

        int width = right_down_x - left_up_x;
        int length = right_down_y - left_up_y;

        return width * length;
    }

    public void show() {
        System.out.println(" -> 면적: " + getArea() +
                " 가로: " + width +
                " 세로: " + length +
                " x: " + position_x +
                " y: " + position_y);
    }

}