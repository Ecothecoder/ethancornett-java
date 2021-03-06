package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsInWoods = 3;
		int raccoonsGoingHome= 2;
		int raccoonsLeft= raccoonsInWoods - raccoonsGoingHome;
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int flowersOverBees= bees-flowers;
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int greedyPigeon = 1;
		int pigeonsEating= lonelyPigeon+greedyPigeon;
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int owlsJoining = 2;
		int owlsSitting = owlsOnFence+owlsJoining;
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beversSwimming = 1;
		int beaversStillWorking= beaversWorking-beversSwimming;
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting= 2;
		int toucansJoining= 1;
		int toucansAll= toucansSitting+toucansJoining;
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nutsInTree = 2;
		int squirrelsOverNuts = squirrelsInTree-nutsInTree;
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		float mrsHQuarter = (float).25;
		float mrsHDime = (float).10;
		float mrsHNickle = (float).05;
		float mrsHChange = mrsHQuarter + mrsHDime + 2*mrsHNickle;
		//System.out.print(mrsHChange);
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mrsBMuffin = 18;
		int mrsMMuffin = 20;
		int mrsFMuffin = 17;
		int firstGradeMuffin = mrsBMuffin + mrsMMuffin + mrsFMuffin;
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double mrsHyoyo = .24;
		double mrsHWhistle = .14;
		double totalSpent = mrsHyoyo+mrsHWhistle;
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int mrsHRice = 5;
		int mrsHLMarsh = 8;
		int mrsHMiniMarsh = 10;
		int totalMarsh = mrsHLMarsh+mrsHMiniMarsh;
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int mrsHSnow = 29;
		int breckSnow = 17;
		int moreSnow = mrsHSnow-breckSnow;
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int totalCash = 10;
		int toyTruck = 3;
		int pencil = 2;
		int cashLeft = (toyTruck+pencil)-totalCash;
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int collection = 16;
		int lostMarb = 7;
		int leftOver = collection-lostMarb;
		

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int firstShells = 19;
		int newShells = 25;
		int collectionShells= firstShells+newShells;
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons-redBalloons;
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int martaBooks = 10;
		int allTheBooksAreNowMyBooks = booksOnShelf+martaBooks;
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beesKnees = 6;
		int allTheBeesKnees = beesKnees*8;
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		int iceCreamConeCents = 99;
		int iceCreamCostCents = iceCreamConeCents*2;
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalRocks = 125;
		int mrsHRocks = 64;
		int rocksNeeded = totalRocks-mrsHRocks;
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int originalMarbles = 38;
		int lostMarbles = 15;
		int marblesLeft = originalMarbles-lostMarbles;
		

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int concertLocationMiles = 78;
		int milesDriven = 32;
		int milesLeft = concertLocationMiles-milesDriven;
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double mrsHShovelSnow = 1.5;
		double mrsHAfternoonShovel = .75;
		double shovelTotal = mrsHShovelSnow+mrsHAfternoonShovel;
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotDogs = 6;
		int hotDogsCents = 50;
		int hotDogsPriceCents = hotDogs*hotDogsCents;
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int mrsHWallet = 50;
		int pencilCents = 7;
		int totalCostCents = mrsHWallet - pencilCents;
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterFlies = 33;
		int orangeButterFlies = 20;
		int redButterFlies = butterFlies - orangeButterFlies;
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double kateCash = 1.00;
		double candyCost = .54;
		double kateCashLeft = kateCash - candyCost;
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesBackYard= 13;
		int treesToBePlanted= 12; 
		int totalTrees= treesBackYard+treesToBePlanted;
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int day = 24;
		int hoursLeft= day*2;
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins=4;
		int gumForCousins= cousins*5;
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dansCash= 3.00;
		double candyCash= 1.00;
		double totalCashy = dansCash - candyCash;
		//System.out.print(totalCashy);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleInBoat= 3;
		int peopleInLake = boatsInLake*peopleInBoat;
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLegos = 380;
		int lostLegos = 57;
		int legosLeft = ellenLegos-lostLegos;
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffin = 35;
		int muffinsNeeded = 83;
		int muffinsLeftToBake = muffinsNeeded-bakedMuffin;
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayon = 1400;
		int lucyCrayon = 290;
		int fightToTheDeathForTheCrayon= willyCrayon-lucyCrayon;
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int totalPages = 22;
		int totalStickers = stickersPerPage*totalPages;
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupCakes = 96;
		int hungryChildren = 8;
		int cupcakePerChild= totalCupCakes/hungryChildren;
		

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int tinyJarCapacity = 6;
		int fullJars = gingerbreadCookies/tinyJarCapacity;
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int howManyForTheOrignialBakerWhoIsHungry = croissants%neighbors;
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int allTheOatmealNotJustSomeOfIt = 276;
		int tooManyTraysInTheKitchen = cookiesPerTray/allTheOatmealNotJustSomeOfIt;
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int biteSizedPretzel = 480;
		int servingSizeIsALie = 12;
		int servingSizeForPartyPeople = biteSizedPretzel/servingSizeIsALie;
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupCakesAreALie = 53;
		int lemonBoxesForCakes = 3;
		int lemonBoxesForPeople = (lemonCupCakesAreALie-2)/lemonBoxesForCakes;
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotStick = 74;
		int carrotPeople = 12;
		int carrotUneaten= carrotStick%carrotPeople;
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int teddyShelves = 7;
		int filledShelves = teddyBears/teddyShelves;
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int familyPhotos = 480;
		int albumCapacity = 20;
		int albums = albumCapacity/familyPhotos;
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCards = 94;
		int boxOCards = 8;
		int lastBox= tradingCards%boxOCards;
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksToShelve = 210;
		int booksshelves = 10;
		int bookPerShelf = booksshelves/booksToShelve;
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int croissantss = 17;
		int guests = 7;
		int massivePlates = croissantss/guests;
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		double billSpeed = 1/2.15;
		double jillSpeed = 1/1.90;
		double togetherSpeed = billSpeed+jillSpeed;
		int numOfRooms = 5;
		double fiveRooms = numOfRooms/togetherSpeed;
		System.out.print(fiveRooms);
		System.out.printf("%n");
		double challengeSpeed=(togetherSpeed*311.5)/8;
		System.out.print((int)challengeSpeed);
				
				//Bill can finish a room in 2.15 hours
				//Jill can finish a room in 1.90 hours
				//together they finish 2 rooms in 4.05 hours
			    //together they finish 4 rooms in 8.10 hours
			    //they should finish 5 rooms in 10.125 hours rounding up
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String firstName = "Ethan";
		String lastName = "Cornett";
		String middleI = "E";
		String Name = (lastName + ", " + firstName + " " +middleI + ".");
		System.out.printf("%n");
		System.out.print(Name);
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		double miles = 800;
		double trainTravelled = 537;
		double mathMiles = trainTravelled/miles;
		double percentageDone= mathMiles*100;
		System.out.printf("%n");
		System.out.print("You are " +(int) percentageDone + "% of the way there!");

	}

}
