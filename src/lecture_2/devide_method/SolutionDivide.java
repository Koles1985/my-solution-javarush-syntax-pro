package lecture_2.devide_method;

public class SolutionDivide {

    private Double posInf = Double.POSITIVE_INFINITY;
    private Double negInf = Double.NEGATIVE_INFINITY;
    private Double nan =Double.NaN;

    public void divide(double a, double b){
        Double res = getPosInf(a,b);
        if(res == null){
            res = getNegInf(a, b);
        }
        if (res == null) {
            res = getNan(a, b);
        }
        if(res == null){
            res = a/b;
        }
        System.out.println("Result = " + res);
    }

    private Double getPosInf(double a, double b){
        if(a > 0 & b == 0){
            return posInf;
        } else if(a == posInf & (b >= 0 & b != posInf)){
            return posInf;
        }else if(a == negInf & (b < 0  & b != negInf)){
            return posInf;
        }else {
            return null;
        }
    }

    private Double getNegInf (double a, double b){
        if(a < 0 & b == 0){
            return negInf;
        }else if(a == negInf & (b >= 0 & b != posInf)){
            return negInf;
        }else if(a == posInf & (b < 0 & b != negInf)){
            return negInf;
        }else {
            return null;
        }
    }

    private Double getNan(double a, double b){
        if(a == 0 & b == 0){
            return nan;
        }else if(a == nan | b == nan ){
            return nan;
        }else if(a == posInf & b == posInf){
            return nan;
        } else if (a == posInf & b == negInf) {
            return nan;

        } else if (a == negInf & b == posInf) {
            return nan;

        } else if (a == negInf & b == negInf) {
            return nan;
        }else {
            return null;        }
    }
}
