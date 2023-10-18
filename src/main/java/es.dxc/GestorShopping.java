package es.dxc;

public class GestorShopping {

    public static void main(String[] args) {
        System.out.println("SIMULADOR DE SHOPPING");

        ShoppingCart sc = new ShoppingCart();
        Product p1 = new Product("Tablet",100);
        Product p2 = new Product("Movil",200);
        Product p3 = new Product("libro",500);



        if (sc.getItemCount() == 0){
            sc.empty();
        }

        sc.addItem(p1);

        sc.addItem(p2);

    }
}
