
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static String data(String path){
        String tmp="";
        try{
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                tmp+=sc.nextLine();
            }

        }catch(Exception e){
            System.out.println("Loi");
            return tmp;
        }
        return tmp;
    }

    
    public static void main(String[] args) {
        /*
        - Get specific files by extensions from a given folder.
        - Check if a file or directory specified by pathname exists or not.
        - Check if given pathname is a directory or a file.
        - Append text to an existing file.
        - Find the longest word in a text file.
        */ 
        String path="./test";
        // Cau 1
        
        System.out.println("Enter a file name: ");
        boolean exists=false;
        String check = System.console().readLine();
        try {
            File file = new File(path);
            if(file.isDirectory()){
                File[] listFile= file.listFiles();
                for(File f: listFile){
                    if(check.equals(f.getName())){
                        exists=true;
                        break;
                    }
                }
            }
            if(!exists){
                System.out.println("File not found");
            }else{
                System.out.println("File found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Cau 2
        //kiem tra duong dan la thu muc hay tep tin
        String path1="./test//a.txt";
        try {
            File file = new File(path1);
            if(file.isDirectory()){
                System.out.println("Thu muc");
            }else if(file.isFile()){
                System.out.println("Tap tin");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Noi van ban
        path1="./test//test1";
        String data="";
        try{
            File file = new File(path1);
            if(file.isDirectory()){
                File[] listFile= file.listFiles();
                for(File f: listFile){
                    String path_tmp=path1+"//"+f.getName();
                    data+=data(path_tmp);
                }
            }else{
                data+=data(path1);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        //In van ban
        try{
            File file = new File(path);
            File[] listFile= file.listFiles();
            for(File f: listFile){
                if(f.isFile()){
                    FileWriter fw = new FileWriter(f);
                    fw.write(data);
                    fw.close();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        //Tim chuoi lon nhat
        path1 = "./test//a.txt";
        try{
            File file = new File(path1);
            Scanner input = new Scanner(file);
            int max=0;
            while(input.hasNext()){
                String tmp=input.next();
                if(tmp.length()>max){
                    max=tmp.length();
                }
            }
            System.out.println("Chuoi lon nhat la: "+max);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
