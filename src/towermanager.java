public class towermanager {

    private String dato;
    //private String sol1,sol2,sol3;

    public static String hanoi(int ndiscos, int detorre, int atorre){

        if(ndiscos == 1){
return detorre + " →"+ atorre +";";
        }
else {
            String sol1,sol2,sol3;
            int helpeg = 6 - detorre - atorre;

            sol1= hanoi(ndiscos-1,detorre,helpeg);
            sol2= detorre + " →"+ atorre +";";
            sol3= hanoi(ndiscos-1,helpeg,atorre);
            return sol1+sol2+sol3;
        }

    }
    public static void main(){

        int ndiscos  =3;
        String Solpaso = hanoi(ndiscos, 1,3);
        for (String paso : Solpaso.split(";")){
System.out.println(paso);

    }


    }
}
