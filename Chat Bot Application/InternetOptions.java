public class InternetOptions {

    /**
     * This functions contains all internet related options
     * @throws InterruptedException
     */
    public void internet() throws InterruptedException{

        System.out.println("------You are currently in Internet Options------\n");

        outer:
        while(true){

            System.out.println("\n\tPress 1 to know the current internet balance");
            Thread.sleep(750);

            System.out.println("\n\tPress 2 to know the validity of your internet pack");
            Thread.sleep(750);

            System.out.println("\n\tPress 3 to get the GPRS mode turned ON");
            Thread.sleep(750);

            System.out.println("\n\tPress 4 to return to the main menu");
            Thread.sleep(750);

            System.out.println("\n\tPress 5 to exit");

            int option = new GetInput().getInput();

            switch(option){

                case 1:
                    System.out.println("\n\tYour current internet balance is 1024MB");
                    back();
                    break outer;

                case 2:
                    System.out.println("\n\tYour internet recharge validity has 30 more days before ending");
                    back();
                    break outer;

                case 3:
                    System.out.println("\n\tAn SMS is sent to your mobile number with steps to activate the GPRS in settings.");
                    back();
                    break outer;

                case 4:
                    new MainMenu().mainMenu();
                    break outer;

                case 5:
                    System.out.println("\n--------Thank you for using our service---------\n\n");
                    break outer;

                    
                default:
                    System.out.println("\n\tWrong input Please input the correct number\n\n");
                    new InternetOptions().internet();
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
            ;
            Thread.sleep(750);
            System.out.println("\n\tPress 2 to go to Main menu");
            
            Thread.sleep(750);
            System.out.println("\n\tPress 3 to exit");
            Thread.sleep(750);
           
            int option=new GetInput().getInput();

            switch(option){
                case 1:
                    new InternetOptions().internet();
                    break outer;

                case 2:
                    new MainMenu().mainMenu();
                    break outer;

                case 3:
                    System.out.println("\n--------Thank you for using our service---------\n\n");
                    break outer;
                    
                default:
                    System.out.println("\n\n-x-x-x-Wrong input Please input the correct number-x-x-x-\n\n");
                    new InternetOptions().internet();;
                    break outer;

            }
            
        }
    }
}
