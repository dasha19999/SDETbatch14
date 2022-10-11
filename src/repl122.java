public class repl122 {
    String country;
    String capital;
    double population;

    public static void main(String[] args) {
        repl122 main=new repl122();

        main.country="USA";
        main.capital="Washington DC";
        main.population=330000000;
        System.out.println("The capital of "+main.country+" is "+ main.capital+" and population is "+ main.population);

        repl122 main1=new repl122();
        main1.country="Kazakhstan";
        main1.capital="Astana";
        main1.population=18500000;
        System.out.println("The capital of "+main1.country+" is "+ main1.capital+" and population is "+ main1.population);
    }

}
