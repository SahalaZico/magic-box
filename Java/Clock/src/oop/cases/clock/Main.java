package oop.cases.clock;
/**
 *
 * @author Sahala Zico
 */
public class Main {

    public static void main(String[] _args) {
        //Object instantiation
        Clock clock = new Clock();
        
        // operate the instance
        System.out.println(clock.toString());
        
        clock.tickSecond();
        System.out.println(clock.toString());
        
        for(int c = 0; c < 98765; c++){
            clock.tickSecond();
        }        
        System.out.println(clock.toString());
        
        Clock clock2 = new Clock();
        clock2.setHour(30);
        System.out.println(clock2.toString());
        
        clock2.setMinute(92);
        System.out.println(clock2.toString());
        
        clock2.setSecond(78);
        System.out.println(clock2.toString());
        
        clock2.tickSecond();
        System.out.println(clock2.toString());
    }
    
}
