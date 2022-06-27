public class grocery {

    public static int[] main(String[] args){
        int[] compras1 = {6, 2, 3};
        int Suma;
        int Scanini;
        int Menor;
        

        Suma= 0;
        Scanini=compras1[0];
        Menor=compras1[0];
        
        for(int i=0; i<compras1.length; i++ ){
            Suma=Suma+compras1[i];
            if(compras1[i]>Scanini){
                Scanini=compras1[i];           
            }
            if(compras1[i]<Menor){
                Menor=compras1[i];
            }
        }
        
        int[] solucion= {Suma, Scanini, Menor};
        
        
        return solucion;
        

    }
    
}
