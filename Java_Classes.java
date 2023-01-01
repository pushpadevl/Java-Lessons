interface Animals {
    // (1) Every method in the implementing class should be noted here first
    //Like this
    void makeSound();
}
class Dog implements Animals{
    public void makeSound(){
        System.out.println("woof");
    }
}
class Cat implements Animals{
    public void makeSound(){
        System.out.println("meow");
    }
}
class Java_Classes{
    public static void main(String [] ags){
        Animals[] anims = new Dogs[2]; // (2) Will not work
        Animals[] anims = new Animals[2]; //this will
        anims[0] = new Cat();
        anims[1] = new Dog();
        anims[0].makeSound();
        anims[1].makeSound();
        
    }
}