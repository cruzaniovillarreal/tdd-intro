public class Triangle {
    public static float Perimeter(float aSide, float bSide, float cSide) {
        return aSide+bSide+cSide;
    };

    public static float Area(float bSide, float height) {
        return (float) .5*bSide*height;
    };

    public static float Pythagoras(float aSide, float bSide, float cSide) {
        return (float) Math.sqrt((aSide*aSide) + (bSide*bSide));
    };
}
