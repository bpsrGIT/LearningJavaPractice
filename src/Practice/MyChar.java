package Practice;

public class MyChar {
    boolean vowel;
    boolean isNumberResult;
    boolean isAlphabetResult;
    char charInput;
    static String lowerCaseAlphabets = "a, b, c, d, e,f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";
    static String upperCaseAlphabets = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";

    MyChar(char a){
        charInput = a;
    }

    void isVowel(){
        if(
            charInput == 'a' || 
            charInput == 'e' || 
            charInput == 'i' || 
            charInput == 'o' || 
            charInput == 'u' || 
            charInput == 'A' ||
            charInput == 'E' ||
            charInput == 'I' ||
            charInput == 'O' ||
            charInput == 'U'
        ){ 
            // vowel = true; 
            System.out.println("true");
        } else { 
            // vowel =  false; 
            System.out.println("false");
        }
        // System.out.println(vowel);
    }

    void isNumber(){
        if(charInput / 1 == charInput){
            // isNumberResult = true;
            System.out.println("true");
        } else {
            // isNumberResult = false;
            System.out.println("false");
        } 
    }

    void isAlphabet(){
        if(charInput / 1 == charInput){
            // isAlphabetResult = false;
            System.out.println("false");
        } else {
            // isAlphabetResult = true;
            System.out.println("true");
        } 
    }

    public static void printLowerCaseAlphabets(){
        System.out.println(lowerCaseAlphabets);
    }

    public static void printUpperCaseAlphabets(){
        System.out.println(upperCaseAlphabets);
    }
}
