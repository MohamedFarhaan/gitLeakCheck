import com.box.sdk.BoxConfig;
import com.box.sdk.BoxDeveloperEditionAPIConnection;
import com.box.sdk.BoxFile;
import com.box.sdk.BoxFolder;
import com.box.sdk.BoxItem;
import com.box.sdk.BoxResource;
import com.box.sdk.Metadata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) throws Exception {
        Reader reader;
        BoxDeveloperEditionAPIConnection boxApirequest;
        try {
//            reader = new FileReader("./src/main/resources/vitaUatConfig.json");
//            BoxConfig boxConfig = BoxConfig.readFrom(reader);
//            boxApirequest = BoxDeveloperEditionAPIConnection.getAppEnterpriseConnection(boxConfig);
//            System.out.println("Access Token -> " + boxApirequest.getAccessToken());
//            BoxFile bf = new BoxFile(boxApirequest, "881364857741");
//            System.out.println("Parent id -> " + getParentIdOfFile("881364857741", boxApirequest));
//            System.out.println("Parent id -> " + getParentFolderNameOfFile("881364857741", boxApirequest));
//            BoxFolder boxFolder = new BoxFolder(boxApirequest, "0");
//            List<BoxFolder.Info> subFolders = getSubFolderObjects(boxFolder);
//            deleteFolders(subFolders);
//            deleteFiles(boxFolder);
            Db2Copy.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getParentIdOfFile(String fileId, BoxDeveloperEditionAPIConnection boxApirequest){
        BoxFile bf = new BoxFile(boxApirequest, fileId);
        return bf.getInfo().getParent().getID();
    }

    public static String getParentFolderNameOfFile(String fileId, BoxDeveloperEditionAPIConnection boxApirequest){
        BoxFile bf = new BoxFile(boxApirequest, fileId);
        return bf.getInfo().getParent().getName();
    }

    public static List<BoxFolder.Info> getSubFolderObjects(BoxFolder folder) {
        List<BoxFolder.Info> subFolders = new ArrayList<>();
        for (BoxItem.Info itemInfo : folder) {
            if (itemInfo instanceof BoxFolder.Info) {
                subFolders.add((BoxFolder.Info) itemInfo);
            }
        }
        return subFolders;
    }

    public static void deleteFolders(List<BoxFolder.Info> subFolders) {
        subFolders.parallelStream().forEach(folder -> {
            System.out.println("folder name -> " + folder.getName()
                    + " ( " + folder.getID() + " )");
            folder.getResource().delete(true);
        });
    }

    public static void deleteFiles(BoxFolder folder) {
        for (BoxItem.Info itemInfo : folder) {
            if (itemInfo instanceof BoxFile.Info) {
                BoxFile.Info fileInfo = (BoxFile.Info) itemInfo;
                System.out.println("file name -> " + fileInfo.getName()
                    + " ( " + fileInfo.getID() + " )");
                fileInfo.getResource().delete();
            } else if (itemInfo instanceof BoxFolder.Info) {
                BoxFolder.Info folderInfo = (BoxFolder.Info) itemInfo;
                System.out.println("folder name -> " + folderInfo.getName()
                        + " ( " + folderInfo.getID() + " )");
                deleteFiles(folderInfo.getResource());
            }
        }
    }

}
