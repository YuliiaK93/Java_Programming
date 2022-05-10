package day08_ternary_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 130;

        /*
        String result = "";
        if(score >= 0 && score <= 100){

            if(score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{
            result = "Invalid";
        }
        System.out.println(result);
*/

        String result = (score >= 0 && score <= 100)?
                            (score >= 60) ?  "Passed" : "Failed"
                        : "Invalid Score" ;

        System.out.println(result);
















    }

}
