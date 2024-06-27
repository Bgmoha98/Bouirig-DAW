package verifica_ip;

public class TestVerificaIp {

    public static void main(String[] args) {
        
        VerificadorIp verificador = new VerificadorIp();
        String ip = "123.222.44.23";
        
        System.out.println(ip + ": " + verificador.isIp(ip));
        ip = "aaa.222.44.23";
        
        System.out.println(ip + ": " + verificador.isIp(ip));
        
        ip = "222.44.23";
        
        System.out.println(ip + ": " + verificador.isIp(ip));
        
    }

}
