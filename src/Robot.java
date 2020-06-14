public class Robot {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    void run(){
        System.out.println(name + " run");
    }

    void jump(){
        System.out.println(name + " jump");
    }
}
