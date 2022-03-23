public class Vehicle {
    
    private int speed;
    private int distance;
    private int gear;
    private final String[] directions = {"North", "East", "South", "West"};
    private int direction;

    Vehicle(){
        this.speed = 0;
        this.distance = 0;
        this.gear = 0;
        this.direction = 0;
    }
    
    public void accelerate(){
        this.speed = this.speed + 10 > 100 ? 100 : this.speed + 10;
    }

    public void accelerate(int a){
        this.speed = this.speed + a > 100 ? 100 : this.speed + a;
    }
    
    public void decelerate(){
        this.speed = this.speed - 10 >= 0? this.speed - 10 : 0;
    }

    public void decelerate(int b){
        this.speed = this.speed - b >= 0? this.speed - b : 0;
    }

    public void turnRight(){
        this.direction = (this.direction + 1) % 4;
    }

    public void turnLeft(){
        if(this.direction == 0)
           this.direction = 4;
        else
            this.direction--;
    }
    
    public void changeGear(boolean upshift){
        if(upshift && this.gear < 6)
            this.gear++;
        else if(!upshift && this.gear > 0)
            this.gear--;
    }

    public void drive(int time){
        this.distance += time * this.speed;
    }
    
    public int getSpeed(){
        return this.speed;
    }

    public int getDistance(){
        return this.distance;
    }

    public String getDirection(){
        return directions[direction];
    }

}

//// Program should be able to handle steering, changing gears, and drive (having speed in other words).
//// You might decide where to put the appropriate state and behaviours (fields and methods).
//// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.