package com.mustafaergan.feed;

import com.mustafaergan.type.Deer;
import com.mustafaergan.type.Human;
import com.mustafaergan.type.Lion;

public class FeedApp {

	public static void main(String[] args) {
		
		Human human1 = new Human();
		
		Deer deer1 = new Deer();
		
		Lion lion1 = new Lion();

		FeedingService feedingService = new FeedingService();

		feedingService.feedWithPlant(deer1);

		feedingService.feedWithFish(human1);

		feedingService.feedWithPlant(human1);

		feedingService.feedWithFish(lion1);
		
	}

}
