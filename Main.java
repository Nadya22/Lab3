public class Main {

    public static void main (String[] args){
        String src = "C:\\Laborotory\\Lab38\\src\\1.txt";
        String dst = "C:\\Laborotory\\Lab38\\src\\2.txt";
        FileManager fileManager;
        try{
            fileManager =new FileManager();
            fileManager.copyFile(src,dst);
            System.out.println("Копирование прошло успешно");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}