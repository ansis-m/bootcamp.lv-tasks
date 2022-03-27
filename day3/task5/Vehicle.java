   public class Vehicle {
    
    protected int speed;
    protected int distance;
    protected int gear;
    protected final String[] directions = {"North", "East", "South", "West"};
    protected int direction;

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
        System.out.printf("The current speed is %d\n", this.speed);
        return this.speed;
    }

    public int getDistance(){
        System.out.printf("The distance so far is %d\n", this.distance);
        return this.distance;
    }

    public String getDirection(){
        System.out.printf("The current direction is %s\n", this.directions[direction]);
        return directions[direction];
    }

}
