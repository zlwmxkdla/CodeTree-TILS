public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        double weight = 13;          // 지구에서의 무게 (kg)
        double moonRatio = 0.165;    // 달에서의 중력 비율

        double moonWeight = weight * moonRatio;

        // 소수점 여섯째 자리까지 출력 (식과 결과 모두 형식 지정)
        System.out.printf("%.0f * %.6f = %.6f%n", weight, moonRatio, moonWeight);
    }
}