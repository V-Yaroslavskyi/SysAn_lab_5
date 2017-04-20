package sample;

import com.sun.istack.internal.NotNull;

/**
 * Created by pslan on 13.02.2017.
 */
public class Util {

    public static double max(double[] x){
        double res = Double.MIN_VALUE;
        for (int i=0; i<x.length; i++){
            if (x[i]>res){
                res = x[i];
            }
        }
        return res;
    }

    public static double min(double[] x){
        double res = Double.MAX_VALUE;
        for (int i=0; i<x.length; i++){
            if (x[i]<res){
                res = x[i];
            }
        }
        return res;
    }
}
