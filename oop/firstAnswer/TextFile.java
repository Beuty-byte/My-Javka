package oop.firstAnswer;

public class TextFile {
        private String fileName;
        private File file;
        private Directory directory;


    public void generate(String fileName, String content,String path){
        this.fileName = fileName;
       this.file = new File(content);
       this.directory = new Directory(path);
    }

    public void deleteFile(){
        this.fileName = null;
        this.file = null;
        this.directory = null;
    }

    public void supplementContent(String supplements){
        String content = file.getFileContent();
        content+=supplements;
        file.setFileContent(content);
    }

    public String getContent(){
       return file.getFileContent();
    }

    public void rename(String newName){
        setFileName(newName);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
