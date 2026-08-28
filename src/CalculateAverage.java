public class CalculateAverage {
    public static double calculateAverage(double n,double m,double q){
        return (n+m+q)/3;
    }
    public static void main(String[] args){
        double avg = calculateAverage(15.4,6.6,17.8);
        System.out.println("the avg :" + avg);
    }
}
