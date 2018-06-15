package cfbhcStatParser;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class main {
	

	public static void main(String[] args) throws IOException {
		
		
		// TODO: Dynamically load all time slots
		// Loads time slot page into JSoup document object for parsing
		Document timeSlot = Jsoup.connect("http://cfbhc.com/index.php?/topic/20571-2021-week-0-tnf/").get();
		
		// Finds the elements containing game results for the timeslot
		Elements results = timeSlot.getElementsByClass("ipsSpoiler_contents");
		
		for(Element game : results) {
			System.out.print(game);
		}


	}


}
