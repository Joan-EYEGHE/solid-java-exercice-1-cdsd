import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean running=true;
        while(running){
            System.out.println("1- Voir les produits");
            System.out.println("2- Commander");
            System.out.println("3- Quitter");
            int choix = sc.nextInt();
            sc.nextLine();
            if(choix==1){
                try {} 
                
                catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            } else if(choix==2){
                try {

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            }else if(choix==3){
                running=false;
            }
        }
        
    }
}
