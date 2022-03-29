import java.util.Scanner;

public class asgmt_3_3 {

    // 기능: 성적 통계 구하기
    // 입력: 인원수, 한 반의 국어 성적(int)
    // 출력: score 내림차순
    // 최고점, 최하점
    // 평균(double), 평균보다 높은/낮은 인원수
    // 등급별(0-9, 10-19, ..., 90-100) 인원수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int max = 0, min = 100;
        double avg = 0;
        int[] cnt = new int[10]; // 점수별 인원
        int[] cnt2 = new int[2]; // 0 = 평균점수 이하, 1 = 평균점수 이상

        System.out.print("인원수 입력: ");
        num = sc.nextInt();
        int[] score = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("점수 입력: ");
            score[i] = sc.nextInt();
            avg += score[i];
        }

        selectionSort(score); // 정렬
        max = score[num - 1];
        min = score[0];
        avg /= num;

        for (int i = 0; i < num; i++) { // 각 점수별 인원수
            if ((double) score[i] >= avg) {
                cnt2[1]++;
            } else
                cnt2[0]++;
            switch (score[i] / 10) {
                case 0:
                    cnt[0]++;
                    break;
                case 1:
                    cnt[1]++;
                    break;
                case 2:
                    cnt[2]++;
                    break;
                case 3:
                    cnt[3]++;
                    break;
                case 4:
                    cnt[4]++;
                    break;
                case 5:
                    cnt[5]++;
                    break;
                case 6:
                    cnt[6]++;
                    break;
                case 7:
                    cnt[7]++;
                    break;
                case 8:
                    cnt[8]++;
                    break;
                case 9:
                case 10:
                    cnt[9]++;
                    break;
                default:
                    cnt[10]++;
                    break;
            }
        }
        System.out.println();
        System.out.println("******결과******");
        for (int i = 0; i < cnt.length - 2; i++) {
            if (cnt[i] > 0) {
                System.out.println((i * 10) + "~" + ((i * 10) + 9) + "점대 인원수: " + cnt[i] + "명");
            }
        }
        if (cnt[cnt.length - 1] > 0) {
            System.out.println("90~100점대 인원수: " + cnt[cnt.length - 1] + "명");

        }
        System.out.println("평균 이상: " + cnt2[1] + "명");
        System.out.println("평균 이하: " + cnt2[0] + "명");
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
        System.out.println("AVG: " + avg);

        sc.close();
    }

    private static void selectionSort(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
        }
    }

}
