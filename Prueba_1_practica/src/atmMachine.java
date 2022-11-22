import javax.swing.JOptionPane;
public class atmMachine {

    private String nombre;
    private String n_cuenta;
    private double saldo;

    /*CONSTRUCTOR*/
    public atmMachine(){
        nombre = "user1";
        n_cuenta = "1";
        saldo = 0.0;
    }

    //MÉTODOS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        if( Integer.parseInt(n_cuenta) > 0){
            this.n_cuenta = n_cuenta;
        }else{
            this.n_cuenta = "0";
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo > 0){
            this.saldo = saldo;
        }

    }


    public void retiro(double monto){
        if(monto > 0 && monto < this.saldo){
            this.saldo -= monto;
        }
    }//fin de retiro

    public  void deposito( double monto){
        if(  monto > 0){

            setSaldo(getSaldo() + monto);

            JOptionPane.showMessageDialog(null, "El usuario: "
                            + getNombre() + "\n Tiene: " +getSaldo() + " dólares");
        }
    }//fin de depósito



    public void estadoCuenta(){
        JOptionPane.showMessageDialog(null, "Usuario: " +
                getNombre() +
                " \nNúmero de Cuenta: " + getN_cuenta() +
                "\n Saldo Total: " + getSaldo());
    }//fin de estado de cuenta


    public void Crear_datos(){
        JOptionPane.showMessageDialog(null, "Ingrese los datos de su cuenta");
        setNombre(JOptionPane.showInputDialog("Ingrese su nombre:"));
        setN_cuenta(JOptionPane.showInputDialog("Ingrese su número de cuenta:"));
        setSaldo( Double.parseDouble(JOptionPane.showInputDialog("Ingrese su saldo inicial:")) );
    }

}//fin de la clase
