package eu.senla.task_2;

public class Rainbow {

    public void getColor(int number) {
        switch (number) {
            case 1:
                System.out.println("red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 21:
            case 12:
                System.out.println("MIXredOrange");
                break;
            case 3:
                System.out.println("yellow");
                break;
            case 32:
            case 23:
                System.out.println("Orangeyellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 43:
            case 34:
                System.out.println("MIXYellowGreen");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 45:
            case 54:
                System.out.println("MIxGreenBlue");
                break;
            case 6:
                System.out.println("GOLOBYU");
                break;
            case 56:
            case 65:
                System.out.println("MIXblueGOLOBYU");
                break;
            case 7:
                System.out.println("Purple");
                break;
            case 67:
            case 76:
                System.out.println("MixGOLVPurple");
                break;
        }
    }
}
