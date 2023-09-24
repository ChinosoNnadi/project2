package Class18;

public class userClass {
    protected String name;
    protected int mobileNumber;

    public userClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
    void userDetails() {
        System.out.println(name + " " + mobileNumber);
    }
}
    class userInfo extends userClass {
        String userAddress;
        public userInfo(String name, int mobileNumber, String userAddress) {
            super(name, mobileNumber);
            this.userAddress = userAddress;
        }
        void userDetails() {
            System.out.println(name+ " "+mobileNumber+" "+userAddress);
        }
    }
    class tester{

    public static void main(String[] args) {
        userInfo user = new userInfo("Chinoso", 70223333, "Kent");
        user.userDetails();
    }
}