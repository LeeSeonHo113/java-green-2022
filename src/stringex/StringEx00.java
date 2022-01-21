package stringex;

import java.util.Scanner;

class 정보지 {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public 정보지(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// 이름 - 전화번호 - 성별 - 나이
public class StringEx00 {
    public static void main(String[] args) { // 메인 시작
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        String[] tokens = data.split("-");

        for (int i = 0; i < tokens.length; i++) {
        }

        if (tokens[0].equals("A01")) {

            String name = tokens[1];
            String tel = tokens[2];
            char gender = tokens[3].charAt(0);
            tokens[4] = tokens[4].trim();
            int age = Integer.parseInt(tokens[4]);

            정보지 doc1 = new 정보지(
                    name,
                    tel,
                    gender,
                    age);

            System.out
                    .println("이름 : " + doc1.getName() + "전화번호 : " + doc1.getTel() + "성별 : " + doc1.getGender() + "나이 : "
                            + doc1.getAge());
        } else {
            System.out.println("프로그램을 종료합니다.");
        }
    } // 메인 끝
}

// 홍길동 - 0102222 - 남 - 25