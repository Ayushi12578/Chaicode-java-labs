package Condition;

public class WeatherAdvice {
   
    public static void main(String[] args) {
        int Temp=1;
       boolean isRaining = true;
        if(Temp>=35){
            System.out.println("Too hot for hiking - stay indoors and hydrate");
        }
        else if (Temp>=25) {

            if (isRaining) {
            System.out.println("Warm but rainy - consider indoor activities");

            }
            else{
            System.out.println("Great weather for hiking - don't forget sunscreen");
        }
            }
            else if (Temp>=15) {
                if (isRaining) {
                    System.out.println("Cool and rainy - bring waterproof gear if hiking");
                }
                else{
                    System.out.println( "Perfect hiking weather - enjoy the trails");
                }
            }
            else if(Temp>=5){
                if (isRaining) {
                    System.out.println("Cold and wet - best to stay indoors");
                }
                else{
                    System.out.println("Chilly - wear layers for your hike");

                }
            }
            else{
                System.out.println("Too cold - stay warm indoors");
            }
        }
       
    }

