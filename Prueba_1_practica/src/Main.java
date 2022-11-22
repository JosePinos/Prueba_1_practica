import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {


        atmMachine cliente_1 = new atmMachine();
        cliente_1.Crear_datos();

        int opcion = 1;
        while(opcion != 0){

            opcion = Menu();
            switch (opcion){
                case 1:{
                    JOptionPane.showMessageDialog(null,"DEPÓSITO");
                    cliente_1.deposito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad " +
                            "de dinero a depositar")) );

                    cliente_1.estadoCuenta();
                }
                break;


                case 2:{
                    JOptionPane.showMessageDialog(null,"RETIRO");
                    cliente_1.retiro(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad " +
                            "de dinero a retirar")) );
                    cliente_1.estadoCuenta();
                }
                break;


                case 3:{
                    JOptionPane.showMessageDialog(null,"ESTADO DE CUENTA");
                    cliente_1.estadoCuenta();
                }
                break;


                case 0:{
                    JOptionPane.showMessageDialog(null,"VUELVA PRONTO");
                }
                break;


                default:{
                    JOptionPane.showMessageDialog(null,"Algo ha salido muy mal");
                }
                break;

            }//fin del switch

        }//fin del while



    }//fin del método de main

    public static int Menu(){
        int opcion = 0;
        opcion = Integer.parseInt( JOptionPane.showInputDialog("\n\tBienvenido al ATM\n" +
                "1) Depósito \n2) Retiro \n3) Estado de Cuenta \n0) SALIR") );

        return opcion;
    }//FIN DEL MÉTODO MENU

}