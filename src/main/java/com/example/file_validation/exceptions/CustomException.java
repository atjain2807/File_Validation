package com.example.file_validation.exceptions;

public class CustomException extends RuntimeException {
    public String duplicateFoundException(){
        return "duplicate Found!!!";
    }

    public String primaryKeyMissingException(){
        return "primary key missing!!!";
    }

    public String missingForeignKeyException(){
        return "missing reference key";
    }

    public String nullFoundException(){
        return "null Found!!";
    }

}
