import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class asgmt_4_2 {
    public static void main(String[] args) throws IOException { // 파일 삭제
        File target = new File(args[0]);
        
        if (target.exists()) {
            if (target.isDirectory()) {
                String[] files = target.list();
                if (files.length > 0) { // 빈 디렉토리 확인
                    System.out.println("Dir is Empty");
                    Files.delete(target.toPath());
                    System.out.println("Dir Deleted");
                } else {
                    System.out.println("Dir is not Empty");
                    System.out.println("Failed");
                }
            } else {
                Files.delete(target.toPath());
                System.out.println("File Deleted");
            }
        }
        else System.out.println(target+" not Found");
    }
}
