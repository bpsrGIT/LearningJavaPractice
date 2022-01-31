package Trial;

public class MyChar {
    private char ch;
//    static String lowerCaseAlphabets = "a, b, c, d, e,f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";
//    static String upperCaseAlphabets = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";

    MyChar(char ch){
        this.ch = ch;
    }

    public boolean isVowel(){
        if(
            ch == 'a' || 
            ch == 'e' || 
            ch == 'i' || 
            ch == 'o' || 
            ch == 'u' || 
            ch == 'A' ||
            ch == 'E' ||
            ch == 'I' ||
            ch == 'O' ||
            ch == 'U'
        ) { 
             return true;
        } else { 
             return false;
        }
    }
    
    public boolean isConsonant(){
    	if(isVowel() == false && isAlphabet() == true)
    		return true;
    	return false;
    }

    public boolean isNumber(){
    	if(ch >= 48 && ch <= 57)// between'0' and '9'
    		return true;
    	return false;
    	
    	
//   my solution 	
//        if(this.ch / this.ch == '1'){
//             return true;
//        } else {
//             return false;
//        }
    }

    public boolean isAlphabet(){
    	if(ch >= 65 && ch <= 90)// between'0' and '9'
    		return true;
    	if  (ch >= 97 && ch <= 122)
    		return true;
    	return false;
    	
//    	whats wrong here is this.ch is char meaning it cant be divided
//        if(this.ch / this.ch == '1'){
//             return false;
//        } else {
//             return true;
//        }
    }

    public static void printLowerCaseAlphabets(){
        for(char ch = 'a'; ch <= 'z'; ch++) {
        	System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets(){
    	for(char ch = 'A'; ch <= 'Z'; ch++) {
    		System.out.println(ch);
    	}
    	
    	
//        System.out.println(lowerCaseAlphabets.toUpperCase());
    }
}
