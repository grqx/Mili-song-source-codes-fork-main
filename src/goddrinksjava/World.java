package goddrinksjava;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by syuchan on 2016/10/17.
 */
public class World {
	private static Set<Thing> things = new HashSet<>();
	private int var1;
	private String kinen;
	private int year;

	public World(int var1) {
		this.var1 = var1;
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("OBJECT CREATION");
	}

	public void addThing(Thing thing) {
		if (thing.getName().equals("Me")) {
			ConcurrentMusicPlayer.nextSentence();
			System.out.print("Fill in my data");
		} else {
			System.out.println(" parameters");
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("INITIALIZATION");
		}
		things.add(thing);
	}

	public void startSimulation() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Set up our new world");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("And let's begin the");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("SIMULATION");
	}

	public void timeTravelForTwo(String kinen, int year, Thing... thing) {
		if (kinen.equals("AD")) {
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("Oh, we can travel");
			ConcurrentMusicPlayer.nextSentence();
			System.out.print("To A.D. ");
		} else {
			System.out.println("to B.C.");
		}
		this.kinen = kinen;
		this.year = year;
	}

	public void unite(Thing... things) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("And we can unite");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("So deeply, so deeply\n");
	}

	public void lockThing(Thing thing) {
		if (thing.getName().equals("Me")) {
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("Though we are trapped");
		} else {
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("In this strange, strange");
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("SIMULATION\n");
		}
	}

	public Thing getGod() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I'm the only god");
		for (Thing t : things)
			if (t.getName() == "Me")
				return t;
		return null;
	}

	public void procreate(Thing... things) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("And then do whatever");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("From AM to PM");
	}

	public void makeHigh(Thing thing) {
		if (thing.getName().equals("Me")) {
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("So we can enter");
			ConcurrentMusicPlayer.nextSentence();
			System.out.print("The trance, ");
		} else {
			System.out.println("the trance\n");
		}
	}

	public void unlock(Thing thing) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Though you have left\n");
	}

	public void removeThing(Thing thing) {
		things.remove(thing);
	}

	public int getThingIndex(Thing thing) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can have you back");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("I will run the");
		return 0;
	}

	public void announce(String... args) {
		if (args[0].equals("God is always true.")) {
			args[0] = "ILLEGAL ARGUMENTS\n";
		} else {
			switch (args[0]) {
				case "1":
					args[0] = "EIN";
					break;
				case "2":
					args[0] = "DOS";
					break;
				case "3":
					args[0] = "TROIS";
					break;
				case "4":
					args[0] = "NE";
					break;
				case "5":
					args[0] = "FEM";
					break;
				case "6":
					args[0] = "LIU";
					break;
			}
		}
		ConcurrentMusicPlayer.nextSentence();
		System.out.println(args[0]);
	}

	public void runExecution() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("EXECUTION");
	}

	public boolean isExecutableBy(Thing thing) {
		System.out.println();
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can give them all the");
		return things.contains(thing);
	}

	public void execute(Thing thing) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("EXECUTION");
	}
}
