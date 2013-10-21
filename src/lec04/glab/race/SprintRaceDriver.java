package lec04.glab.race;



import lec04.glab.fight.Human;
import lec04.glab.fight.Kangaroo;

public class SprintRaceDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		  
		Raceable[] racRacers = new Raceable[3];

		
		racRacers[0] = new Human("//src//lec04//glab//resources//run_human.gif",
				Raceable.DIM);
		
		racRacers[1] = new Gazelle("//src//lec04//glab//resources//run_gazelle.jpg",
				Raceable.DIM);
		

		racRacers[2] = new Kangaroo("//src//lec04//glab//resources//run_roo.png",
				Raceable.DIM);


		//make a lane marker
			StringBuilder stbLane = new StringBuilder();
			for (int nC = 0; nC < 120; nC++){
				 stbLane.append("#");
            }
		

            //declare a ref to the farthest one
			//Raceable racFarthest;


            //use a labeled break to break out of a nested loop
            outer:
			while (true) {
				for (Raceable rac : racRacers) {
					rac.stride();
                    if(rac.getDistance() >= 100){
                        System.out.print(rac.vocalize());
                        System.out.println(" " + rac.getClass().toString() + " wins.");
                        break outer;
                    }

					System.out.print(rac.display(rac.getDistance()));
					System.out.println(stbLane.toString());

					
				}

			}//end while
			

	}//end main

}
