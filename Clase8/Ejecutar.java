public class Ejecutar {

    public static void main(String[] args) {
        
    Cuenta objcuenta1 = new Cuenta ("790032-1", 0);
    Cuenta objcuenta2 = new Cuenta ("400234-3",987.1);

    System.out.println(objcuenta1);
    System.out.println(objcuenta2);

    System.out.println(objcuenta1.mostrarSaldo());
    System.out.println(objcuenta2.mostrarSaldo());

    Cliente objcliente1 = new Cliente ( "110515162", "Miguel", 2000);
    Cliente objcliente2 = new Cliente ( "110515555", "Laura", 2006);

    System.out.println(objcliente1);
    System.out.println(objcliente2);

    Banco objBanco1 = new Banco ("Mis Ahorros", 26789876, objcuenta1);
    System.out.println(objBanco1);
    objBanco1.consultarCliente(objcliente1);
    

    }
}
