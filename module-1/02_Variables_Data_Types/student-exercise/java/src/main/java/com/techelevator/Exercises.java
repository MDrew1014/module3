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
		int raccoonsEatDinner = 2;
		int raccoonsLeftInWoods = raccoonsInWoods - raccoonsEatDinner;
		
		System.out.println(raccoonsLeftInWoods);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int flowers = 5;
		int bees = 3;
		int beesLessFlowers = flowers - bees;
		
		System.out.println(beesLessFlowers);
		
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int pigeonEating = 1;
		int joinedPigeon =1;
		int eatingPigeons = pigeonEating + joinedPigeon;
		
		System.out.println(eatingPigeons);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int sittingOwls = 3;
		int joinedOwls = 2;
		int fenceOwls = sittingOwls + joinedOwls;
		
		System.out.println(fenceOwls);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int startingBeavers = 2;
		int swimBeavers = 1;
		int stillWorking = startingBeavers - swimBeavers;
		
		System.out.println(stillWorking);
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int sittingToucans = 2;
		int joinedToucans = 1;
		int totalToucans = sittingToucans + joinedToucans;
		
		System.out.println(totalToucans);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrels = 4;
		int nuts = 2;
		int squirrelsGreaterThanNuts = squirrels - nuts;
		
		System.out.println(squirrelsGreaterThanNuts);
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int moneyFound = quarter + dime + 2*nickel;
		
		System.out.println(moneyFound);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int brier = 18;
		int macAdams = 20;
		int flannery = 17;
		int totalMuffins = flannery + macAdams + brier;
		
		System.out.println(totalMuffins);
		
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		int yoyo = 24;
		int whistle = 14;
		int twoToys = yoyo + whistle;
		
		System.out.println(twoToys);
		
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int riceKrispieTreats = 5;
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = riceKrispieTreats * (largeMarshmallows + miniMarshmallows);
		
		System.out.println(totalMarshmallows);
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int hiltHouse = 29;
		int brecknock = 17;
		int moreSnow = hiltHouse - brecknock;
		
		System.out.println(moreSnow);
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		
		int hiltMoney = 10;
		int toyTruck = 3;
		int pencilCase = 2;
		int moneyLeft = hiltMoney - (toyTruck - pencilCase);
		
		System.out.println(moneyLeft);
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int marbles = 16;
		int lostMarbles = 7;
		int totalMarbles = marbles - lostMarbles;
		
		System.out.println(totalMarbles);
		
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int meganShells = 19;
		int totalShellsWanted = 25;
		int shellsNeeded = totalShellsWanted - meganShells;
		
		System.out.println(shellsNeeded);
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int bradBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = bradBalloons - redBalloons;
		
		System.out.println(greenBalloons);
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int initialBooks = 38;
		int martaBooks = 10;
		int finalBooks = initialBooks + martaBooks;
			
			System.out.println(finalBooks);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int beeLegs = 6;
		int numberOfBees = 8;
		int totalBeeLegs = numberOfBees * beeLegs;
		
		System.out.println(totalBeeLegs);
			
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		int iceCreamCone = 99;
		int cones = 2;
		int twoCones = cones * iceCreamCone;
		
		System.out.println(twoCones);
		
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int totalRocksNeeded = 125;
		int rocksOwned = 64;
		int rocksForCompletion = totalRocksNeeded - rocksOwned;
		
		System.out.println(rocksForCompletion);
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int hiltsMarbles = 38;
		int marblesLost = 15;
		int marblesLeft = hiltsMarbles - marblesLost;
		
		System.out.println(marblesLeft);
		
		
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int milesAway = 78;
		int milesBeforeStop = 32;
		int milesLeftToDrive = milesAway - milesBeforeStop;
		
		System.out.println(milesLeftToDrive);
		
		
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		int saturdayShoveling = 90;
		int sundayShoveling = 45;
		int totalShoveling = saturdayShoveling + sundayShoveling;
		
		System.out.println(totalShoveling);
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int hotDogsBought = 6;
		int hotDogCost = 50;
		int totalHotDogCost = hotDogsBought * hotDogCost;
		
		System.out.println(totalHotDogCost);
		
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int hiltsMoney = 50;
		int pencilCost = 7;
		int pencilsBought = hiltsMoney/pencilCost;
		
		System.out.println(pencilsBought);
		
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int hiltButterfly = 33;
		int orangeButterfly = 20;
		int redButterfly = hiltButterfly - orangeButterfly;
		
		System.out.println(redButterfly);
		
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		int kateMoney = 100;
		int candyCost = 54;
		int kateChange = kateMoney - candyCost;
		
		System.out.println(kateChange);
		
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int marksTrees = 13;
		int treesToPlant = 12;
		int finalTrees = marksTrees + treesToPlant;
		
		System.out.println(finalTrees);
		
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursPerDay = 24;
		int numberOfDays = 2;
		int hoursUntilGrandma = hoursPerDay * numberOfDays;
		
		System.out.println(hoursUntilGrandma);
		
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int numOfCousins = 4;
		int gumForEach = 5;
		int totalGumNeeded = numOfCousins * gumForEach;
		
		System.out.println(totalGumNeeded);
		
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		int danMoney = 300;
		int candyBar = 100;
		int moneyLeftOver = danMoney - candyBar;
		
		System.out.println(moneyLeftOver);
		
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int numOfBoats = 5;
		int peoplePerBoat = 3;
		int peopleOnTheLake = numOfBoats * peoplePerBoat;
		
		System.out.println(peopleOnTheLake);
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int ellenLegos = 380;
		int legosLost = 57;
		int legosLeft = ellenLegos - legosLost;
		
		System.out.println(legosLeft);
		
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int muffinsBaked = 35;
		int muffinsNeeded = 83;
		int muffinsToBake = muffinsNeeded - muffinsBaked;
		
		System.out.println(muffinsToBake);
		
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int crayonDif = willyCrayons - lucyCrayons;
		
		System.out.println(crayonDif);
		
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersPerPage * pagesOfStickers;
		
		System.out.println(totalStickers);
		
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int cupcakes = 96;
		int children = 8;
		int cupcakesPerChild = cupcakes / children;
		
		System.out.println(cupcakesPerChild);
		
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int cookiesMade = 47;
		int cookiesPerJar = 6;
		int cookiesLeft = cookiesMade % cookiesPerJar;
		
		System.out.println(cookiesLeft);
		
		
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissants = 59;
		int numOfNeighbors = 8;
		int leftoverCroissants = croissants % numOfNeighbors;
		
		System.out.println(leftoverCroissants);
		
		
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int cookiesNeeded = 276;
		int cookiesPerTray = 12;
		int traysNeeded = cookiesNeeded / cookiesPerTray;
		
		System.out.println(traysNeeded);
		
		
        /*
        43. Marian???s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int smallPretzels = 480;
		int servingSize = 12;
		int servingsOfPretzels = smallPretzels / servingSize;
		
		System.out.println(servingsOfPretzels);
		
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakesBaked = 53;
		int cupcakesLeftHome = 2;
		int cupcakesPerBox = 3;
		int boxesGivenAway = (lemonCupcakesBaked - cupcakesLeftHome) / cupcakesPerBox;
		
		System.out.println(boxesGivenAway);
		
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int sticksPrepared = 74;
		int peopleGettingCarrots = 12;
		int uneatenCarrots = sticksPrepared % peopleGettingCarrots;
		
		System.out.println(uneatenCarrots);
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int teddyBears = 98;
		int bearsPerShelf = 7;
		int numOfShelves = teddyBears / bearsPerShelf;
		
		System.out.println(numOfShelves);
		
		
        /*
        47. Susie???s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
       
        */

		int pictures = 480;
		int picPerAlbum = 20;
		int albumsNeeded = pictures / picPerAlbum;
		
		System.out.println(albumsNeeded);
		
		
        /*
        48. Joe, Susie???s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int tradingCards = 94;
		int cardsPerBox = 8;
		int cardsLeftOver = tradingCards % cardsPerBox;
		
		System.out.println(cardsLeftOver);
		
		
        /*
        49. Susie???s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int susieBooks = 210;
		int totalShelves = 10;
		int booksOnAShelf = susieBooks / totalShelves;
		
		System.out.println(booksOnAShelf);
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int bakedCroissants = 17;
		int croissantGuests = 7;
		int croissantsPerGuest = bakedCroissants / croissantGuests;
		
		System.out.println(croissantsPerGuest);
		
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		 
		double billsPace = 2.15;
		double jillsPace = 1.9;
		double hours = 1;
		double billsHourly = hours / billsPace;
		double jillsHourly = hours / jillsPace;
		double pacePerHour = billsPace + jillsPace;
		double numberOfRooms = 5;
		double fiveRooms =  numberOfRooms * pacePerHour;
		double workDay = 8;
		double totalRooms = 623;
		double daysToComplete =(totalRooms * pacePerHour) / workDay;
		
		System.out.println(fiveRooms);
		System.out.println(daysToComplete);
		
		
		
		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

		String firstName = "Michael";
		String middleName = "J.";
		String lastName = "Drew";
		String comma = ", ";
		String fullName = lastName + comma + firstName + comma + middleName;
		
		
		System.out.println(fullName);
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


		float totalMiles = 800;
		float milesTraveled = 537;
		float percentComplete = ((milesTraveled) / totalMiles) * 100;
		float complete = (int)percentComplete;
			
			System.out.println(complete);
		
		
	}

}
