import java.util.Scanner;
class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("Enter half: ");
                double half=sc.nextDouble();
                System.out.print("Enter height: ");
                double h=sc.nextDouble();
                System.out.print("Enter base: ");
                double base=sc.nextDouble();
                System.out.println(Area.areaOfTri(half,h,base));
                break;
            case 2:
                System.out.print("Enter side: ");
                double s=sc.nextDouble();
                System.out.println(Area.areaOfSq(s));
                break;
            case 3:
                System.out.print("Enter length: ");
                double l=sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b=sc.nextDouble();
                System.out.println(Area.areaOfRect(l,b));
                break;
            case 4:
                System.out.print("Enter pie: ");
                double p=sc.nextDouble();
                System.out.print("Enter radius: ");
                double r=sc.nextDouble();
                System.out.println(Area.areaOfCircle(p,r));
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
    public static double areaOfTri(double half, double h, double b){
        return half*h*b;
    }
    public static double areaOfSq(double s){
        return s*s;
    }
    public static double areaOfRect(double l, double b){
        return l*b;
    }
    public static double areaOfCircle(double p, double r){
        return p*r*r;
    }
}
