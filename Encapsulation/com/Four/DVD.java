package Four;

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 5; // 5 days
    }

    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD not available.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}