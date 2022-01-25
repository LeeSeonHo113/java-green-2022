package data00;

import java.util.Scanner;

public class MainApp {
    private String arrPlandTime;
    private String depAirportNm;
    private String depPlandTime;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String arrPlandTime = sc.nextLine();
        String depAirportNm = sc.nextLine();
        String depPlandTime = sc.nextLine();

        System.out.printf("출발일을 입력하세요. : ", arrPlandTime);
        System.out.println("(ex)20220126");

        System.out.println("출발지를 입력하세요. : ");
        System.out.println("무안, 광주, 군산, 여수, 원주, 양양, 제주, 김해, 사천, 울산, 인천, 김포, 포항, 대구");
        System.out.println();
    }
}
