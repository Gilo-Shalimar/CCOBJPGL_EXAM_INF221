// import Locations.Boracay;
interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Bulacan bulacan);

    void visit(Navotas navotas);

    void visit(NuevaEcija nuevaecija);

    void visit(Paranaque paranaque);

    void visit(QuezonCity quezoncity);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();

}