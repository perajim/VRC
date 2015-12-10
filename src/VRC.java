public class VRC
{
  
    String  [] letras;
    
    
    public String[] convertirBinario(String texto){
        String n;
        int x=0, z=texto.length();
        String [] far = new String[z];
        for (int i=0; i<texto.length(); i++){        
            x=texto.charAt(i);
            n=Integer.toBinaryString(x);
            far[i]=n;
        }
        return far;        
    }       
    
    public  int contar(String cadena){
            int aux=0;            
           char caracter= '1';
            for (int i=0;i<cadena.length();i++){
                if (cadena.charAt(i)==caracter){
                    aux++;
                }
            }
            return aux;
        }    
    public  String ruido(String n,int f){  
        String nuevo_n=null;
        if(n.charAt(f)=='0'){
          nuevo_n=n.substring(0,f)+"1"+n.substring(f+1);
        }else{
           nuevo_n=n.substring(0,f)+"0"+n.substring(f+1);
        }
        return nuevo_n;
    }      
    
    public static int contarVrc(String cadena){
             int aux=0;            
           char caracter= '1';
            for (int i=0;i<cadena.length();i++){
                if (cadena.charAt(i)==caracter){
                    aux++;
                }
            }
            return aux;
    }
    public  boolean comprobar(String [] cadena){
        int paridad =0, vb=0;
               for(int i=0;i<cadena.length;i++){
            paridad=this.contar(cadena[i]);
            if(paridad%2==0){
             vb++;
            }
        }
        if(vb==cadena.length){
            return true;
        }else{
            return false;
        }
           
    }
    
    public String cortar(String nob){
        String jumex;
            jumex= nob.substring(4,nob.length());
            return jumex;        
    }
}
