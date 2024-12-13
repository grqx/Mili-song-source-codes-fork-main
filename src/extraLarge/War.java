package extraLarge;

public class War {
    private String descString = null;
    private Life warParticipant = null;

    public War(Life warParticipant, String descString) {
        this.descString = descString;
        this.warParticipant = warParticipant;
    }

    public double getScore(Life participantLife) {
        if(participantLife == warParticipant) {
            System.out.println("Let us fall");
            return 0.49;
        }
        return 0.5;
    }
}