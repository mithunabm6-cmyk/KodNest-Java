
class DLapplication {

    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserAge();
        try {
            dl.verify();
        } catch (UnderAgeException | OverAgeException e) {
            e.printStackTrace();
        }
    }
}
