public class Me implements Tourist {

    static int budget = 1000;

    @Override
    public void visit() {
        System.out.print("Enjoying my stay");
    }

    @Override
    public void visit(Boracay boracay) {
        System.out.println("******************************");
        System.out.println("");

        System.out.println("Ey swimming sa bora...");
        if (budget >= boracay.airFare)
        {
            budget -= boracay.airFare;
            System.out.println("Lunudin ko sila sheen");
            checkBudget();
        }
        else
        {
            System.out.println("Butas bulsa mo gaga");
            checkBudget();
        }
        
        System.out.println("");
    }

    @Override
    public void visit(Bulacan bulacan) {
        System.out.println("******************************");
        System.out.println("");
        System.out.println("Home Tour sa Bulacan...");
        if (budget >= bulacan.airFare)
        {
            budget -= bulacan.airFare;
            System.out.println("Mangugulo lang kanila Journey");
            checkBudget();
        }
        else
        {
            System.out.println("Bawi next time");
            checkBudget();
        }
        
        System.out.println("");
    }

    @Override
    public void visit(Navotas navotas) {
        System.out.println("******************************");
        System.out.println("");
        System.out.println("Dadayo ng Navotas para mag Uno...");
        if (budget >= navotas.airFare)
        {
            budget -= navotas.airFare;
            System.out.println("Nambwibisita kanila Kit");
            checkBudget();
        }
        else
        {
            System.out.println("Baka may pera ka pa");
            checkBudget();
        }
        
        System.out.println("");
    }

    @Override
    public void visit(NuevaEcija nuevaecija) {
        System.out.println("******************************");
        System.out.println("");
        System.out.println("Bat napadpad sa Nueva Ecija...");
        if (budget >= nuevaecija.airFare)
        {
        budget -= nuevaecija.airFare;
        System.out.println("Layo ng bahay ni Paulo");
        checkBudget();
        }
        else
        {
            System.out.println("Mahal tae ginto eh");
            checkBudget();
        }
        
        System.out.println("");
    }

    @Override
    public void visit(Paranaque paranaque) {
        System.out.println("******************************");
        System.out.println("");
        System.out.println("Uy first time sa Paranaque...");
        if (budget >= paranaque.airFare)
        {
        budget -= paranaque.airFare;
        System.out.println("Asan na miming ni Louis");
        checkBudget();
        }
        else
        {
            System.out.println("Bat pa kasi kayo nag McDo lah ka tuloy pera");
            checkBudget();
        }

        System.out.println("");
    }

    @Override
    public void visit(QuezonCity quezoncity) {
        System.out.println("******************************");
        System.out.println("");
        System.out.println("Diretsyo na SM Fairview KaraokeHub agad...");
        if (budget >= quezoncity.airFare)
        {
        budget -= quezoncity.airFare;
        System.out.println("Kakaraoke sama ni Tine");
        checkBudget();
        }
        else
        {
            System.out.println("Aray tae ilang beses na plinano toh eh");
            checkBudget();
        }
        
        System.out.println("");
        System.out.println("******************************");
    }

    public void checkBudget() {
        System.out.println("My budget is " + budget);
    }

}