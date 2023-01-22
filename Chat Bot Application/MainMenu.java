
public class MainMenu {
    /**
     * this function shows the main menu 
     * @throws InterruptedException because it uses sleep method in Thread class
     */
    public void mainMenu() throws InterruptedException{

        System.out.println("------You are currently in Main Menu-------\n");

        outer:
        while(true){

            System.out.println("\tPress 1 for Recharge options\n");
            Thread.sleep(750);

            System.out.println("\tPress 2 for caller tune options\n");
            Thread.sleep(750);

            System.out.println("\tPress 3 for internet related queries\n");
            Thread.sleep(750);

            System.out.println("\tPress 4 to talk with our customer service people\n");
            Thread.sleep(750);

            System.out.println("\tPress 5 to exit\n");
            Thread.sleep(750);

            int option = new GetInput().getInput();

            switch(option){

                case 1:
                    new RechargeOptions().recharge();
                    break outer;
                    
                case 2:
                    new CallerTune().callerTune();
                    break outer;

                case 3:
                    new InternetOptions().internet();
                    break outer;

                case 4:
                    System.out.println("\n---Thanks for calling the customer care. Your call may be recorded for quality purposes---");
                    Thread.sleep(5000);

                case 5:
                    System.out.println("\n--------Thank you for using our service---------\n\n");
                    break outer;

                    
                default:
                    System.out.println("\n\n-x-x-x-Wrong input Please input the correct number-x-x-x-\n\n");
                    new MainMenu().mainMenu();
                    break outer;
            }
        }
    }
}
