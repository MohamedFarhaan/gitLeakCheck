package constants;

public class Db2QueryConstants {
    public static String USERS = " USERNAME,ROLE_ID,FULL_NAME,EMAIL,PASSWORD,IS_DELETED,IS_ACTIVE,CREATED_AT,ACTIVATION_TOKEN,PARENT_ID,LOCKED_TIME,ACCOUNT_LOCKED,LOGIN_COUNT,LAST_LOGOUT_TIMESTAMP,LAST_PASSWORD_RESET_TIMESTAMP ";
    public static String ADDITIONAL_FIELDS_YEAR = " YEAR ";
    public static String ADDITIONAL_INPUT_FIELDS = " ADDITIONAL_FIELDS_YEAR_ID," +
            "DBE_ANNUAL_DUE_DATE," +
            "DBE_ANNUAL_DOC_RECEIVED_DATE," +
            "DBE_ANNUAL_COMPLETION_DATE," +
            "APPLICATION_ID ";
    public static String ADDRESS = " STREET," +
            "CITY," +
            "STATE," +
            "ZIP," +
            "COUNTRY ";
    public static String ADMIN = " USERNAME," +
            "FULL_NAME," +
            "EMAIL," +
            "PASSWORD," +
            "IS_DELETED ";
    public static String AFFILIATE = "  ";
    public static String AFFILIATE_AFFILIATE_OWNER = " AFFILIATE_ID, AFFILIATE_OWNER_ID ";
    public static String AFFILIATE_OWNER = " FULL_NAME," +
            "TITLE," +
            "OWNERSHIP_PERCENTAGE," +
            "BUSINESS_RELATIONSHIP," +
            "NAME_OF_AFFILIATE_FIRM," +
            "NUMBER_OF_EMPLOYEES," +
            "ADDRESS," +
            "CITY," +
            "STATE," +
            "ZIP," +
            "IS_DELETED," +
            "COUNTRY ";
    public static String API_USERS = " USERNAME," +
            "PASSWORD," +
            "IS_DELETED ";
    public static String APPLICATION = " BUSINESS_TYPE_ID," +
            "GENERAL_INFORMATION_ID," +
            "TAX_INFORMATION_ID," +
            "OWNERSHIP_ID," +
            "AFFILIATE_ID," +
            "CORPORATION_DETAILS_ID," +
            "CORPORATION_LLC_LLP_DETAILS_ID," +
            "LLP_PARTNERSHIP_DETAILS_ID," +
            "PARTNERSHIP_DETAILS_ID," +
            "NIGP_COMMODITY_CODES_ID," +
            "FOIA_EXEMPTION_ID," +
            "SUBMIT_DATE," +
            "APPROVAL_DATE," +
            "EXPIRY_DATE," +
            "REQUEST_FOR_MORE_INFO_DATE," +
            "APPLICATION_STATUS_ID," +
            "CERTIFICATION_NUMBER," +
            "IS_TEMP," +
            "IS_DELETED," +
            "APPLICATION_ID," +
            "START_DATE," +
            "TERMINATION_DATE," +
            "PHYSICAL_RECEIVE_DATE," +
            "RECEIVE_EMAIL," +
            "INIT_CERT_APPROVAL_DATE," +
            "BUSINESS_ID," +
            "NOTARY_RECEIVE_DATE," +
            "UPDATE_EXPIRY_DATE_FLAG," +
            "LAST_MODIFIED_DATE," +
            "IS_APPLICATION_SUBMITTED," +
            "SUBMISSION_TYPE_ID," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "DECISION_LETTER_TYPE_ID," +
            "RESUBMIT_DATE," +
            "IS_INITIAL," +
            "IS_MIGRATED," +
            "IS_PRIMARY," +
            "IS_SECONDARY," +
            "APP_LAST_MODIFIED_DATE," +
            "TEST," +
            "DOC_REQUEST_RESUBMIT_DATE," +
            "IS_MWAA," +
            "BOX_FOLDER_ID ";
    public static String APPLICATION_AFFIDAVIT = " APPLICATION_ID," +
            "AFFIDAVIT," +
            "MIME_TYPE," +
            "FILE_NAME," +
            "RECEIVE_DATE," +
            "IS_REMOVABLE," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "BOX_FILE_ID ";
    public static String APPLICATION_AFFILIATE_SUPPORT_DOCUMENT = " APPLICATION_ID," +
            "SUPPORT_DOCUMENT_ID," +
            "DOCUMENT_DATA," +
            "MIME_TYPE," +
            "FILE_NAME," +
            "AFFILIATE_OWNER_ID," +
            "RECEIVE_DATE," +
            "IS_REMOVABLE," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "BOX_FILE_ID ";
    public static String APPLICATION_APPROVAL = " APPLICATION_ID," +
            "APPROVAL," +
            "CERT_TYPE_ID," +
            "APPROVAL_DATE," +
            "START_DATE," +
            "TERMINATION_DATE ";
    public static String APPLICATION_APPROVAL_LETTER = " APPLICATION_ID," +
            "APPROVAL_LETTER," +
            "MIME_TYPE," +
            "FILE_NAME," +
            "DOCUMENT_TYPE_ID," +
            "ACTION_DATE," +
            "USER_ID," +
            "ROLE_ID," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "BOX_FILE_ID ";
    public static String APPLICATION_BUSINESS = " APPLICATION_ID," +
            "BUSINESS_ID," +
            "APPLICATION_ID_DUP," +
            "CREATED_AT ";
    public static String APPLICATION_CERT_TYPE = " APPLICATION_ID," +
            "CERT_TYPE_ID," +
            "IS_NEWLY_ADDED ";
    public static String APPLICATION_DATES = " APPLICATION_CYCLE," +
            "SUBMIT_DATE," +
            "INITIAL_CERTIFICATION_DATE," +
            "CERTIFICATION_DATE," +
            "SWAM_RECERTIFICATION_DATE," +
            "DBE_RECERTIFICATION_DATE," +
            "EXPIRY_DATE," +
            "APPLICATION_ID," +
            "APPLICATION_SEQUENCE_ID," +
            "SUBMISSION_SEQUENCE_NUMBER ";
    public static String APPLICATION_DATES_SAMPLE = " APPLICATION_CYCLE," +
            "SUBMIT_DATE," +
            "INITIAL_CERTIFICATION_DATE," +
            "CERTIFICATION_DATE," +
            "SWAM_RECERTIFICATION_DATE," +
            "DBE_RECERTIFICATION_DATE," +
            "EXPIRY_DATE," +
            "APPLICATION_ID," +
            "APPLICATION_SEQUENCE_ID," +
            "SUBMISSION_SEQUENCE_NUMBER ";
    public static String APPLICATION_DENIAL_LETTER = " APPLICATION_ID," +
            "DENIAL_LETTER," +
            "MIME_TYPE," +
            "FILE_NAME ";
    public static String APPLICATION_ETHNICITY_LOOKUP = " ETHNICITY ";
    public static String APPLICATION_HISTORY = " APPLICATION_ID," +
            "USER_ID," +
            "ROLE_ID," +
            "FIELD_NAME," +
            "CHANGED_FROM_FIELD_NAME," +
            "CHANGED_TO_FIELD_NAME," +
            "DATE," +
            "HISTORY_TYPE_ID," +
            "SECTION_INDEX," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "AUTHOR," +
            "HISTORY_PHASE_ID ";
    public static String APPLICATION_NOTE = " APPLICATION_ID," +
            "NOTE_ID ";
    public static String APPLICATION_OWNER_SUPPORT_DOCUMENT = " APPLICATION_ID," +
            "OWNER_ID," +
            "SUPPORT_DOCUMENT_ID," +
            "DOCUMENT_DATA," +
            "MIME_TYPE," +
            "FILE_NAME," +
            "RECEIVE_DATE," +
            "IS_REMOVABLE," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "BOX_FILE_ID ";
    public static String APPLICATION_REQUEST = " APPLICATION_ID," +
            "REQUEST," +
            "REQUESTED_DOCUMENT," +
            "MIME_TYPE," +
            "FILE_NAME," +
            "REQUEST_DATE," +
            "USER_ID," +
            "ROLE_ID," +
            "RECEIVE_DATE," +
            "IS_REMOVABLE," +
            "REQUEST_TYPE_ID," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "BOX_FILE_ID ";
    public static String APPLICATION_STATUS = " STATUS ";
    public static String APPLICATION_SUBMISSION = " APPLICATION_ID," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "SUBMISSION_TYPE_ID," +
            "ACTION_DATE," +
            "SUBMIT_DATE ";
    public static String APPLICATION_SUBMISSION_TYPE = " ID, TYPE ";
    public static String APPLICATION_SUPPORT_DOCUMENT = " APPLICATION_ID," +
            "DOCUMENT_DATA," +
            "MIME_TYPE," +
            "FILE_NAME," +
            "SUPPORT_DOCUMENT_ID," +
            "RECEIVE_DATE," +
            "IS_REMOVABLE," +
            "SUBMISSION_SEQUENCE_NUMBER," +
            "BOX_FILE_ID ";
}
