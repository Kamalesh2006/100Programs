

public class CallerTune {
    /**
     * This functions contains all caller tune related options
     * @throws InterruptedException
     */
    public void callerTune() throws InterruptedException{

        System.out.println("You are currently in Caller Tune Options");

        outer:
        while(true){

            System.out.println("\n\tPress 1 to set Caller Tune");
            Thread.sleep(750);

            System.out.println("\n\tPress 2 to remove Caller Tune");
            Thread.sleep(750);

            System.out.println("\n\tPress 4 to return to the main menu");
            Thread.sleep(750);

            System.out.println("\n\tPress 5 to exit");

            int option = new GetInput().getInput();

            switch(option){

                case 1: 
                    System.out.println("\n\tYou have successfully set caller tune");
                    back();
                    break outer;
                    
                case 2:
                    System.out.println("\n\tYou hvae successfully removed caller tune");
                    back();
                    break outer;

                case 4:
                    new MainMenu().mainMenu();
                    break outer;

                case 5:
                    System.out.println("\n--------Thank you for using our service---------\n\n");
                    break outer;

                default:
                    System.out.println("\n\n-x-x-x-Wrong input Please input the correct number-x-x-x-\n\n");
                    new CallerTune().callerTune();
                    break outer;
            }

    
        }
        

    }
    /**
     * This function is used to go back to the previous options
     * @throws InterruptedException
     */
    public static void back()throws InterruptedException{
        
        outer:
        while(true){

            System.out.println("\n\tPress 1 to go back to previous menu");
            Thread.sleep(750);

            System.out.println("\n\tPress 2 to go to Main menu");
            Thread.sleep(750);

            System.out.println("\n\tPress 3 to exit");
            Thread.sleep(750);


            int option = new GetInput().getInput();

            switch(option){

                case 1:
                    new CallerTune().callerTune();;
                    break outer;

                case 2:
                    new MainMenu().mainMenu();
                    break outer;

                case 3:
                    System.out.println("\n--------Thank you for using our service---------\n\n");
                    break outer;

                default:
                    System.out.println("\n\tWrong input please enter again\n\n");
                    new CallerTune().callerTune();
                    break outer;

            }
        }
    }
}
