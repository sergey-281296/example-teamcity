package plaindoll;

public class Welcomer{
    public String sayWelcome(){
        return "Welcome dear traveler, we have need of your services";
    }
    public String sayWelcome(String name){
        return "Welcome dear " + name + ", we have need of your services";
    }
    public String sayFarewell(){
        return "See you later, alligator";
    }
    public String sayNeed(){
        return "We need your help!";
    }
    public String getHunterReply(){
        return "The hunter is ready!";
    }
}
