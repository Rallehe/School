package se.yrgo.apartment.data;

public class ApartmentNotFoundException extends Exception{
    public ApartmentNotFoundException(String message) {
        super(message);
    }
}
