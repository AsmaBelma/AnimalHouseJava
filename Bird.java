class Bird extends Animal2 {
    public Bird(String name) {super(name);}
    public Bird(String name,int age) {super(name,age);}

    public void display(){
        System.out.println("I'm a bird");
        super.display();}

    public void noise(){
        System.out.println("Cuicui !");
        // super.noise();
    }
}
