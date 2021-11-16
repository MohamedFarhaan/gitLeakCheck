import constants.Db2QueryConstants;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Db2Copy {

    public static final String outputDirectory = "/Users/pasha/Documents/QA_DB_TABLE_DATA/";

    public static void process() throws Exception {
        String tableName = "ADDITIONAL_INPUT_FIELDS";
//        getDataQueryForTable(tableName);
        insertDataIntoTable(new File("/Users/pasha/Documents/QA_DB_TABLE_DATA/" + tableName + ".csv"));
    }

    public static void getDataQueryForTable(String tableName) {
        System.out.println("SELECT " + getColumnNameForTables(tableName) + "from " + tableName + ";");
    }

    public static void insertDataIntoTable(File file) throws Exception {
        try {
            String tableName = file.getName().substring(0, file.getName().lastIndexOf('.'));
            File outputFile = new File(outputDirectory + tableName + ".txt");
            outputFile.createNewFile();
            FileReader fileReader = new FileReader(file);
            FileWriter writer = new FileWriter(outputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] values = null;
            String query = null;
            String columNames = null;
            boolean firstLine = true;
            int lineCount = 0;
            while((line = bufferedReader.readLine()) != null) {
                if(firstLine) {
                    firstLine = false;
                    columNames = getColumnNameForTables(tableName);
                } else {
                    line = line.replace("(null)", "null");
                    query = "INSERT INTO " + tableName + "(" + columNames + ") VALUES(" + line + ");";
                    writer.write(query + "\n");
                    lineCount++;
                }
            }
            writer.close();
            System.out.println("Total " + lineCount + " lines wrote to file " + outputFile.getAbsolutePath());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getColumnNameForTables(String tableName) {
        String columnName = null;
        switch (tableName.toUpperCase()) {
            case "USERS":
                columnName = Db2QueryConstants.USERS;
                break;
            case "ADDITIONAL_FIELDS_YEAR":
                columnName = Db2QueryConstants.ADDITIONAL_FIELDS_YEAR;
                break;
            case "ADDITIONAL_INPUT_FIELDS":
                columnName = Db2QueryConstants.ADDITIONAL_INPUT_FIELDS;
                break;
            case "ADDRESS":
                columnName = Db2QueryConstants.ADDRESS;
                break;
            case "ADMIN":
                columnName = Db2QueryConstants.ADMIN;
                break;
            case "AFFILIATE":
                columnName = Db2QueryConstants.AFFILIATE;
                break;
            case "AFFILIATE_AFFILIATE_OWNER":
                columnName = Db2QueryConstants.AFFILIATE_AFFILIATE_OWNER;
                break;
            case "AFFILIATE_OWNER":
                columnName = Db2QueryConstants.AFFILIATE_OWNER;
                break;
            case "API_USERS":
                columnName = Db2QueryConstants.API_USERS;
                break;
            case "APPLICATION":
                columnName = Db2QueryConstants.APPLICATION;
                break;
            case "APPLICATION_AFFIDAVIT":
                columnName = Db2QueryConstants.APPLICATION_AFFIDAVIT;
                break;
            case "APPLICATION_AFFILIATE_SUPPORT_DOCUMENT":
                columnName = Db2QueryConstants.APPLICATION_AFFILIATE_SUPPORT_DOCUMENT;
                break;
            case "APPLICATION_APPROVAL":
                columnName = Db2QueryConstants.APPLICATION_APPROVAL;
                break;
            case "APPLICATION_APPROVAL_LETTER":
                columnName = Db2QueryConstants.APPLICATION_APPROVAL_LETTER;
                break;
            case "APPLICATION_BUSINESS":
                columnName = Db2QueryConstants.APPLICATION_BUSINESS;
                break;
            case "APPLICATION_CERT_TYPE":
                columnName = Db2QueryConstants.APPLICATION_CERT_TYPE;
                break;
            case "APPLICATION_DATES":
                columnName = Db2QueryConstants.APPLICATION_DATES;
                break;
            case "APPLICATION_DATES_SAMPLE":
                columnName = Db2QueryConstants.APPLICATION_DATES_SAMPLE;
                break;
            case "APPLICATION_DENIAL_LETTER":
                columnName = Db2QueryConstants.APPLICATION_DENIAL_LETTER;
                break;
            case "APPLICATION_ETHNICITY_LOOKUP":
                columnName = Db2QueryConstants.APPLICATION_ETHNICITY_LOOKUP;
                break;
            case "APPLICATION_NOTE":
                columnName = Db2QueryConstants.APPLICATION_NOTE;
                break;
            case "APPLICATION_OWNER_SUPPORT_DOCUMENT":
                columnName = Db2QueryConstants.APPLICATION_OWNER_SUPPORT_DOCUMENT;
                break;
            case "APPLICATION_REQUEST":
                columnName = Db2QueryConstants.APPLICATION_REQUEST;
                break;
            case "APPLICATION_STATUS":
                columnName = Db2QueryConstants.APPLICATION_STATUS;
                break;
            case "APPLICATION_SUBMISSION":
                columnName = Db2QueryConstants.APPLICATION_SUBMISSION;
                break;
            case "APPLICATION_SUBMISSION_TYPE":
                columnName = Db2QueryConstants.APPLICATION_SUBMISSION_TYPE;
                break;
            case "APPLICATION_SUPPORT_DOCUMENT":
                columnName = Db2QueryConstants.APPLICATION_SUPPORT_DOCUMENT;
                break;
            default: break;
        }
        return  columnName;
    }
}
