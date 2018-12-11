public class Amu extends Player {
    private String name;

    public Amu(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double check() {
        double result = 0;
        result = Math.floor(Math.random() * 26);

        return result;


    }
}
