
public class DefangIP {
    public static void main(String[] args) {
        String ip = "10.100.152.1";

        System.out.println(defangIPaddr(ip));
    }


    // public static String defangIPaddr(String address) {
    //     String newIp = "";
    //     for (int i = 0; i < address.length(); i++) {
    //         if (address.charAt(i) == '.') {
    //             newIp = newIp + "[.]";
    //         }else newIp = newIp + address.charAt(i);
    //     }


    //     return newIp;
    // }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
