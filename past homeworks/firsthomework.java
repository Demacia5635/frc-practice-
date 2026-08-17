import java.util.Scanner;

public class firsthomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double speed;
        double acceleration;

        
        while(true){
            System.out.print("Enter a weight between 40.0 and 60.0: ");
            weight = scanner.nextDouble();
            
            if(weight >= 40 && weight <= 60){
                System.out.println("Weight accepted: " + weight);
                break;
            } else {
                System.out.println("Invalid weight. Please try again.");
            }
        }


        while(true){
            System.out.print("Enter a speed between 3.0 and 6.0: ");
            speed = scanner.nextDouble();
            
            if(speed >= 3.0 && speed <= 6.0){
                System.out.println("Speed accepted: " + speed);
                break;
            } else {
                System.out.println("Invalid speed. Please try again.");
            }
        }

        
        while(true){
            System.out.print("Enter a acceleration between 3.0 and 10.0: ");
            acceleration = scanner.nextDouble();

            if(acceleration >= 3.0 && acceleration <= 10.0){
                System.out.println("Acceleration accepted: " + acceleration);
                break;
            } else {
                System.out.println("Invalid acceleration. Please try again.");
            }
        }

        double timeToMaxSpeed = speed/acceleration;
        System.out.println("Time to reach maximum speed: " + timeToMaxSpeed);


        

        }
    }
