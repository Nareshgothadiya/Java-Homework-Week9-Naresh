package javahomeworkweek9;

//Write the programme that tell you which line pass through particular stations.
//Just use Zone 1 stations name.

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" bakerloo\n central\n district\n jubilee\n northern\n metropolitan");
        System.out.println("-----------------");
        System.out.println("Please enter Train Name from above List : ");
        String city = scanner.nextLine();

        Programme10 cityName = new Programme10();
        cityName.stationName(city);
        scanner.close();
    }

    public void stationName(String city) {
        switch (city) {
            case "bakerloo":
                System.out.println("Edgware Road, Marlebone, Baker Street, Oxford Circus, Picadilly Circus, Charing Cross");
                break;
            case "central":
                System.out.println("Marble Arch, Bond Street, Oxford Circus, Holborn, St pauls, Bank, Liverpool Street");
                break;
            case "district":
                System.out.println("Tower Hill, Monument, Embankment, Westminster, Victoria, South Kensington, Earls Court");
                break;
            case "jubilee":
                System.out.println("Baker Street, Bond Street, Green Park, Westminster, Waterloo, Southwark, London Bridge");
                break;
            case "northern":
                System.out.println("Euston, Warren Street, Tottanham Court Road, Leicester Square, Charing Cross, Embankment, Waterloo");
                break;
            case "metrolpitan":
                System.out.println("Baker Stret, Euston Square, Kings Cros, Farrringdon, Barbican, Moorgate, Liverpool Street, Aldgate");
                break;
            default:
                System.out.println("Please enter correct train name:");
        }
    }
}

