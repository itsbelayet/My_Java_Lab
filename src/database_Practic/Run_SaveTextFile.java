package database_Practic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run_SaveTextFile {

    public static void main(String[] args) throws IOException, SQLException {
        String SQL="INSERT INTO StoreTextFiles (file_name,file_size,file_ext,file_content) VALUES(?,?,?,?)";
        Path dir = Paths.get("DataTest");

        try(Stream<Path> list = Files.list(dir); Connection connection=SaveTextFile.getConnection();
            PreparedStatement ps=connection.prepareStatement(SQL)){

            List<Path> pathList=list.collect(Collectors.toList());
            System.out.println("Following files are saved in Database..");

            for (Path path : pathList) {
                System.out.println(path.getFileName());
                File file = path.toFile();
                String fileName=file.getName();
                long fileLength=file.length();
                long fileSize=fileLength/1024;

                ps.setString(1,fileName);
                ps.setLong(2,fileSize);
                ps.setString(3,fileName.substring(fileName.lastIndexOf(".")+1));
                ps.setCharacterStream(4,new FileReader(file));
                ps.addBatch();
            }
            System.out.println("- - - - - - - - - - - - - - - - - - -");
            int[] executeBatch = ps.executeBatch();
            for (int i : executeBatch) {
                System.out.println(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
