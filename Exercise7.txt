public class SubjectMarks {
    int[] marks = new int[5];

    public void storeMarks(int[] marksArray) {
        if (marksArray.length == 5) {
            for (int i = 0; i < 5; i++) {
                marks[i] = marksArray[i];
            }
        }
    }
    public void displayMarks() {
        int subNum = 1;
        for (int mark : marks) {
            System.out.println("Subject " + subNum++ + ": " + mark);
        }
    }
    public static void main(String[] args) {

        SubjectMarks obj = new SubjectMarks();
        int[] userMarks = {80, 75, 90, 85, 88};
        obj.storeMarks(userMarks);
        obj.displayMarks();
    }
}

// OUTPUT
// Subject 1: 80
// Subject 2: 75
// Subject 3: 90
// Subject 4: 85
// Subject 5: 88