class EventRegistration {
    String name;
    String nameOfEvent;
    double registrationFee;

    EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public void registerEvent() {
        if (nameOfEvent.equals("ShakeALeg")) registrationFee = 100;
        else if (nameOfEvent.equals("Sing&Win")) registrationFee = 150;
        else if (nameOfEvent.equals("Actathon")) registrationFee = 70;
        else if (nameOfEvent.equals("PlayAway")) registrationFee = 130;

        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
    }
}

class SingleEventRegistration extends EventRegistration {
    int participantNo;

    SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    public void registerEvent() {
        if (nameOfEvent.equals("ShakeALeg")) registrationFee = 100;
        else if (nameOfEvent.equals("Sing&Win")) registrationFee = 150;
        else if (nameOfEvent.equals("PlayAway")) registrationFee = 130;

        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are participant no: " + participantNo);
    }
}

class TeamEventRegistration extends EventRegistration {
    int noOfParticipants;
    int teamNo;

    TeamEventRegistration(String name, String nameOfEvent, int teamNo, int noOfParticipants) {
        super(name, nameOfEvent);
        this.teamNo = teamNo;
        this.noOfParticipants = noOfParticipants;
    }

    public void registerEvent() {
        if (nameOfEvent.equals("ShakeALeg")) registrationFee = 50 * noOfParticipants;
        else if (nameOfEvent.equals("Sing&Win")) registrationFee = 60 * noOfParticipants;
        else if (nameOfEvent.equals("Actathon")) registrationFee = 80 * noOfParticipants;
        else registrationFee = 100 * noOfParticipants;

        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are team no: " + teamNo);
    }
}

public class Talent {
    public static void main(String[] args) {
        SingleEventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        participant1.registerEvent();

        TeamEventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 1, 5);
        team1.registerEvent();

        SingleEventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        participant2.registerEvent();
    }
}


// OUTPUT
// Thank You Jenny for your participation. Your registration fee is: 150.0
// You are participant no: 1
// Thank You Aura for your participation. Your registration fee is: 250.0
// You are team no: 1
// Thank You Hudson for your participation. Your registration fee is: 130.0
// You are participant no: 2