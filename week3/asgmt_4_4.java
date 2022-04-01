import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class asgmt_4_4 {
    public static void main(String[] args) {
        File target;
        File files[] = new File[0];
        String option = "";
        if (args.length > 1) {
            option = args[0];
            target = new File(args[1]);
            files = target.listFiles();
        } else {
            target = new File(args[0]);
            files = target.listFiles();
        }

        if (target.exists()) {
            // option -l /////
            if (option.equals("-l")) {
                String ext = "";
                long size = 0;
                System.out.println("option -l " + args.length);
                for (int i = 0; i < files.length; i++) {
                    ext = files[i].toString().substring(files[i].toString().lastIndexOf(".") + 1);
                    size = files[i].length();
                    System.out.println("file: " + files[i] + " byte :" + size);
                }
                System.exit(0);
            }

            // option -r /////
            if (option.equals("-r")) {
                showFilesInDIr(target.toString());
                System.exit(0);
            }

            // non option /////
            else {
                System.out.println("option non " + args.length);
                for (int i = 0; i < files.length; i++) {
                    System.out.println("file: " + files[i]);
                }
                System.exit(0);
            }
        } else
            System.out.println("File not fount");
    }

    public static void showFilesInDIr(String target) {
        File dir = new File(target);
        File files[] = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isDirectory()) {
                showFilesInDIr(file.getPath());
            } else {
                System.out.println("file: " + file);
            }
        }
    }
}
