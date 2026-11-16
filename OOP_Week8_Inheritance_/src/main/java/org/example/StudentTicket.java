package org.example;

public class StudentTicket extends Ticket {
    private String studentId;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentId) {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.8; // 20% discount
    }
}
