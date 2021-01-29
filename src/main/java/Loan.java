public class Loan {
    private int amount;
    private String borrower;
    private boolean isPaid;
    private double interest;
    private String contactNumber;

    public Loan(int amount, String borrower, double interest, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.interest = interest;
        this.contactNumber = contactNumber;
        this.isPaid = false;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setAsPaid() {
        this.isPaid = true;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
