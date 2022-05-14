public class TestSeason {
    public static void main(String[] args){
        Season season =Season.SUMMER;
        switch (season){
            case WINTER:
                System.out.println(" It's cold in outside");
                break;
            case SPRING:
                System.out.println(" It's fresh in outside");
                break;
            case SUMMER:
                System.out.println(" It's warm in outside");
                break;
            case AUTUMN:
                System.out.println(" It's rainy in outside");
                break;
        }

    }
}
