package u5pp;

public class MyMath{
    static int abs(int x){
        if(x < 0){
            return 0 - x;
        }
        return x;
    }
    static double abs(double x){
        if(x < 0.0){
            return 0.0 - x;
        }
        return x;
    }
    
    static double pow(double base, int exponent){
        double result = 1.0;
        for(int i = 0; i < exponent; i++){
            result = result * base;
        }
    return result;
    }

    static int perfectSqrt(int x){
        if(x == 0){
            return 0;
        }
        if(x < 0){
            return -1;
        }
        for(int e = 0; i < x; e++){
            if(e * e > x){
                return -1; 
            }
            if (e * e == x){
                return e;
            }
        }
        return -1;
    }
}