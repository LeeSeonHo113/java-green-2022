package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String add = "http://lalacoding.site/init/post";
            URL url = new URL(add);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return;
            }
            System.out.println(dto.getData().size());
            // dto.getData().get(0).getUser().setId(5000); // 회원번호 변경
            for (int i = 0; i < dto.getData().size(); i++) {
                System.out.println("Id : " + dto.getData().get(i).getId());
                System.out.println("==================================================");
                System.out.println("title : " + dto.getData().get(i).getTitle());
                System.out.println("==================================================");
                System.out.println("content : " + dto.getData().get(i).getContent());
                System.out.println("==================================================");
                System.out.println("회원번호 : " + dto.getData().get(i).getUser().getId());
                System.out.println("==================================================");
                System.out.println("유저이름 : " + dto.getData().get(i).getUser().getUsername());
                System.out.println("==================================================");
                System.out.println("비밀번호 : " + dto.getData().get(i).getUser().getPassword());
                System.out.println("==================================================");
                System.out.println("이메일 : " + dto.getData().get(i).getUser().getEmail());
                System.out.println("==================================================");
                System.out.println("생성일 : " + dto.getData().get(i).getUser().getCreated());
                System.out.println("==================================================");
                System.out.println("업데이트일 : " + dto.getData().get(i).getUser().getUpdated());
                System.out.println("==================================================");
                System.out.println("created : " + dto.getData().get(i).getCreated());
                System.out.println("==================================================");
                System.out.println("updated : " + dto.getData().get(i).getUpdated());
                System.out.println("==================================================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}