//Complete the solution so that it reverses the string passed into it.
//
//        'world'  =>  'dlrow'
//        'word'   =>  'drow'

class Kata3 {

    public static String solution(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

}
