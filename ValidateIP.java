public class ValidateIP {
    static boolean validateIP(String ip) {
        // your code goes here
        String[] arr = ip.split("\\.");
        if(arr.length !=4){
            return false;
        }
        try{
            int ipA= Integer.parseInt(arr[0]);
            int ipB= Integer.parseInt(arr[1]);
            int ipC= Integer.parseInt(arr[2]);
            int ipD= Integer.parseInt(arr[3]);
            if(ipA<0 || ipA >255){
                return false;
            }
            if(ipB<0 || ipB >255){
                return false;
            }
            if(ipC<0 || ipC >255){
                return false;
            }
            if(ipD<0 || ipD >255){
                return false;
            }
        }catch(Exception e){
            return false;
        }
        return true;



    }

    public static void main(String[] args) {
        System.out.println(validateIP("192.168.0.1"));
    }
}
