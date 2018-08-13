import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            String number = sc.nextLine();
            int n = Integer.parseInt(number);
            int result = 1;
            for (int i = 1 ; i <= n ; i++){

                int num = i*result;
                int index = 0;
                String nonZero = num + "";
                char[] chars = ("" + num).toCharArray();
                for (int j = chars.length - 1 ; j >= 0 ; j--){
                    if (chars[j] == '0'){
                        index = j;
                        nonZero = ("" + num).substring(0 , j);
                        continue;
                    }
                    else {

                        String temp = "";
                        char[] cha = nonZero.toCharArray();
                        int count = 0;
                        for (int b = cha.length - 1 ; b >= 0; b--){
                            temp += cha[b] + "";
                            count++;
                            if (count > 3){
                                break;
                            }
                        }
                        String finaltemp = "";
                        for (int z = temp.length() -1 ; z >=0 ; z--){
                            finaltemp = finaltemp + temp.charAt(z);
                        }
                        String ch = chars[j] + "";
                        String finalstr = finaltemp;
                        result = Integer.parseInt(finalstr);
                        break;
                    }
                }
            }
            char[] ch = (result + "").toCharArray();
            String st = "";
            for (int i = ch.length - 1 ; i >= 0 ; i-- ){
                if (ch[i] == '0'){
                    continue;
                }
                else {
                    st = ch[i] + "";
                    break;
                }
            }
            result = Integer.parseInt(st);
            System.out.println(result);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
