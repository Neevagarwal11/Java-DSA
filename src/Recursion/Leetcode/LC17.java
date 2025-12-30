import java.util.ArrayList;

class LC17 {

    public static void main(String[] args) {

        // phone("", "12");
        System.out.println(phoneArrayList("", "12"));
    }


    static void phone(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0' ; //Converts '2' to 2;

        for(int i  = (digit-1)*3 ; i<digit *3  ; i++){

            char ch = (char) ('a' + i );

            phone(p + ch , up.substring(1));

        }
    }


    static ArrayList<String> phoneArrayList(String p , String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0' ; //Converts '2' to 2;

        ArrayList<String> list = new ArrayList<>();

        for(int i  = (digit-1)*3 ; i<digit *3  ; i++){

            char ch = (char) ('a' + i );

            list.addAll(phoneArrayList(p + ch , up.substring(1)));

        }
        return list;
    }


}