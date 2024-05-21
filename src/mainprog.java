import java.awt.Color;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class mainprog{

//2 car lights, for horizantal direction of traffic and for vertical direction of traffic

//Can be "red", "yellow" or "green"
String hCars = "red";
String vCars = "red";

//2 variables for pedestrian lights, they come in pairs of 4 total traffic light, 2 traffic lights at each
// corner of intersection, one variable will be dedicated for horizontal direction meaning 4 lights for pedestrians should be green,
//all bottom ones and all top ones, same for the vertical

//Can be "red" or "green"
String hPedestrians = "red";
String vPedestrians = "red";


// Set the time for green and yellow lights

int timeOfGreen = 10;
int timeOfYellow = 2;

//Construct a file and runs the method
public mainprog(){
    trafficSystem();
}


//Keeps iterating, for demonstration purposes is set to a certain variable
public void trafficSystem(){
    int two = 0;
    while(two<=2){
        
        executeHorizontalLights();

        executeVerticleLights();
        two++;
    }
}


//Horizontal Lights
public void executeHorizontalLights(){
    Demo d1 = new Demo();
    d1.main(null);

//Change the state of the lights to green
    hPedestrians = "green";
    hCars = "green";
d1.button3.setBackground(Color.GREEN);
d1.button4.setBackground(Color.GREEN);

d1.button6.setBackground(Color.GREEN);
d1.button7.setBackground(Color.GREEN);
d1.button5.setBackground(Color.GREEN);
d1.button8.setBackground(Color.GREEN);
//Demonstration in terminal
//System.out.println("Pedestrian light H is: " + hPedestrians);
//System.out.println("Cars light H is: " + hCars);

//Times the computer, system.out.println is only for demonstration purposes only
for(int i = 0; i<timeOfGreen; i++){
try {
    TimeUnit.SECONDS.sleep(1);
    System.out.println(i + " seconds passed");
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    System.out.println("Restart the machine");
}
}
//Changes state
hCars = "yellow";

//Demonstration in terminal
System.out.println("Pedestrian light H is: " + hPedestrians);
System.out.println("Cars light H is: " + hCars);
d1.button3.setBackground(Color.YELLOW);
d1.button4.setBackground(Color.YELLOW);


//Times the computer, system.out.println is only for demonstration purposes only
for(int i = 0; i<timeOfYellow; i++){
try {
    TimeUnit.SECONDS.sleep(1);
    System.out.println(i + " seconds passed");
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    System.out.println("Restart the machine");
}
}
//Changes state
hPedestrians = "red";
hCars = "red";

//Demonstration in terminal
System.out.println("Pedestrian light H is: " + hPedestrians);
System.out.println("Cars light H is: " + hCars);

d1.button3.setBackground(Color.RED);
d1.button4.setBackground(Color.RED);

d1.button6.setBackground(Color.RED);
d1.button7.setBackground(Color.RED);
d1.button5.setBackground(Color.RED);
d1.button8.setBackground(Color.RED);

}



//Verticle Lights
public void executeVerticleLights(){
    Demo d2 = new Demo();
    d2.main(null);
//Changes state
vPedestrians = "green";
vCars = "green";
d2.button1.setBackground(Color.GREEN);
d2.button2.setBackground(Color.GREEN);

d2.buttonp1.setBackground(Color.GREEN);
d2.buttonp3.setBackground(Color.GREEN);
d2.buttonp4.setBackground(Color.GREEN);
d2.buttonp2.setBackground(Color.GREEN);

//Demonstration in terminal
System.out.println("Pedestrian light V is: " + vPedestrians);
System.out.println("Cars light V is: " + vCars);


//Times the computer, system.out.println is only for demonstration purposes only
for(int i = 0; i<timeOfGreen; i++){
try {
    TimeUnit.SECONDS.sleep(1);
    System.out.println(i + " seconds passed");
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    System.out.println("Restart the machine");
}
}

//Changes state
vCars = "yellow";

//Demonstration in terminal
System.out.println("Pedestrian light V is: " + vPedestrians);
System.out.println("Cars light V is: " + vCars);
d2.button1.setBackground(Color.YELLOW);
d2.button2.setBackground(Color.YELLOW);

//Times the computer, system.out.println is only for demonstration purposes only
for(int i = 0; i<timeOfYellow; i++){
try {
    TimeUnit.SECONDS.sleep(1);
    System.out.println(i + " seconds passed");
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    System.out.println("Restart the machine");
}
}

//Changes state
vPedestrians = "red";
vCars = "red";

//Demonstration in terminal
System.out.println("Pedestrian light V is: " + vPedestrians);
System.out.println("Cars light V is: " + vCars);

d2.button1.setBackground(Color.RED);
d2.button2.setBackground(Color.RED);

d2.buttonp1.setBackground(Color.RED);
d2.buttonp3.setBackground(Color.RED);
d2.buttonp4.setBackground(Color.RED);
d2.buttonp2.setBackground(Color.RED);


}


//Get methods for traffic light conditions

public String getHCars(){
    return hCars;
}
public String getVCars(){
    return vCars;
}
public String getHPedestrians(){
    return hPedestrians;
}
public String getVPedestrains(){
    return vPedestrians;
}

public static void main(String[]args){
        
    mainprog traffic = new mainprog();

}


}

