package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import data00.WeatherDto.Response.Body.Items.Item;

public class DownloadWeather {
    public static Map<String, String> getWeatherList(String baseDate, String baseTime) {
        Map<String, String> WeatherMap = new HashMap<>();

        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=%2BPdFyDtb1rWEniBuuWkok4KLv1Pl9edceG8MDtcRYDXAi%2B4GlbiyF1zfVayCTi1tQ1TB%2B6fJT8ToUAhUocOWgg%3D%3D&pageNo=1&numOfRows=10&dataType=JSON&base_date=20220126&base_time=1700&nx=97&ny=75"
                            + "&base_date" + baseDate + "&base_time=" + baseTime + "&nx=97&ny=75&type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                WeatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }
            return WeatherMap;
        } catch (Exception e) {
            System.out.println("날씨 조회중 오류가 발생했습니다.");
            e.getStackTrace();
        }
        return null;
    }
}