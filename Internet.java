class Registration {
    String CustomerName;
    String PancardNo;
    int VoterId;
    int LicenseNo;
    long[] TelephoneNo;

    public Registration(String CustomerName, String PancardNo, long[] TelephoneNo) {
        this.CustomerName = CustomerName;
        this.PancardNo = PancardNo;
        this.TelephoneNo = TelephoneNo;
    }

    public Registration(String CustomerName, int LicenseNo, String PancardNo, long[] TelephoneNo) {
        this.CustomerName = CustomerName;
        this.LicenseNo = LicenseNo;
        this.PancardNo = PancardNo;
        this.TelephoneNo = TelephoneNo;
    }

    public Registration(String CustomerName, int VoterId, int LicenseNo, long[] TelephoneNo) {
        this.CustomerName = CustomerName;
        this.LicenseNo = LicenseNo;
        this.VoterId = VoterId;
        this.TelephoneNo = TelephoneNo;
    }

    public Registration(String CustomerName, String PancardNo, int VoterId, long[] TelephoneNo) {
        this.CustomerName = CustomerName;
        this.PancardNo = PancardNo;
        this.VoterId = VoterId;
        this.TelephoneNo = TelephoneNo;
    }

    public String getcustomername() {
        return CustomerName;
    }

    public String getPancardNo() {
        return PancardNo;
    }

    public int getVoterId() {
        return VoterId;
    }

    public int getLicenseNo() {
        return LicenseNo;
    }

    public long[] getTelephoneNo() {
        return TelephoneNo;
    }
}

public class Internet {
    public static void main(String[] args) {
        long[] telephoneNumbers1 = { 9452425421L, 7676765252L };
        Registration c1 = new Registration("Kevin", "MN9891N", telephoneNumbers1);

        System.out.println("Congratulations " + c1.getcustomername() + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Passport number: " + c1.getPancardNo());
        System.out.print("Phone numbers: ");
        for (long phone : c1.getTelephoneNo()) {
            System.out.print(phone + " ");
        }
        System.out.println();

        long[] telephoneNumbers2 = { 2345615451L, 6763562562L };
        Registration c2 = new Registration("Julias", 123, "PN7878", telephoneNumbers2);

        System.out.println("\nCongratulations " + c2.getcustomername() + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("License number: " + c2.getLicenseNo());
        System.out.println("Pan card number: " + c2.getPancardNo());
        System.out.print("Phone numbers: ");
        for (long phone : c2.getTelephoneNo()) {
            System.out.print(phone + " ");
        }
        System.out.println();

        long[] telephoneNumbers3 = { 9634524353L, 9887373737L };
        Registration c3 = new Registration("Jammy", 765, 45453, telephoneNumbers3);

        System.out.println("\nCongratulations " + c3.getcustomername() + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Voter id: " + c3.getVoterId());
        System.out.println("License Number: " + c3.getLicenseNo());
        System.out.print("Phone numbers: ");
        for (long phone : c3.getTelephoneNo()) {
            System.out.print(phone + " ");
        }
        System.out.println();

        long[] telephoneNumbers4 = { 9867456367L, 7645367356L };
        Registration c4 = new Registration("Rose", "PN8934", 34356, telephoneNumbers4);

        System.out.println("\nCongratulations " + c4.getcustomername() + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Pan card Number: " + c4.getPancardNo());
        System.out.println("Voter id: " + c4.getVoterId());
        System.out.print("Phone numbers: ");
        for (long phone : c4.getTelephoneNo()) {
            System.out.print(phone + " ");
        }
    }
}
// OUTPUT
// Congratulations Kevin!!! you have been successfully registered for our services with the following details:
// Passport number: MN9891N
// Phone numbers: 9452425421 7676765252 

// Congratulations Julias!!! you have been successfully registered for our services with the following details:
// License number: 123
// Pan card number: PN7878
// Phone numbers: 2345615451 6763562562 

// Congratulations Jammy!!! you have been successfully registered for our services with the following details:
// Voter id: 765
// License Number: 45453
// Phone numbers: 9634524353 9887373737 

// Congratulations Rose!!! you have been successfully registered for our services with the following details:
// Pan card Number: PN8934
// Voter id: 34356
// Phone numbers: 9867456367 7645367356 