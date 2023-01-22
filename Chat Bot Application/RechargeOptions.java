

public class RechargeOptions {

    /**
     * This function contains recharge options 
     * @throws InterruptedException
     */
    public void recharge() throws InterruptedException{

        System.out.println("------You are currently in Recharge Options------\n");

        outer:
        while(true){

            System.out.println("\n\tPress 1 to know the balance");
            Thread.sleep(750);

            System.out.println("\n\tPress 2 to know the validity of your current recharge");
            Thread.sleep(750);

            System.out.println("\n\tPress 3 to know the Offer for your number");
            Thread.sleep(750);

            System.out.println("\n\tPress 4 to return to the main menu");
            Thread.sleep(750);

            System.out.println("\n\tPress 5 to exit");

            int option = new GetInput().getInput();

            switch(option){

                case 1:
                    System.out.println("\n\tYour balance is 100 Rupees");
                    back();
                    break outer;

                case 2:
                    System.out.println("\n\tYour recharge validity has 30 more days before ending");
                    back();
                    break outer;

                case 3:
                    System.out.println("\n\tYour mobile number has an offer of 198 rupees with 30 days validity");
                    back();
                    break outer;

                case 4:
                    new MainMenu().mainMenu();
                    break outer;

                case 5:
                    System.out.println("\n--------Thank you for using our service---------\n\n");
                    break outer;

                    
                default:
                    System.out.println("\n\nWrong input Please input the correct number\n\n");
                    new RechargeOptions().recharge();
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
           
            int option=new GetInput().getInput();

            switch(option){

                case 1:
                    new RechargeOptions().recharge();
                    break outer;

                case 2:
                    new MainMenu().mainMenu();
                    break outer;

                case 3:
                    System.out.println("\n--------Thank you for using our service---------\n\n");
                    break outer;

            }
            
        }
    }
}
