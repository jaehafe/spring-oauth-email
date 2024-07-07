package com.example.oauth.common;

public interface ResponseMessage {

    String SUCCESS = "Success";
    String VALIDATION_FAIL = "Validation failed";
    String DUPLICATE_ID = "Duplicate id";
    String SIGN_IN_FAIL = "Login information mismatch";
    String CERTIFICATION_FAIL = "Certification failed";
    String CERTIFICATION_NULL = "Certification entity is null";

    String MAIL_FAIL = "Message Send failed";
    String DATABASE_ERROR = "Database error  ";
}
