package colorcoder;

public class Main {

	static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorPair.NUMBEROFMAJORCOLORS);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorPair.NUMBEROFMINORCOLORS);
		return new ColorPair(majorColor, minorColor);
	}

	static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * ColorPair.NUMBEROFMINORCOLORS + minor.getIndex() + 1;
	}
	
	static void displayManual() {
        int count = 1;
        System.out.println("Pair No." + " -> " + "Major Color" + " - " + "Minor Color");
        for(int i = 0 ; i< ColorPair.MAJORCOLORNAMES.length ; i++) {
            for(int j = 0; j<ColorPair.MINORCOLORNAMES.length ; j++) {
                 System.out.println(count + " -> " + ColorPair.MAJORCOLORNAMES[i] + " -- " + ColorPair.MINORCOLORNAMES[j]);
                 count++;
            }
        }
    }

	public static void main(String[] args) {
		Test.testColorCode();
		displayManual();
	}
}
