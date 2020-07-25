public class VendedorTeste {

    public static void imprimeTabela(Vendedor vendedores[]){
        
        for (int i = 0; i < vendedores.length; i += 3 ){
            System.out.printf("%s\t %.1f\t %.1f\t %.1f\t %.1f\t \n", vendedores[i].getNome(),
             vendedores[i].getTotal(),
              vendedores[i+1].getTotal(),
               vendedores[i+2].getTotal(),
               (vendedores[i].getTotal() + vendedores[i+1].getTotal() + vendedores[i+2].getTotal()));
                }
        
        
        //System.out.printf("Nome: %s Numero do Produto: %d Total: %.2f\n ", vendedores.getNome(),
        //    vendedores.getNumero(), vendedores.getTotal());
    }
    public static void main(String[] args) {
        
        Vendedor vendedores []  = new Vendedor [12];
        vendedores [0] = new Vendedor("José", 1, 250.0);
        vendedores [1] = new Vendedor("José", 2, 50.0);
        vendedores [2] = new Vendedor("José", 3, 250.0);
        vendedores [3] = new Vendedor("Jorge", 1, 175.0);
        vendedores [4] = new Vendedor("Jorge", 2, 150.0);
        vendedores [5] = new Vendedor("Jorge", 3, 100.0);
        vendedores [6] = new Vendedor("Maria", 1, 125.0);
        vendedores [7] = new Vendedor("Maria", 2, 50.0);
        vendedores [8] = new Vendedor("Maria", 3, 130.0);
        vendedores [9] = new Vendedor("Eduarda", 1, 90.0);
        vendedores [10] = new Vendedor("Eduarda", 2, 25.0);
        vendedores [11] = new Vendedor("Eduarda", 3, 300.0);

        imprimeTabela(vendedores); 

        
        
    }
    
}