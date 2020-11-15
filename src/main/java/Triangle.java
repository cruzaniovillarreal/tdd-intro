public class Triangle {
    public static float num;

    public static float perimeter(float aSide, float bSide, float cSide) {
        return aSide+bSide+cSide;
    };

    public static float area(float bSide, float height) {
        return (float) .5*bSide*height;
    };

    public static float pythagoras(float aSide, float bSide, float cSide) {
        return (float) Math.sqrt((aSide*aSide) + (bSide*bSide));
    };
}
