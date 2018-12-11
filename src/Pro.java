public class Pro extends Player {
    private String name;

    public Pro(String name){
        this.name=name;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double check(){
        double result=0;
        result = Math.floor(Math.random() * 76);

//Samer and jan reach the final and Samer wins
     /*if(this.name.equals("Samer")){
        result = Math.floor(Math.random() * 100+200);


  }
if(this.name.equals("Jan")){
   result = Math.floor(Math.random() * 80+99);
}
*/

        return result;


    }

}
