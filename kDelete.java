import java.io.File;

public class kDelete {
	public static void main(String[] args){

    }

    private void listFiles(String path){
        File folder = new File(path);

        if(!folder.exists() || !folder.isDirectory()){
            System.out.println(STR."\{path} does not exist or not a directory");
            return;
        }

        File[] files = folder.listFiles();

        if(files == null){
            System.out.println(STR."There is no file in \{path}");
            return;
        }

        for(File file: files){
            System.out.println(file.getName());
        }
    }
}
