package chap_09;

import java.util.Scanner;

public class Ex09_10 {
    public static void main(String[] args) {

        // 순차적 프로그래밍 예시

        Scanner s = new Scanner(System.in);
        int coffee;

        System.out.printf("어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙");
        coffee = s.nextInt();

        System.out.printf("\n# 1. 뜨거운 물을 준비한다\n");
        System.out.printf("# 2. 종이컵을 준비한다\n");

        switch (coffee) {
            case 1 :
                System.out.printf("# 3. 보통 커피를 탄다\n"); break;
            case 2:
                System.out.printf("# 3. 설탕 커피를 탄다\n"); break;
            case 3 :
                System.out.printf("# 3. 블랙 커피를 탄다\n"); break;
            default :
                System.out.printf("# 3. 아무거나 탄다\n"); break;
        }

        System.out.printf("# 4. 물을 붓는다\n");
        System.out.printf("1# 5. 스푼으로 저어서 녹인다\n");
        System.out.printf("손님 커피 나왔습니다..\n");
    }
}
