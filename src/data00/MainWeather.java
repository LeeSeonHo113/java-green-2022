package data00;

import java.util.Map;
import java.util.Scanner;

public class MainWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("날짜를 입력하세요.");
        System.out.println("ex) 20220125");
        String baseDate = sc.nextLine();

        System.out.println("시간을 입력하세요.");
        System.out.println("ex) 1000");
        String baseTime = sc.nextLine();

        Map<String, String> weatherMap = DownloadWeather.getWeatherList(baseDate, baseTime);
        System.out.println("현재 날씨는" + weatherMap.get("T1H") + "입니다!!");
    }
}