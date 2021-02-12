public class Animal {
	
    private int number;
    private String name;
    private int age;
    private boolean alive;

    static int counter=0;

    abstract public void noise ();

	public Animal(String name) {
	    this.alive = true;
	    this.name = n;
	    this.age = 0;
        this.counter++;
	    this.number = counter;
    }

    public Animal(String name, int age){
	    this.age = age;
	    this.alive = true;
	    this.name = chaine;
        this.counter++;
	    this.number = counter;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getAlive(){
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

	public String toString() {
		String result = "{";
		result += " name: " + name;
		result += " number: " + number;
		result += " age: " + age;
		result += (alive)?" alive":" dead";
		result + " }";
		return result;
    }

	public void kill() {
		alive = false;
	}

	public void makeOlder(int years) {
		age += years;
	}
}