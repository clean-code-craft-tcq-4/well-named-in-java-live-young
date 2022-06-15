package colorcoder;


public class ColorPair {
	private MajorColor majorColor;
    private MinorColor minorColor;
    static final String[] MAJORCOLORNAMES = {
            "White", "Red", "Black", "Yellow", "Violet"
        };
        static final int NUMBEROFMAJORCOLORS = MAJORCOLORNAMES.length;
        static final String[] MINORCOLORNAMES = {
            "Blue", "Orange", "Green", "Brown", "Slate"
        };
        static final int NUMBEROFMINORCOLORS = MINORCOLORNAMES.length;

    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    String convertToString() {
        String colorPairStr = MAJORCOLORNAMES[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += MINORCOLORNAMES[minorColor.getIndex()];
        return colorPairStr;
    }
}
