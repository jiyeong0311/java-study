package chap_06;

public class _Quiz_6 {

    public static String getHiddenData (String data, int index){
        String hiddenData = data.substring(0,index);    // 나코딩 -> 나
//        for (int i = 0; i < data.length() - index; i++) {
        for (int i = 0; i < data.length() - index; i++){
            hiddenData += "*";  // 나**
    }
        return hiddenData;

    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-123456";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));   // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("이름 : " + getHiddenData(phone, 9));
    }

String board = "번호,제목,내용,글쓴이";
String[] arr = board.split(",");




}

