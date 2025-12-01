import java.io.*;
import java.util.*;

public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File("db.txt"));

            while (fileScanner.hasNext()) {
                String id = fileScanner.next();
                String pw = fileScanner.next();
                map.put(id.trim(), pw.trim());
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id: ");
            String id = input.nextLine().trim();
            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password: ");
            String pw = input.nextLine().trim();
            if (!map.get(id).equals(pw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
    }
}
