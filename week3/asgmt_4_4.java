import java.io.File;

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
                long last = 0;
                long size = 0;
                String type = "";
                //System.out.println("option -l " + args.length);
                for (int i = 0; i < files.length; i++) {
                    last = files[i].lastModified();
                    String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
                            .format(new java.util.Date(last));
                    size = files[i].length();
                    type = files[i].toString().substring(files[i].toString().lastIndexOf(".") + 1);
                    if (files[i].isDirectory()) {
                        type = "dir";
                    } else
                        type = "file";
                    System.out.printf("%-20s %20s %5s %5s Byte\n", files[i], date, type, size);
                    //System.out.println(files[i] + " byte: " + size + " Last: " + date + " Type: " + type);
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
                //System.out.println("option non " + args.length);
                for (int i = 0; i < files.length; i++) {
                    System.out.println("file: " + files[i]);
                }
                System.exit(0);
            }
        } else {
            System.out.println("File not fount");
            System.out.println("Dir [-1|-r] directory");
        }
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
