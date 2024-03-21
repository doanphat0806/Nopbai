package model;

public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        return "Khong hop le";
    }
}
