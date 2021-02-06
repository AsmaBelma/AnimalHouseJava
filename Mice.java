class Mice extends Animal2 {
    public Mice(String name) {super(name);}
    public Mice(String name,int age) {super(name,age);}

    public void display(){
        System.out.println("I'm a mice");
        super.display();}

    public void noise(){
        System.out.println("krikri !");
        // super.noise();
    
    
}
}