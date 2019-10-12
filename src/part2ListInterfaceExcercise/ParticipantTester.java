package part2ListInterfaceExcercise;

import java.util.ArrayList;
import java.util.List;

public class ParticipantTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Participant> participants = new ArrayList<>();
		Participant participant1 = new Participant();
		participant1.setParticipantName("Hazel");
		participant1.setParticipantScore(29.75f);
		participant1.setParticipantTalent("Singing");
		participants.add(participant1);
		
		Participant participant2 = new Participant();
		participant2.setParticipantName("Hudson");
		participant2.setParticipantScore(28f);
		participant2.setParticipantTalent("Instrumental");
		participants.add(participant2);
		
		Participant participant3 = new Participant();
		participant3.setParticipantName("Enoch");
		participant3.setParticipantScore(52.95f);
		participant3.setParticipantTalent("Singing");
		participants.add(participant3);
		
		Participant participant4 = new Participant();
		participant4.setParticipantName("Bonsy");
		participant4.setParticipantScore(49.67f);
		participant4.setParticipantTalent("Dance");
		participants.add(participant4);
		
		for(int i =0;i<participants.size();i++) {
			System.out.println("Participants "+(i+1)+":");
			System.out.println(participants.get(i).getParticipantName());
			System.out.println(participants.get(i).getParticipantScore());
			System.out.println(participants.get(i).getParticipantTalent()+"\n");
		}
		
		float highest = 0.0f;
		for(Participant p:participants) {
			if(p.getParticipantScore()>highest) {
				highest = p.getParticipantScore();
			}
		}
		for(Participant p:participants) {
			if(highest == p.getParticipantScore()) {
				System.out.println("The Participant with a Highest Score is: ");
				System.out.println(p.getParticipantName()+"\n"+p.getParticipantScore());
			}
		}
	}

}
