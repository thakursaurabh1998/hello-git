import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class FileCrawler {
    public static void writeToCSV(ArrayList<File> files) {
        try {
            FileWriter pw = new FileWriter(new File("results.csv"), true);
            String str = "File Name,File Path\n";
            for(int i=0;i<files.size();i++){
                str += files.get(i).getName();
                str += ",";
                str += files.get(i).toString();
                str += "\n";
            }
            for (int i = 0; i < str.length(); i++) {
                pw.append(str.charAt(i));
            }
            pw.close();
            System.out.println("Your CSV file(results.csv) is created.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<File> crawl(String path) {
        try {
            ArrayList<File> files = new ArrayList<>();
            File dir = new File(path);
            File[] directoryListing = dir.listFiles();
            if (directoryListing != null) {
                for (File child : directoryListing) {
                    if (child.isFile()) {
                        files.add(child);
                    }
                    if (child.isDirectory()) {
                        ArrayList<File> temp = new ArrayList<>(crawl(child.toString()));
                        for(int i=0;i<temp.size();i++)
                            files.add(temp.get(i));
                    }
                }
            } else {
                System.out.println("Not found");
            }
            return files;

        } catch (Exception e) {
            System.out.println(e);
            return new ArrayList<File>();
        }
    }

    public static void main(String[] args) {
        try{ 
            Scanner in = new Scanner(System.in);
            File file = new File("abc.txt");
            if(file.exists()==false)
                file.createNewFile();
            FileOutputStream fout = new FileOutputStream(file);
            System.out.println("How many directories do you want to traverse? ");
            int n = in.nextInt();
            String paths = "";
            in.nextLine();
            while(n>0){
                paths += in.nextLine();
                paths += "\n";
                n--;
            }
            for(int i=0;i<paths.length();i++)
                fout.write(paths.charAt(i));
            String line;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                writeToCSV(crawl(line));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}