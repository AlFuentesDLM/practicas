package Class4.Example1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GuardaRopa {
    private int contador;
    private HashMap<Integer,List<Prenda>> diccionario;

    public GuardaRopa() {
        this.contador = 0;
        this.diccionario = new HashMap<>();
    }

    public Integer guardarPrendas(List<Prenda> listaPrenda){
        diccionario.put(contador,listaPrenda);
        contador +=1;
        return contador;
    }
    public void mostrarPrenda(){
        System.out.println(diccionario.toString());
        for (Map.Entry element:diccionario.entrySet()) {
            System.out.println("Para el las prendas con key: "+element.getKey());
            List<Prenda> listaPrenda = (List<Prenda>) element.getValue();
            for (Prenda prenda: listaPrenda) {
                System.out.println(prenda.toString());
            }
        }
    }
    public List<Prenda> devolverPrenda(int idKey){
        try{
            List<Prenda> prendas = diccionario.get(idKey);
            if (prendas == null){
                throw new Error("Id key doesn't exist");
            }
            return prendas;
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }


}
