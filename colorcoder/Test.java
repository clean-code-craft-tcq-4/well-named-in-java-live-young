package colorcoder;
public class Test {
	   static void testNumberToPair(int pairNumber,
		        MajorColor expectedMajor,
		        MinorColor expectedMinor)
		    {
		        ColorPair colorPair = Main.getColorFromPairNumber(pairNumber);
		        System.out.println("Got pair " + colorPair.convertToString());
		        assert(colorPair.getMajor() == expectedMajor);
		        assert(colorPair.getMinor() == expectedMinor);
		    }

		    static void testPairToNumber(
		        MajorColor major,
		        MinorColor minor,
		        int expectedPairNumber)
		    {
		        int pairNumber = Main.getPairNumberFromColor(major, minor);
		        System.out.println("Got pair number " + pairNumber);
		        assert(pairNumber == expectedPairNumber);
		    }
		    
			static public void testColorCode() {
				testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
				testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

				testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
				testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
			}

}
