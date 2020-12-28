package AggregationAndComposition.ThirdAnswer;

public class Main {
    public static void main(String[] args) {

        District district1 = new District("улица 30 лет Победы",15.55);
        District district2 = new District("улица Сурганова",15.55);
        District district3 = new District("Площадь Ленина",15.55);
        District district4 = new District("Пожарный переулок",15.55);
        District[] districtsMinsk1 = {district1,district2,district3,district4};

        District district5 = new District("улица 30 лет Победы",15.55);
        District district6 = new District("улица Сурганова",15.55);
        District district7 = new District("Площадь Ленина",15.55);
        District district8 = new District("Пожарный переулок",15.55);
        District[] districtsMinsk2 = {district5,district6,district7,district8};

        District district9 = new District("улица 30 лет Победы",15.55);
        District district10 = new District("улица Сурганова",15.55);
        District district11 = new District("Площадь Ленина",15.55);
        District district12 = new District("Пожарный переулок",15.55);
        District[] districtsMinsk3 = {district9,district10,district11,district12};

        District district13 = new District("улица 30 лет Победы",15.55);
        District district14 = new District("улица Сурганова",15.55);
        District district15 = new District("Площадь Ленина",15.55);
        District district16 = new District("Пожарный переулок",15.55);
        District[] districtsMinsk4 = {district13,district14,district15,district16};


        City cityMinsk1 = new City(districtsMinsk1,"FirstCity");
        City cityMinsk2 = new City(districtsMinsk2,"SecondCity");
        City cityMinsk3 = new City(districtsMinsk3,"ThirdCity");
        City cityMinsk4 = new City(districtsMinsk4,"FourCity");

        City[] allCityToMinsk = {cityMinsk1,cityMinsk2,cityMinsk3,cityMinsk4};
        City[] allCityToMinsk1 = {cityMinsk1,cityMinsk2,cityMinsk3,cityMinsk4};
        City[] allCityToMinsk2 = {cityMinsk1,cityMinsk2,cityMinsk3,cityMinsk4};
        City[] allCityToMinsk3 = {cityMinsk1,cityMinsk2,cityMinsk3,cityMinsk4};

        Region region1 = new Region(allCityToMinsk,"FirstRegion","It's Capital");
        Region region2 = new Region(allCityToMinsk1,"SecondRegion");
        Region region3 = new Region(allCityToMinsk2,"ThirdRegion");
        Region region4 = new Region(allCityToMinsk3,"FourRegion");
        Region region5 = new Region(allCityToMinsk,"FiveRegion");
        Region region6 = new Region(allCityToMinsk2,"SixRegion");

        Region[] regions = {region1,region2,region3,region4,region5,region6};

        TheState state = new TheState(regions,"Belarus");

        state.displayTheCapital();
        state.amountRegion();

        state.showAllRegionName();
        System.out.println(state.countSquare());


    }
}
